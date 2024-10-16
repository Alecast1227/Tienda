
package com.tienda.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@table(name="categoria")
public class Categoria implements Serializable{
  private static final long serialVersionUID =1L;
  
          @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
         @column (name= "id_categoria")
          private Long idCategoria;
          private String descripcion;
          private String rutaImagen;
          private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
          
          
}