package com.gshine.jsonrpc4j.service;

import com.googlecode.jsonrpc4j.JsonRpcService;

/**
 * @author gshine
 * @since 2018/12/11 17:13
 */
@JsonRpcService("/hello")
public interface HelloService {
    String hello();
}
