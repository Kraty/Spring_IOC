package com.waq.dao.impl;

import com.waq.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    public void saveAccount() {
        System.out.println("保存了账户");
    }

}
