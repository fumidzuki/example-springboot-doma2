package com.example.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.DatabaseOneDao;
import com.example.dao.DatabaseTwoDao;
import com.example.entity.AccountOne;
import com.example.entity.AccountTwo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
// @Transactional(propagation = Propagation.MANDATORY)
@Transactional
public class AccountService {

  @Autowired
  DatabaseOneDao databaseOneDao;

  @Autowired
  DatabaseTwoDao databaseTwoDao;

  public void getAccount() {

    List<AccountOne> accountOnes = this.databaseOneDao.selectAll();
    log.info("1：取得件数：{}", accountOnes.size());
    AccountOne one = new AccountOne();
    one.setUserId(new Random().nextInt());
    one.setUsername("username_" + one.getUserId());
    this.databaseOneDao.insert(one);

    List<AccountTwo> accountTwos = this.databaseTwoDao.selectAll();
    log.info("2：取得件数：{}", accountTwos.size());

    // TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();

  }

}
