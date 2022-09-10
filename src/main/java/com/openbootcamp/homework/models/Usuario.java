package com.openbootcamp.homework.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.Random;

public class Usuario {
  
  @Getter @Setter
  private String nombre;
  
  @Getter @Setter
  private String primerApellido;
  
  @Getter @Setter
  private String segundoApellido;
  
  @Getter @Setter
  private String domicilio;
  
  @Getter @Setter
  private String INE; // En Mexico, el INE es el documento que avala tu mayoría de edad, y te permite votar
  
  @Getter
  protected String indentificacionHospital;
  
  public Usuario(String nombre, String pA, String sA, String domicilio, String INE) {
    Random r = new Random();
    this.nombre = nombre;
    primerApellido = pA;
    segundoApellido = sA;
    this.domicilio = domicilio;
    this.INE = INE;
    
    indentificacionHospital = (getINE().substring(0, 2) + getINE().substring(getINE().length() - 2)
    + getNombre().substring(getNombre().length() - 2) + getPrimerApellido().substring(getPrimerApellido().length() - 2)
    + getSegundoApellido().substring(getSegundoApellido().length() - 2) + r.nextInt(0, 10)).toUpperCase();
  }
  
}
