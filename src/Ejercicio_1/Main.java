public class Main {
    public static void main(String[] args) {
        System.out.println("\n|| -- Simulacion de descarga de 3 archivos -- ||\n");
        MiHilo h = new MiHilo("Archivo1");
        MiHilo h2 = new MiHilo("Archivo2");
        MiHilo h3 = new MiHilo("Archivo3");
        System.out.println("Estado del hilo:" + h.getState());
        h.start();
        System.out.println("Estado del hilo:" + h2.getState());
        h2.start();
        System.out.println("Estado del hilo:" + h3.getState());
        h3.start();
    }
}
