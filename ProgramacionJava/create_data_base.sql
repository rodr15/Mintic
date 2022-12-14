
CREATE DATABASE Reto4;

CREATE TABLE Reto4.Productos 
   (codigo int PRIMARY KEY NOT NULL,  
   nombre varchar(25) NOT NULL,  
   precio real NOT NULL,  
   inventario int NOT NULL);


INSERT INTO Reto4.Productos (codigo, nombre, precio, inventario)  
    VALUES (1, 'Manzanas', 5000.0, 25)  ,
     (2, 'Limones', 2300.0, 15)  ,
     (3, 'Peras', 2700.0, 33)  ,
     (4, 'Arandanos', 9300.0, 5),  
     (5, 'Tomates', 2100.0, 42)  ,
     (6, 'Fresas', 4100.0, 3)  ,
     (7, 'Helado', 4500.0, 41)  ,
     (8, 'Galletas', 500.0, 8)  ,
     (9, 'Chocolates', 3500.0, 80),  
     (10, 'Jamon', 15000.0, 10)  ;

SELECT * FROM Reto4.Productos