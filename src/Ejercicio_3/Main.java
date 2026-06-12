import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("|| -- Sistemas para solocitar la edad de un usuario -- ||");
    try{
        System.out.print("\nIngrese su edad: ");
        int edad = sc.nextInt();
        if(edad < 18){
            throw new EdadInvalidadException("Debe ser mayor de edad. Acceso denegado.");
        }else{
            System.out.println("Bienvenido al sistema");
        }
    }catch(EdadInvalidadException e){
        System.out.println(e.getMessage());
    }finally{
        System.out.println("Gracias por usar el sistema.");
        sc.close();
    }
  }
}
