package org.figueroa.app;
import org.figueroa.app.subpackage.Persona;
public class Main {
    public static void main(String[] args) {
        /*Primera forma de utilizar la clase con el subpakage*/
        org.figueroa.app.subpackage.Persona p1 = new org.figueroa.app.subpackage.Persona();

        p1.Nombre = "Joju";
        System.out.println(p1.Nombre);

        //Segunda Forma es importando la clase
        Persona p2 = new Persona();

        p2.Nombre = "cr7";

        System.out.println("2DA Persona");
        System.out.println(p2.Nombre);
    }
}