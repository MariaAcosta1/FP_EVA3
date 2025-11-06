
package eva3_1_metodos;

public class EVA3_1_METODOS {

    //
    public static void main(String[] args) {
          //Invocamos
          //Llamada a procedimiento 
          //1. Si queremos recuperar el valor
          //1. guardar el valor
          int resu = calcularCuadrado(4);
          System.out.println("El cuadrado de 100 es " + resu);
          //2. usar el valor sin guardarlo
          System.out.println("El cuadrado de 100 es " + calcularCuadrado(4));
          //3. no me interesa en resultado
          calcularCuadrado(4);
          
        }
        //Modificadores
        //Modificador de acceso: public, private, protected, default
        //static --> se necesita para usar nuestros metodos en el main
        //public static
                       //Valor de retorno (tipo de dato)
                       //Nombre del metodo (usar verbo)
        public static int calcularCuadrado(int num){//Encabezado
          //{}  --> Implementación del método (cuerpo del método)
          int cuadrado = num * num;
          return cuadrado; //regresamos el resultado
          //ya no se puede poner codigo aqui
          //System.out.println(""); //error, no se puede poner codigo
        }
    
    
}
