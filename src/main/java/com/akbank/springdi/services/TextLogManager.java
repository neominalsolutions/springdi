package com.akbank.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class TextLogManager {

  // @Autowired // otomatik dependency injection sağlar.
  private Logger logger; // DIP prensibi ile log dosyasına otomatik olarak inject olacağız. // setter
                         // injection

  // Contructor Injection Spring boot otomatik olarak dependency yöntemi sağlıyor.
  // @Autowired
  public TextLogManager(Logger logger) { // Contructor Injection
    super();
    this.logger = logger;
  }

  public void Log() {
    this.logger.log();
  }

}
