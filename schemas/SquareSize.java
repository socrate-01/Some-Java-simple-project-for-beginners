import java.util.*;
public  class Carre{
    public static void main(String[] args){
        int i,j;
            Scanner sc =  new Scanner(System.in);
            System.out.println("Veuiller entrer la taille du carré!");
              int a = sc.nextInt();
              for(i=0;i<=a;i++){
               for(j=0;j<=a;j++)
              {
                  System.out.print(" * ");
              }
            System.out.println();
            }
}
}