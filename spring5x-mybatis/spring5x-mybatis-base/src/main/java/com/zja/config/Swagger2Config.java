package com.zja.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ZhengJa
 * @description spring5.x集成swagger2 API 测试功能
 * @data 2019/10/22
 */
@Component
@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages = {"com.zja.controller"})
public class Swagger2Config extends WebMvcConfigurationSupport {

    @Value("${swaggerShow}")
    private boolean swaggerShow;

    @Bean
    public Docket createRestApi() {
        return new Docket(
                DocumentationType.SWAGGER_2)
                .enable(swaggerShow)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Zhengja", "https://www.jianshu.com/u/70d69269bd09", "1263598336@qq.com");
        return new ApiInfoBuilder()
                .title("Swagger2 API 测试")
                .description("宇宙小神特别萌")
                .contact(contact)
                .version("V_1.0.1")
                .build();
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (this.swaggerShow) {
            registry.addResourceHandler("/swagger-ui.html").addResourceLocations(
                    "classpath:/META-INF/resources/");
            registry.addResourceHandler("/webjars/**").addResourceLocations(
                    "classpath:/META-INF/resources/webjars/");
        }
    }

}
