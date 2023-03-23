/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trapecio;

/**
 *
 * @author l52
 */
public class Informacion {

    public static void main(String[] args) {

        Trapecio t1 = new Trapecio();

        t1.base1 = 4.0;
        t1.base2 = 4.0;
        t1.altura = 8.0;

        System.out.println("Informacion para t1: ");
        t1.mostrarDimension();
        System.out.println("El area es " + t1.area());

        System.out.println("");

    }
}
     

