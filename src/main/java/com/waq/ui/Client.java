package com.waq.ui;

import com.waq.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        // 获取核心容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        // 根据id获取bean对象
        AccountService accountService = applicationContext.getBean("accountServiceImpl", AccountService.class);
        accountService.saveAccount();

    }

}
