public class MiHilo extends Thread{
    private String nombre;
    
    public MiHilo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println(nombre +" Avanzo al metro: " + i);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " LLego a la meta!"); 
    }       
    
} 
    

