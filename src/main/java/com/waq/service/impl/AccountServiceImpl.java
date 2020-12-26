package com.waq.service.impl;

import com.waq.dao.AccountDao;
import com.waq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 账户的业务层实现类
 * xml的配置
 *      <bean id="accountService" class="com.waq.service.impl.AccountServiceImpl"
 *          scope="" init-method="" destroy-method="">
 *          <property name="" value="" | ref=""/>
 *      </bean>
 *
 * 用于创建对象的
 *      @Component
 *          作用：将当前对象存入spring容器中
 *      @Controller：一般用于表现层
 *      @Service：一般用于业务层
 *      @Repository：一般用于持久层
 *      spring提供的明确的三层使用的注解
 * 用于注入数据的
 * 用于改变作用范围的
 * 生命周期相关的
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }

}
