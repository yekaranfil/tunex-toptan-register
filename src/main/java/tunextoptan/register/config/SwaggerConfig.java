/*
 *
 *
 *  *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *  *
 *  *  Copyright (C) 2022 Terra Yazılım Ltd Şti - All Rights Reserved
 *  *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  *  Proprietary and confidential.
 *  *
 *  *  Written by Yusuf Emre Karanfil  <yekaranfil@terrayazilim.com.tr>, September 2022
 *
 */

package tunextoptan.register.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.Serializable;

@Configuration
@EnableSwagger2
//localhost:8081/swagger-ui/
public class SwaggerConfig implements Serializable {



    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage("tunextoptan.register"))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }


}


