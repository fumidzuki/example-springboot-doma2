package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AccountService;

@RestController
public class ExampleRestController {

  @Autowired
  AccountService accountService;

  @GetMapping("/account")
  public String one() {
    this.accountService.getAccount();
    return "";
  }

}
