package com.pasq.config;/**
 * Created by Administrator on 2017/12/1.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2Config
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-01 9:39
 * @see
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {
//	@Bean
//	public Docket createRestApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.apiInfo(apiInfo())
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.pasq.modules"))
//				.paths(PathSelectors.any())
//				.build();
//	}
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder()
//				.title("RESTful APIs")
//				.description("Apis")
//				.termsOfServiceUrl("http://www.xxx.com/")
//				.contact(new Contact("王伟鑫","URL","wangweixin@pasq.com"))
//				.version("1.0")
//				.build();
//	}
}
