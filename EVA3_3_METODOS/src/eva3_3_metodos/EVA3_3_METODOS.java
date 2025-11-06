
package eva3_3_metodos;

import java.util.Scanner;

public class EVA3_3_METODOS {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        do{        
            imprimirMenu();
            valor = input.nextInt();
            //maneja de opciones --> switch
            switch(valor){
                    case 1:
                        System.out.println("********SUMAR DOS NÚMEROS********");
                        realizarSuma();
                break;
                    case 2:
                        System.out.println("********CALCULAR LA POTENCIA********");
                        realizarPotencia();
                break;
                    case 3:
                break;
            }
        }while(valor != 4);
    }
    //Imprimir un menu
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Elige la opción que necesitas");
        System.out.println("1. Calcular una suma");
        System.out.println("2. Calcular una potencia");
        System.out.println("3. Imprimir un mensaje");
        System.out.println("4. Terminar");
    }
    public static void realizarSuma(){
        Scanner input = new Scanner(System.in);
        int val1, val2;
        System.out.println("Valor 1");
        val1 = input.nextInt();
        System.out.println("Valor 2");
        val2 = input.nextInt();
        int resu = sumar(val1, val2);
        System.out.println("La suma es " + resu);
    }
    public static int sumar(int num1, int num2){
       return num1 + num2;
     }
    public static void realizarPotencia(){
        Scanner input = new Scanner(System.in);
        int val1, val2;
        System.out.println("Base: ");
        val1 = input.nextInt();
        System.out.println("Exponente: ");
        val2 = input.nextInt();
    }
    public static int calcularPotencia(int base, int expo){
        //ciclo --> for
        //acumulador --> multiplicación
        int potencia = 1;
        for(int i = 1; i <= expo; i++) {
            potencia = potencia * base;
        }
        return potencia;
    }
}
