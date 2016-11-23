package com.baidu.bpit.dubbo.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Dubbo Consumer设置
 * Created by chenshouqin on 2016-11-22 21:32.
 */
@Configuration
public class DubboConfiguration {

    /**
     * 设置dubbo扫描包
     *
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.dubbo.consumer.scan", ignoreUnknownFields = true)
    public static AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        return annotationBean;
    }

    /**
     * 注入dubbo上下文
     *
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.dubbo.application.config", ignoreUnknownFields = true)
    public ApplicationConfig applicationConfig() {
        // 当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        return applicationConfig;
    }

    /**
     * 注入dubbo注册中心配置,基于zookeeper
     *
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.dubbo.registry.config", ignoreUnknownFields = true)
    public RegistryConfig registryConfig() {
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        return registry;
    }

    /**
     * dubbo服务提供
     *
     * @param applicationConfig
     * @param registryConfig
     * @return
     */
    @Bean(name = "defaultConsumer")
    @ConfigurationProperties(prefix = "spring.dubbo.consumer.config", ignoreUnknownFields = true)
    public ConsumerConfig consumerConfig(ApplicationConfig applicationConfig, RegistryConfig registryConfig) {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setApplication(applicationConfig);
        consumerConfig.setRegistry(registryConfig);
        return consumerConfig;
    }
}
