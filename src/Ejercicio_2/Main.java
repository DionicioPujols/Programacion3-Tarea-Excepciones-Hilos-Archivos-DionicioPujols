public class Main {
    public static void main(String[] args){
        System.out.println("|| -- Programa para simular una carrera entre corredores -- ||\n");
        MiHilo Corredor1 = new MiHilo("Juan");
        MiHilo Corredor2 = new MiHilo("Pedro");
        MiHilo Corredor3 = new MiHilo("Ana");
        MiHilo Corredor4 = new MiHilo("Carlos");

        Corredor1.start();
        Corredor2.start();
        Corredor3.start();
        Corredor4.start();

        System.out.println("Estado inicial: " + MiHilo.currentThread().getState());
    }
}
