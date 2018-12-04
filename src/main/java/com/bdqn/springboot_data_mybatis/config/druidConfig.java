package com.bdqn.springboot_data_mybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 贺威
 * @create 2018-12-04 19:58
 */
@Configuration
public class druidConfig {


    /**
     * 配置druid数据
     * @return
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource  druid(){

        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean registrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        Map<String,String> initPropers=new HashMap<>();
        initPropers.put("loginUsername", "admin");
        initPropers.put("loginPassword", "123");
        initPropers.put("allow", "");
        initPropers.put("deny", "192.168.245.132");
        bean.setInitParameters(initPropers);
        return bean;
    }

    /**
     * 拦截器
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String, String> initPropers = new HashMap<>();
        //不拦截的
        initPropers.put("exclusions", "*.js,*.css,/druid/*");
        bean.setInitParameters(initPropers);
        bean.setUrlPatterns(Arrays.asList("/*"));

        return bean;
    }
}
