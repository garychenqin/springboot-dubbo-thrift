package com.baidu.bpit.dubbo.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Dubbo Provider设置
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
    @ConfigurationProperties(prefix = "spring.dubbo.scan.config", ignoreUnknownFields = true)
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
     * 默认基于dubbo协议提供服务
     *
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.dubbo.protocol.config", ignoreUnknownFields = true)
    public ProtocolConfig protocolConfig() {
        // 服务提供者协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        return protocolConfig;
    }

    /**
     * dubbo服务提供
     *
     * @param applicationConfig
     * @param registryConfig
     * @param protocolConfig
     * @return
     */
    @Bean(name = "defaultProvider")
    @ConfigurationProperties(prefix = "spring.dubbo.provider.config", ignoreUnknownFields = true)
    public ProviderConfig providerConfig(ApplicationConfig applicationConfig, RegistryConfig registryConfig, ProtocolConfig protocolConfig) {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setApplication(applicationConfig);
        providerConfig.setRegistry(registryConfig);
        providerConfig.setProtocol(protocolConfig);
        return providerConfig;
    }
}
