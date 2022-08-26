package com.example.inventario_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.inventario_app.controlador.ProductoControlador;
import com.example.inventario_app.modelo.ProductoRepositorio;

@SpringBootApplication
public class InventarioAppApplication {
	
	@Autowired
	ProductoRepositorio pRepositorio;
	public static void main(String[] args) {
		SpringApplication.run(InventarioAppApplication.class, args);
		
	}

	public void applicationRunner(){
		ProductoControlador pControlador = new ProductoControlador(pRepositorio);
	}

}
