import java.util.Scanner;
/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/

class Persona {
    float masa; // * Kg
    float altura; // * metros
    float edad; // * años
    float imc;
    String riesgo = "No tiene riesgo";

    Persona(float masa, float altura, float edad) {
        this.masa = masa;
        this.altura = altura;
        this.edad = edad;
        this.imc = masa / (altura * altura);
    }

    String riesgo(){
        
        if(!(masa > 0 && masa < 150))          return "ERROR";
        if(!(altura > 0.1 && altura < 2.5))    return "ERROR";
        if(!(edad > 0 && edad < 100))          return "ERROR";


        if(edad < 45 ){
            if(imc < 22) riesgo = "Bajo";
            else         riesgo = "Medio";
        } else{
            if(imc < 22) riesgo = "Medio";
            else         riesgo = "Alto";
        }

        return String.format("%.1f", imc) + " " + riesgo;
        
}



}

class Reto1 {

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
        // Criterios de aceptación
        

        String[] datos = read().split(" ");

        float masa = Float.parseFloat(datos[0]);
        float altura = Float.parseFloat(datos[1]);
        float edad = Float.parseFloat(datos[2]);
        
        

        
        
        Persona persona = new Persona(masa, altura, edad);
        System.out.println(persona.riesgo());
         
    }

    public static void main(String[] args) throws Exception {
        Reto1 objeto = new Reto1();
        objeto.run();
    }
}