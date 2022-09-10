package com.openbootcamp.homework.controllers;

import com.openbootcamp.homework.Db;
import com.openbootcamp.homework.models.Usuario;
import com.openbootcamp.homework.services.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {

  private final UsersService usersService;
  private final Db db = Db.getInstance();
  
  
  public UsuariosController(UsersService usersService) {
    this.usersService = usersService;
  }
  
  @PostMapping("/")
  public Usuario getByIdentificacionHospital() {
    return usersService.getByIdentifiacionHospiral("identificacion");
  }
  
  @GetMapping("/usuarios-registrados")
  public int getCantidadUsuarios() {
    return db.getUsuariosRegistrados();
  }
}
