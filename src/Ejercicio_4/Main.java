import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opciones = 0;

        do {
            try {
                System.out.println("\n|| -- Calculadora de operaciones basicas -- ||\n");
                System.out.println("|| -- Menu de opciones -- ||");
                System.out.println("|| 1. Suma                ||");
                System.out.println("|| 2. Resta               ||");
                System.out.println("|| 3. Multiplicacion      ||");
                System.out.println("|| 4. Division            ||");
                System.out.println("|| 5. Salir               ||\n");
                System.out.print("Ingrese una opcion: ");
                opciones = sc.nextInt();

                switch (opciones) {

                    case 1:
                        System.out.print("Ingrese el primer numero: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        double num2 = sc.nextDouble();
                        calc.Suma(num1, num2);
                        break;

                    case 2:
                        System.out.print("Ingrese el primer numero: ");
                        double num3 = sc.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        double num4 = sc.nextDouble();
                        calc.Resta(num3, num4);
                        break;

                    case 3:
                        System.out.print("Ingrese el primer numero: ");
                        double num5 = sc.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        double num6 = sc.nextDouble();
                        calc.multiplicacion(num5, num6);
                        break;

                    case 4:
                        System.out.print("Ingrese el primer numero: ");
                        double num7 = sc.nextDouble();
                        System.out.print("Ingrese el segundo numero: ");
                        double num8 = sc.nextDouble();
                        calc.division(num7, num8);
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opcion no valida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero valido.");
                sc.nextLine(); 
            }catch(ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
            }
        }while (opciones != 5);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}