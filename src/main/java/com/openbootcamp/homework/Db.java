package com.openbootcamp.homework;

import lombok.Getter;
import lombok.Setter;

public class Db {
  
  private static Db db;
  
  @Getter
  private int usuariosRegistrados;
  
  public void addUserCount() {
    usuariosRegistrados += 1;
  }
  
  private Db() {}
  
  public static Db getInstance() {
    if (db == null) db = new Db();
    
    return db;
  }
  
  
}
