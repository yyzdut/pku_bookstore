package com.pkurw.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author yuyizhe <yyz@stu.pku.edu.cn>
 * Created on 2022-04-17
 * @description：配置swagger
 */
@Configuration
public class SwaggerConfig {
    @Bean

    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pkurw.bookstore.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("益行书屋API接口文档")
                .contact(new Contact("喻祎哲", "https://github.com/yyzdut",
                        "yyz@stu.pku.edu.cn"))
                .version("1.0")
                .description("益行书屋API描述")
                .build();
    }
}

