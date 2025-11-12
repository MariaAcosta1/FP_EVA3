
package eva3_13_sobrecarga;

import java.util.Scanner;

public class EVA3_13_SOBRECARGA {


    public static void main(String[] args) {
        String resu;
        resu = capturar("Introduce el nombre del cliente: ");
        System.out.println(resu);
        double valor;
        valor = capturar("Salario del empleado: ",0.0);
        System.out.println(valor);
        int edad;
        edad = capturar("Edad del usuario: ", 1);
        System.out.println(edad);
        
    }
    public static String capturar(String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
    }
    public static double capturar(String mensaje, double dummy){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextDouble();  
    }
    public static int capturar(String mensaje, int dummy){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextInt(); 
    }
    
}
