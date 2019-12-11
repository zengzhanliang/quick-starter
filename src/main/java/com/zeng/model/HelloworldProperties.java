package com.zeng.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置类
 * @author zengzhanliang
 */
@ConfigurationProperties(prefix = "helloworld")
public class HelloworldProperties {
    public static final String DEFAULT_WORDS = "world";

    private String words = DEFAULT_WORDS;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}