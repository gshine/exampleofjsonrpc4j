package com.gshine.jsonrpc4j.service.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import com.gshine.jsonrpc4j.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author gshine
 * @since 2018/12/11 17:14
 */
@Service
@AutoJsonRpcServiceImpl
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello";
    }
}
