package com.fumidzuki.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fumidzuki.entity.AccountOne;
import com.fumidzuki.entity.AccountTwo;
import com.fumidzuki.service.AccountService;

@RestController
@RequestMapping("/example")
public class ExampleRestController {

  @Autowired
  AccountService accountService;

  @GetMapping("one")
  public List<AccountOne> one() {
    return this.accountService.getAccountOne();
  }

  @GetMapping("two")
  public List<AccountTwo> two() {
    return this.accountService.getAccountTwo();
  }

}
