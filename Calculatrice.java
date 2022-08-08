public class Calculatrice{
    public static void main(String[] args){
        if(args.length == 3){
        double resultat = 0;
        String operation = args[1];
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[2]);
        switch (operation) {
            case "+":
            resultat = a + b;
            break;
            case "-":
            resultat = a - b;
            break;
            case "*":
            resultat = a * b;
            break;
            case "/":
            if(b != 0)
            {
                resultat = (double)a/b;
            }
            else
            {
                System.out.println("On ne peut pas diviser un nombre par 0");
            }
            default:
            System.out.println("Opérateur invalide!");
            break;
        }
        System.out.println(a +" " + operation +" "+ b +" = "+ resultat);
    }
    else{
        System.out.println("Entrer 3 paramètres!!");
    }
    }
}