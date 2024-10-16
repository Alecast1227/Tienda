/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sebas
 */
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    @RequestMapping("/listado")
    public String Inicio(Model model){
    model.addAttribute("")
    }
}
