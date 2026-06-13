import java.io.*;
import java.util.*;
public class MetodosArchivo {

    public void AregarActividad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n|| -- Seccion para registrar actividades -- ||");
        System.out.println("Actividad: ");
        String texto = sc.nextLine();
        
        try {
        FileWriter w = new FileWriter("actividades.txt", true);
        BufferedWriter bw = new BufferedWriter(w);
        bw.write(texto);
        bw.newLine();

        bw.close();
        System.out.println("Se registro correctamente! ;)");
        } catch (IOException e) {
            System.out.println("Error al agregar el estudiante: " + e.getMessage());
        }
    } 

    public void MostrarActivades(){
        try {
            String linea;
            FileReader reader = new FileReader("actividades.txt");
            BufferedReader br = new BufferedReader(reader);
            System.out.println("\n-- Actividades registradas --");
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            System.out.println();
        br.close();
            
        } catch (IOException e){
            System.out.println("Error: No se pudo mostrar actividades" + e.getMessage());
        }
    }
}
