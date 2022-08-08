import java.util.Scanner;
public class Palindrome {
     public static boolean estPalindrome(String ch)
    {   
        if(ch.length() == 0 || ch.length() == 1)
            return true; 
        if(ch.charAt(0) == ch.charAt(ch.length()-1))
        return estPalindrome(ch.substring(1, ch.length()-1));
        return false;
    }

    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuiller entrer un mot:");
        String string = scanner.nextLine();
        if(estPalindrome(string))
            System.out.println(string + " est un palindrome");
        else
            System.out.println(string + " n'est pas un palindrome");
    }
}
