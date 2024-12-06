package com.pawpengaga.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pawpengaga.main.modelo.Dvd;

@Component("dvddao")
public class DvdDAO {

  @Qualifier("listadoDvd") // Nos traermos la lista del contexto general
  @Autowired
  private List<Dvd> listadoDvd;

  public void grabar(Dvd dvd){
    listadoDvd.add(dvd);
  }

  public List<Dvd> mostrarDvd(){
    return listadoDvd;
  }

}
