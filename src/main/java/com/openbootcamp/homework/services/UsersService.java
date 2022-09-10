package com.openbootcamp.homework.services;

import com.openbootcamp.homework.Db;
import com.openbootcamp.homework.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UsersService {
  private static final HashMap<String, Usuario> users = new HashMap<>();
  private static final Db db = Db.getInstance();
  
  public HashMap<String, Usuario> getAllUsers() {
    return users;
  }
  
  public void addUser(Usuario user) {
    users.put(user.getIndentificacionHospital(), user);
  }
  
  public Usuario getByIdentifiacionHospiral(String identificacion) {
    Usuario n1 = new Usuario("Julian", "Torres", "Balbuena", "sembrario las quelmedas", "7398KLDFJKJDKLDKF9");
  
    users.put(n1.getIndentificacionHospital(), n1);
    db.addUserCount();
    return users.get(n1.getIndentificacionHospital());
  }
}
