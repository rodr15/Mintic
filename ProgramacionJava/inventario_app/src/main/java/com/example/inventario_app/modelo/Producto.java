package com.example.inventario_app.modelo;

import org.springframework.data.annotation.Id;
// import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Productos")
public class Producto {
   
    // @Column -> Necesario si la bd y el atributo se llama diferente
        @Id
        int codigo;
        String nombre;
        double precio;
        int inventario;
    
        Producto(int codigo, String nombre, double precio, int inventario) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.inventario = inventario;
        }

    
}
