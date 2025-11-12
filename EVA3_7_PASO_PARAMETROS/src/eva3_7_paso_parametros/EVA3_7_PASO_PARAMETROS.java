
package eva3_7_paso_parametros;


public class EVA3_7_PASO_PARAMETROS {


    public static void main(String[] args) {
        int num = 5;
        System.out.println("Original = " + num);
        incrementar(num);//se manda una copia del valor almacenada en num
        System.out.println("Despues de incremenetar: " + num);
    }
    //Incrementar un entero en 1
    public static void incrementar(int valor){
        valor = valor + 1;
    }
    
}
