package practica;

import java.util.Scanner;

public class Unidad2 {
    public static void main(String[] args) {
        String nombre, apellido, hobbie, editorFavorito, sistemaOperativo;
        int edad;

        Scanner lector = new Scanner(System.in);
        System.out.println("------------ UNIDAD 2 ------------");
        System.out.println("Por favor ingrese los siguientes datos:");
        System.out.print("Su nombre: ");
        nombre = lector.nextLine();
        System.out.print("Su apellido: ");
        apellido = lector.nextLine();
        System.out.print("Su edad: ");
        edad = lector.nextInt();
        lector.nextLine();
        System.out.print("Cuál es su hobbie? ");
        hobbie = lector.nextLine();
        System.out.print("Cuál es su editor de código preferido? ");
        editorFavorito = lector.nextLine();
        System.out.print("Cuál es su sistema operativo? ");
        sistemaOperativo = lector.nextLine();
        System.out.println("\n************** Datos **************");
        System.out.println("\nLos valores ingresados son: \n* Nombre: " + nombre + "\n* Apellido: " + apellido + "\n* Edad: " + edad +
                "\n* Hobbie: " + hobbie + "\n* Editor de código favorito: " + editorFavorito + "\n* Sistema Operativo: " + sistemaOperativo);

    }
}
