package com.pawpengaga.main.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pawpengaga.main.dao.DvdDAO;
import com.pawpengaga.main.modelo.Dvd;

@Controller
@RequestMapping("/dvd")
public class ControladorDummy {

  @Qualifier("dvddao")
  @Autowired
  DvdDAO dvdService;

  @GetMapping("/listar")
  public ModelAndView inicio(){
    ModelAndView mav = new ModelAndView("listadoDvd");
    mav.addObject("listado", dvdService.mostrarDvd()); // Un simil de .setAttribute() de los Servlets
    return mav;
  }

  @GetMapping("/agregar")
  public String nuevo(){
    return "nuevoDvd";
  }

  // Cuando pensemos en modelos hay que pensar en objetos Java
  @PostMapping("/grabar")
  public String grabarDvd(@ModelAttribute("Dvd") Dvd dvd){
    dvdService.grabar(dvd);
    return "redirect:/dvd/listar";
  }

}
