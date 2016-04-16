package com.haoyifen.mySSMTemplate;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by haoyifen on 2016/4/14 0014.
 */
public class proxyTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setInterfaces();
        proxyFactory.setOptimize(false);
        proxyFactory.getProxy();
    }
}
