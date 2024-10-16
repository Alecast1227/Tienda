/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import com.tienda.Dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sebas
 */
@service
public class CategoriaServiceimpl implements CategoriaService {
   @Autowired
   private CategoriaDao categoriaDao;
   
   @Override
   public List<Categoria> getCategorias(boolean activos){
   List<Categoria> lista = categoriaDao.findAll();
   if (activos){
       lista.removeIf(e -> !e.isActivo());
   }return lista;
   }
   
}
