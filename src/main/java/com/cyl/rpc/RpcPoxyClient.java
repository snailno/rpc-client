package com.cyl.rpc;

import java.lang.reflect.Proxy;

/**
 * @Author Administrator
 * @Date 2020/9/8 22:00
 * @Version 1.0
 */
public class RpcPoxyClient {
    public <T> T clientProxy(Class<T> interfacecls,String host,int port){
        return (T) Proxy.newProxyInstance(interfacecls.getClassLoader(),
                new Class<?>[]{interfacecls},new RemoteInvocationHandler(host,port));
    }
}
