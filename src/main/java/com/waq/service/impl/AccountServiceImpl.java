package com.waq.service.impl;

import com.waq.dao.AccountDao;
import com.waq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 账户的业务层实现类
 * xml的配置
 * <bean id="accountService" class="com.waq.service.impl.AccountServiceImpl"
 * scope="" init-method="" destroy-method="">
 * <property name="" value="" | ref=""/>
 * </bean>
 * <p>
 * 用于创建对象的
 *
 * @Component 作用：将当前对象存入spring容器中
 * @Controller：一般用于表现层
 * @Service：一般用于业务层
 * @Repository：一般用于持久层 spring提供的明确的三层使用的注解
 * 用于注入数据的
 * @Autowried: 作用：自动按照类型注入。
 * 如果ioc容器中没有任何bean的类型和要注入的变量类型匹配，则报错
 * 如果ioc容器中有多个bean类型匹配，则对照id，否则出错
 * @Qualifier 作用：在按照类型注入的基础上再按照名称注入。在给类成员注入时不能单独使用，但是在给方法参数注入时可以
 * @Resource 作用：直接按照bean的id注入
 * 以上三个注解只能注入bean类型的数据，基本类型和string类型无法使用上述注解实现
 * 另外，集合类型的注入只能用xml实现
 * @Value 作用：用于注入基本类型和string类型
 * 用于改变作用范围的
 * @Scope 作用：用于指定bean的作用范围
 * 生命周期相关的
 * @PreDestory 作用：
 * @PostConstruct 作用：
 */

@Service
@Scope
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Qualifier("accountDaoImpl")
    private AccountDao accountDao;

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }
    
    public void saveAccount() {
        accountDao.saveAccount();
    }

}
