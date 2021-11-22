package org.youngmonkeys.spring_boot_example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.youngmonkeys.spring_boot_example.interceptor.LogInterceptor;

@Configuration
public class GlobalWebConfig implements WebMvcConfigurer {

    @Autowired
    private LogInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
