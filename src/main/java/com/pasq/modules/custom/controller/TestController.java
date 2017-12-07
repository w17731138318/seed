package com.pasq.modules.custom.controller;

import com.pasq.modules.sys.controller.AbstractController;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;

import com.pasq.modules.custom.entity.TestEntity;
import com.pasq.modules.custom.service.TestService;
import com.pasq.common.utils.PageUtils;
import com.pasq.common.utils.Query;
import com.pasq.common.utils.R;


/**
 * 
 * 
 * @author 王伟鑫
 * @version 0.1v
 * @email wangweixin@pasq.com
 * @create 2017-12-02 15:01:46
 */
@RestController
@RequestMapping("test")
public class TestController extends AbstractController {
	@Autowired
	private TestService testService;
	
	/**
	 * 列表
	 */
	@GetMapping("/list")
	@RequiresPermissions("test:list")
	@ApiOperation(value="分页查询", notes="分页查询Test")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<TestEntity> testList = testService.queryList(query);
		int total = testService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(testList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@GetMapping("/info/{id}")
	@RequiresPermissions("test:info")
	@ApiOperation(value="获取Test对象", notes="根据Test的ID查询")
	@ApiImplicitParam(name = "id", value = "Test对象ID", required = true, dataType = "Long")
	public R info(@PathVariable("id") Long id){
		TestEntity test = testService.queryObject(id);
		
		return R.ok().put("test", test);
	}
	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	@RequiresPermissions("test:save")
	@ApiOperation(value="创建Test", notes="根据Test对象创建")
	@ApiImplicitParam(name = "Test", value = "Test详细实体", required = true, dataType = "Test")
	public R save(@RequestBody TestEntity test){
		testService.save(test);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@PostMapping("/update")
	@RequiresPermissions("test:update")
	@ApiOperation(value="更新Test", notes="根据Test对象更新")
	@ApiImplicitParam(name = "Test", value = "Test详细实体", required = true, dataType = "Test")
	public R update(@RequestBody TestEntity test){
		testService.update(test);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@DeleteMapping("/delete")
	@RequiresPermissions("test:delete")
	@ApiOperation(value="删除Test", notes="根据Test的ID删除")
	@ApiImplicitParam(name = "ID", value = "Test对象的ID", required = true, dataType = "Long")
	public R delete(@RequestBody Long[] ids){
		testService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
