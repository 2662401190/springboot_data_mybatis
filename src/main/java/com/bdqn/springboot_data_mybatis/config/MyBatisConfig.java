package com.bdqn.springboot_data_mybatis.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 贺威
 * @create 2018-12-06-9:59
 */
@Configuration
public class MyBatisConfig {

    /**
     * Mybatis 开启驼峰命名法
     * @return
     */
    @Bean
    public ConfigurationCustomizer customizer(){

        return    new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                // 驼峰命名打开
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };

    }
}
