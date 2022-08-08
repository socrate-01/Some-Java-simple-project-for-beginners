import java.util.*;
public class triangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuiller entrer la taille de vôtre triangle!");
        int a = sc.nextInt();
        int i,j;
        String x= "*";
    
     for(i=1;i<=a;i++){
         for(j=1;j<=i;j++){
                 System.out.print(x);
           
         }
         System.out.println();
     }
         
    }

}