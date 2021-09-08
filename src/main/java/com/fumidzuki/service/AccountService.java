package com.fumidzuki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fumidzuki.dao.DatabaseOneDao;
import com.fumidzuki.dao.DatabaseTwoDao;
import com.fumidzuki.entity.AccountOne;
import com.fumidzuki.entity.AccountTwo;

@Service
// @Transactional
public class AccountService {

  @Autowired
  DatabaseOneDao databaseOneDao;

  @Autowired
  DatabaseTwoDao databaseTwoDao;

  public List<AccountOne> getAccountOne() {
    return this.databaseOneDao.selectAll();
  }

  public List<AccountTwo> getAccountTwo() {
    return this.databaseTwoDao.selectAll();
  }


  // public void getAccount() {
  //
  // List<AccountOne> accountOnes = this.databaseOneDao.selectAll();
  // log.info("1：取得件数：{}", accountOnes.size());
  // AccountOne one = new AccountOne();
  // one.setUserId(new Random().nextInt());
  // one.setUsername("username_" + one.getUserId());
  // this.databaseOneDao.insert(one);
  //
  // List<AccountTwo> accountTwos = this.databaseTwoDao.selectAll();
  // log.info("2：取得件数：{}", accountTwos.size());
  //
  // // TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
  //
  // }

}
