package com.uca.capas.tarea4.controller;

import com.uca.capas.tarea4.domain.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class MainController {

    @RequestMapping("/producto")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("producto", new Producto());
        mav.setViewName("producto");
        return mav;
    }
    @RequestMapping("/resultado")
    public ModelAndView resultado(@Valid @ModelAttribute Producto pro, BindingResult result) {
        ModelAndView mav = new ModelAndView();

        if (result.hasErrors()) {
            mav.setViewName("producto");
        }else{
            mav.addObject("codigoProducto",pro.getCodigoProducto());
            mav.addObject("nombreProducto",pro.getNombreProducto());
            mav.addObject("marca",pro.getMarca());
            mav.addObject("descripcion",pro.getDescripcion());
            mav.addObject("existencias",pro.getExistencias());
            mav.addObject("fecha",pro.getFecha());
            mav.setViewName("resultado");

        }
        return mav;
    }
}
