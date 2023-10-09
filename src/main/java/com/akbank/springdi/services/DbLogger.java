package com.akbank.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // default ilk önce ioc den bunu çöz
public class DbLogger implements Logger {

  @Override
  public void log() {
    System.out.println("Db Logger");
  }

}
