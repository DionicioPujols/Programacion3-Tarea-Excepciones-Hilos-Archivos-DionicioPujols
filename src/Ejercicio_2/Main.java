

public class Main {
    public static void main(String[] args){
       
       try{
        System.out.println("|| -- Programa para simular una carrera entre corredores -- ||\n");
        MiHilo Corredor1 = new MiHilo("Juan");
        MiHilo Corredor2 = new MiHilo("Pedro");
        MiHilo Corredor3 = new MiHilo("Ana");
        MiHilo Corredor4 = new MiHilo("Carlos");

        System.out.println("|| -- Estado del Hilo -- ||\n");
        System.out.println("Estado del hilo: " + Corredor1.getState());
        System.out.println("Estado del hilo: " + Corredor1.getState());
        System.out.println("Estado del hilo: " + Corredor1.getState());
        System.out.println("Estado del hilo: " + Corredor1.getState());
        System.out.println("\n|| -- Comenzo la carrera -- ||\n");
        Corredor1.start();
        Corredor2.start();
        Corredor3.start();
        Corredor4.start();

       }catch(Exception e){
        e.printStackTrace();
       }

    }
}
