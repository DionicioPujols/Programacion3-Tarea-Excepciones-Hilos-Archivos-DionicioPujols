public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n|| -- Simulacion de descarga de 3 archivos -- ||\n");
        MiHilo hilo = new MiHilo();
        System.out.println("Estado del hilo:" + hilo.getState());
        hilo.start();
    }
}
