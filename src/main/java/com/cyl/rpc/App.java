package com.cyl.rpc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RpcPoxyClient rpcPoxyClient = new RpcPoxyClient();
        IHelloService iHelloService = rpcPoxyClient.clientProxy(IHelloService.class, "127.0.0.1", 8080);
        String result = iHelloService.sayHello("yuliang");
        System.out.println(result);
    }
}
