package com.gshine.jsonrpc4j;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gshine
 * @since 2018/12/11 17:15
 */
@Configuration
public class JsonRpcConfig {

    @Bean
    public AutoJsonRpcServiceImplExporter autoJsonRpcServiceImplExporter(){
        return new AutoJsonRpcServiceImplExporter();
    }
}
