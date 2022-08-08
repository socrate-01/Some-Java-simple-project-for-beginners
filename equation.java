import java.util.Scanner;
import java.text.NumberFormat;
public class equation{
    public static void main(String[] args){
        int a=0;
        int b=0;
        int c=0;
        Scanner sc = new Scanner(System.in);
            do{
            System.out.println("Veuiller entrer la valeur de a");
            a = sc.nextInt();
        }while(a==0);
        System.out.println("Veuiller entrer la valeur de b");
        b = sc.nextInt();
       System.out.println("Veuiller entrer la valeur de c");
        c = sc.nextInt();
          int delta = b*b - 4*a*c;
          if(a !=0 && delta < 0)
          {
              System.out.println("Pas de solution");
          }
          if(a !=0 && delta > 0)
          {
              double X1 = (-b - Math.sqrt(delta))/2*a;
              double X2 = (-b + Math.sqrt(delta))/2*a;
              NumberFormat x = NumberFormat.getInstance();
              NumberFormat x2 = NumberFormat.getInstance();
              String val1=x.format(X1);
              String val2=x2.format(X2);
              System.out.println("X1 = "+val1+ " X2 = "+val2);
          }
          if(a != 0 && delta == 0)
          {
              double X3 = -(double)b/(2*a);
              NumberFormat x3= NumberFormat.getInstance();
              String val3=x3.format(X3);
              System.out.println("X2 = "+val3);
          }        
          }
    }