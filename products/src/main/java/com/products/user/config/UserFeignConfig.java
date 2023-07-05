package com.products.user.config;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;

public class UserFeignConfig {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }

}
