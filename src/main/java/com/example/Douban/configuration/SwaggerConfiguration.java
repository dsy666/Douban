package com.example.Douban.configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description:
 *
 * @author Mr.Du
 * @version 1.0
 * @date 2019/11/23
 * @since JDK 1.8
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    @ConditionalOnMissingBean(Docket.class)
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.Douban.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建API的基本信息
     *
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("豆瓣项目RESTful APIs")
                .description("豆瓣项目api接口文档")
                .version("1.0")
                .build();
    }

}
