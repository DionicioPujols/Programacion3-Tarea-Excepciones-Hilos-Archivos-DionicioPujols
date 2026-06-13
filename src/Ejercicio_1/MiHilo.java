public class MiHilo extends Thread{
    public MiHilo(){
    }

    @Override
    public void run(){
        System.out.println("Descargando archivo1...");
        System.out.println("Descargando archivo2...");
        System.out.println("Descargando archivo3...");

        for(int i = 10; i <= 100; i+=10){
            System.out.println("Archivo1: " + i + "%");
            System.out.println("Archivo2: " + i + "%");
            System.out.println("Archivo3: " + i + "%");
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Archivo1 completado.");
        System.out.println("Archivo2 completado.");
        System.out.println("Archivo3 completado.");

    }
} 
    

