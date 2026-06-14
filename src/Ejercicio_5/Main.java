import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        MetodosArchivo metodos = new MetodosArchivo();
        Scanner sc = new Scanner(System.in);
        File archivo = new File("actividades.txt");
        int opciones = 0;
        do { 

                System.out.println("\n|| ----------------------------------------- ||");
                System.out.println("||    Sistemas para registrar actividades    ||");
                System.out.println("|| 1. Agregar actividades                    ||");
                System.out.println("|| 2. Mostrar actividades                    ||");
                System.out.println("|| 3. Salir                                  ||");
                System.out.println("|| ----------------------------------------- ||\n");
                System.out.println("Elegir una opcion: ");
                opciones = sc.nextInt();
                sc.nextLine();

                switch (opciones) {
                    case 1:
                        metodos.AregarActividad();
                        break;
                    case 2:
                        metodos.MostrarActivades();
                        break;

                    case 3: 
                        System.out.println("Saliendo del sistema..");
                        break;
                    default:
                        System.out.println("Opcion no valida. ");
                }
        } while(opciones != 3);
        System.out.println("\nNombre del archivo: " + archivo.getName());
        System.out.println("Ruta del archivo: " + archivo.getAbsolutePath());
        System.out.println("El archivo existe: " + archivo.exists());
    }
}
