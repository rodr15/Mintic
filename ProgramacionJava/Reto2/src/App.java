import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/

class Producto {

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

class BaseDatosProductos {
    /*
     * código nombre precio inventario
     * 1 Manzanas 5000.0 25
     * 2 Limones 2300.0 15
     * 3 Peras 2700.0 33
     * 4 Arandanos 9300.0 5
     * 5 Tomates 2100.0 42
     * 6 Fresas 4100.0 3
     * 7 Helado 4500.0 41
     * 8 Galletas 500.0 8
     * 9 Chocolates 3500.0 80
     * 10 Jamon 15000.0 10
     */
    Map<Integer, Producto> listaProductos = new HashMap<Integer, Producto>();
    double totalInventario = 0;
    BaseDatosProductos() {
        listaProductos.put(1, new Producto(1, "Manzanas", 5000.0, 25));
        listaProductos.put(2, new Producto(2, "Limones", 2300.0, 15));
        listaProductos.put(3, new Producto(3, "Peras", 2700.0, 33));
        listaProductos.put(4, new Producto(4, "Arandanos", 9300.0, 5));
        listaProductos.put(5, new Producto(5, "Tomates", 2100.0, 42));
        listaProductos.put(6, new Producto(6, "Fresas", 4100.0, 3));
        listaProductos.put(7, new Producto(7, "Helado", 4500.0, 41));
        listaProductos.put(8, new Producto(8, "Galletas", 500.0, 8));
        listaProductos.put(9, new Producto(9, "Chocolates", 3500.0, 80));
        listaProductos.put(10, new Producto(10, "Jamon", 15000.0, 10));

    }

    // * Verificación si el producto existe
    boolean existe(Producto producto) {
        return listaProductos.containsKey(producto.codigo);
    }

    // * Agregar producto
    void agregarProducto(Producto producto) {
        listaProductos.put(producto.codigo, producto);
    }

    // * actualizar producto
    void actualizarProducto(Producto producto) {
        listaProductos.replace(producto.codigo, producto);
    }

    // * eliminar producto
    void eliminarProducto(Producto producto) {
        listaProductos.remove(producto.codigo);
    }

    void generarInforme() {
        for(Producto producto : listaProductos.values()){
            totalInventario += producto.precio * producto.inventario;
        }
        System.out.println(totalInventario);
    }
}

class Reto2 {

    /**
     * Este debe ser el único objeto de tipo Scanner en el código
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Este método es usado para solicitar datos al usuario
     * 
     * @return Lectura de la siguiente linea del teclado
     */
    public String read() {
        return this.scanner.nextLine();
    }

    /**
     * método principal
     */

    public void run() {
        /*
         * solución propuesta
         */

        String lecturaAccion = read().toUpperCase();
        String[] lecturaProducto = read().split(" ");

        final int codigo = Integer.parseInt(lecturaProducto[0]);
        final String nombre = lecturaProducto[1];
        final double precio = Double.parseDouble(lecturaProducto[2]);
        final int inventario = Integer.parseInt(lecturaProducto[3]);

        final Producto producto = new Producto(codigo, nombre, precio, inventario);

        BaseDatosProductos listaProductos = new BaseDatosProductos();

        switch (lecturaAccion) {

            case "AGREGAR":
                if (!(listaProductos.existe(producto))) {

                    listaProductos.agregarProducto(producto);
                    listaProductos.generarInforme();

                } else {

                    System.out.println("ERROR");

                }
                break;

            case "ACTUALIZAR":
                if (listaProductos.existe(producto)) {

                    listaProductos.actualizarProducto(producto);
                    listaProductos.generarInforme();

                } else {

                    System.out.println("ERROR");

                }
                break;

            case "BORRAR":
                if (listaProductos.existe(producto)) {

                    listaProductos.eliminarProducto(producto);
                    listaProductos.generarInforme();

                } else {

                    System.out.println("ERROR");

                }
                break;
            default:
                break;
        }

    }

    public static void main(String[] args) throws Exception {
        Reto2 objeto = new Reto2();
        objeto.run();
    }
}