package cn.itsource.crm.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages="cn.itsource.crm.web.controller")
public class SwaggerConfig {


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.itsource.crm.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    

    private ApiInfo apiInfo(){
         @SuppressWarnings("deprecation")
        ApiInfo info=new ApiInfo(
                 "CRM所需要的全部接口",
                 "老赵所写文档",
                 "1.0",
                 "www.itsource.cn",
                 "老赵",
                 "x",
                 "x");
         return info;
    }
}