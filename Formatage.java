import java.util.regex.Pattern;
public class Formatage {
    public static void main(String[] args) {
        if (args.length ==2)
        {
            if(args[0].indexOf(".") != -1) 
            {
                int nombreapresvirgule = Integer.parseInt(args[1]);
                String tabChaine[] = args[0].split(Pattern.quote(".")); 
                String mot = tabChaine[1].substring(0,nombreapresvirgule);
                if (nombreapresvirgule == 0) 
                {
                    System.out.println(tabChaine[0]);
                } else 
                {
                    System.out.println(tabChaine[0]+"."+mot);
                }
            }
            else
            {

                 if (args[0].indexOf(",") != -1)
                 {
                    int nombreapresvirgule = Integer.parseInt(args[1]);
                    String tabChaine[] = args[0].split(Pattern.quote(","));
                    String mot = tabChaine[1].substring(0,nombreapresvirgule);
                    
                        if (nombreapresvirgule == 0) 
                        {
                            System.out.println(tabChaine[0]);
                        } else 
                        {
                            System.out.println(tabChaine[0]+","+mot);
                        }
                    }
                 else{
                     System.out.println("Le nombre"+args[0]+"n'est pas décimal");
                 }
            }

        }
        else
        {
            System.out.println("Veuillez renseigner en parametres deux arguments svp: le nombre decimal et la valeur à tronquer");
        }
    }
}
