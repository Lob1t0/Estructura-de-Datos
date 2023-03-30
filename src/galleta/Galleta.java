package galleta;

public class Galleta {
  
    public static void main(String[] args) {
        Lagalleta c = new Lagalleta();
        c.setNombre("Mongo");
        c.setEdad(c.numEdad());
        c.setSabor("Chocolate");
        c.setColor("Marron");
        c.setSombrero("1");
        System.out.println("El nombre de la galleta es " + c.getNombre());
        c.mostrarAtributos();
    }
}
