package com.william.devx.core;

import com.william.devx.Devx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {FreeMarkerAutoConfiguration.class, GsonAutoConfiguration.class, WebSocketServletAutoConfiguration.class})
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@EnableCaching(proxyTargetClass = true)
@ComponentScan(basePackageClasses = Devx.class)
public abstract class DevxBootApplication {

    // 显示注入，确保最高优先级
    @Autowired
    private Devx devx;

}
