
package galleta;

import java.util.Random;



public class Lagalleta {

    String sabor, color, nombre,sombrero;
    int edad;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public String getSombrero() {
        return sombrero;
    }

    public void setSombrero(String sombrero) {
        this.sombrero = sombrero;
    }
  

    public void mostrarAtributos() {
        System.out.print("La galleta tiene " + edad + " años, su sabor es de " + sabor + ", el color de la galleta es " + color + " y tienen " + sombrero + " sombrero rojo");
    }



    public int numEdad() {
        Random r = new Random();
        return r.nextInt(12);
    }

}
