package com.akbank.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class TextLogger implements Logger {

  @Override
  public void log() {
    System.out.println("Text Logger");
  }

}
