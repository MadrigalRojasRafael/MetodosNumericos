/*
 * Programa que calcule el Método de Bisección con una función Cuadrática o Cúbica.
 * El Usuario tendrá la posibilidad de Ingresar los Valores del Intervalo [a, b].
 * Para calcular la Raíz dentro del Intervalo dado por el Usuario.
 */
package Proyecto;

//Importamos el Scanner
import java.util.Scanner;

public class MétodoBiseccion {
    static double f (double x){
        
        return (x*x)-(2*x)-3;
    } 
    
    public static void main(String[] args) {
        
        //Declaramos el Scanner
        Scanner read = new Scanner(System.in);
        
        //Pedimos los Valores al Usuario 
        System.out.print("Ingrese el Valor para a en el Intervalo: ");
        double a = read.nextDouble();
        
        System.out.print("Ingrese el Valor para b en el Intervalo: ");
        double b = read.nextDouble();
        
        //Declaramos c para almacenar el Teorema de Bolzano
        double c=0;
        
        //Aplicamos la lógica del Método de Bisección
        //Cumplimiento del Teorema de Bolzano
        if (f(a)*f(b) > 0){
            System.out.println("No se cumple el Teorema de Bolzano.");
            System.out.println("Por lo tanto no existe una Raíz en ese Intervalo.");
            return;
            
            //Sí se cumple continuamos iterando 
            } while (f(a)*f(b) < 0){
            c = (a+b)/2;
            if (Math.abs(c) <= 1e-10){
                System.out.println("La raíz es: " +c);    
            
            }
            
            //En caso de que no se logren acercar de manera intercalada a la Raíz.
            //Tomamos a como último valor más aproximado a la Raíz.
            if (f(a)*f(b) < 0){
                a = c;
                System.out.println("La raíz es: " +c); 
                                
            //Tomamos b como último valor más aproximado a la Raíz.
            } else {
                b = c;
                System.out.println("La raíz es: " +c); 
                
            }
        }
    }   
}
