public class Singleton{
    private static Singleton president;
    private Singleton(){}

    public static Singleton getInstance(){
        if(president==null){
            president= new Singleton();
            System.out.println("Election d'un président");
        }    
        else{
            System.out.println("Un président est déja élu"); 
        }
           
            return president;
    }

}