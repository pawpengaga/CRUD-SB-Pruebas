package com.pawpengaga.main.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pawpengaga.main.modelo.Dvd;

@Configuration
public class ConfigLista {

  /**
   * Un bean no necesita accesadores o modificadores, esta por sobre ellos
   * El objetivo de este bean es volver a lista de dvd's de proposito general
   * 
   * Poniendo nombre al bean podemos referirnos a el de forma especifica con @Qualifier
   */
  @Bean("listadoDvd")
  List<Dvd> listadoDvd(){
    List<Dvd> listado = new ArrayList<>();
    return listado;
  }

}
