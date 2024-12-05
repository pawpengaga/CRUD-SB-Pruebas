package com.pawpengaga.main.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pawpengaga.main.modelo.Dvd;

@Controller
@RequestMapping("/dvd")
public class ControladorDummy {

  List<Dvd> listadoDvd = new ArrayList<>();

  @GetMapping("/listar")
  public ModelAndView inicio(){
    ModelAndView mav = new ModelAndView("listadoDvd");
    mav.addObject("listado", listadoDvd); // Un simil de .setAttribute() de los Servlets
    return mav;
  }

  @GetMapping("/agregar")
  public String nuevo(){
    return "nuevoDvd";
  }


}
