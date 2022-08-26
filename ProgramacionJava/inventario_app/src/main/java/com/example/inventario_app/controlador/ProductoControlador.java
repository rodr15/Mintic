package com.example.inventario_app.controlador;

import com.example.inventario_app.modelo.ProductoRepositorio;

public class ProductoControlador {
    
    ProductoRepositorio pRepositorio;

    public ProductoControlador(ProductoRepositorio pRepositorio){
        // Inyectar Dependencias por constructor
        this.pRepositorio = pRepositorio;
    }

    public void buscarProductos(){}
    public void agregar(){}
    public void actualizar(){}
    public void eliminar(){}
    public void generarInforme(){}
    


}
