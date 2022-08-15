import java.util.Scanner;

class Reto0 {

    /**
     *  Este debe ser el único objeto de tipo Scanner en el código
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Este método es usado para solicitar datos al usuario
     * @return  Lectura de la siguiente línea del teclado
     */
    public String read(){
        return this.scanner.nextLine();
    }

    public float sumaNumeros (float operando1, float operando2) {
        float sumatoria = operando1 + operando2;
        return sumatoria;
    }

    public float productoNumeros (float operando3, float operando4) {
        float producto = operando3 * operando4;
        return producto;
    }

    public void run() {

        String[] operandos = read().split(" ");

        float num1 = Float.parseFloat(operandos[0]);
        float num2 = Float.parseFloat(operandos[1]);

        float suma = sumaNumeros(num1, num2);
        float multi = productoNumeros(num1, num2);

        System.out.println(String.format("%.1f", suma) + " " + String.format("%.1f", multi));
    }
    /**
     * método principal
     */
    public static void main (String[] args){
        Reto0 objeto = new Reto0();
        objeto.run();
    }
}