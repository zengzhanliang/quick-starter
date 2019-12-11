package com.zeng.config;

import com.zeng.model.HelloworldProperties;
import com.zeng.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动化配置类
 * @author zengzhanliang
 */
@Configuration
@ConditionalOnClass({HelloworldService.class})
@EnableConfigurationProperties(HelloworldProperties.class)
public class HelloworldAutoConfiguration {


    @Autowired
    private HelloworldProperties hellowordProperties;

    @Bean
    @ConditionalOnMissingBean(HelloworldService.class)
    public HelloworldService helloworldService() {
        HelloworldService helloworldService = new HelloworldService();
        helloworldService.setWords(hellowordProperties.getWords());
        return helloworldService;
    }
}
