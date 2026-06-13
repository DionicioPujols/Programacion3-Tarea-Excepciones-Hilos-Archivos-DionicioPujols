public class MiHilo extends Thread{
    private String Archivo;
    
    public MiHilo(String Archivo){
        this.Archivo = Archivo;
    }

    @Override
    public void run(){
        
        System.out.println("Descargando " + Archivo + "...");

        for(int i = 10; i <= 100; i+=10){
            System.out.println(Archivo + ": " + i + "%");
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Archivo + " completado.");

    }
} 
    

