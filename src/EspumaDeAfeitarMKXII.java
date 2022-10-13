import java.util.Scanner;

public class EspumaDeAfeitarMKXII {
    public static void main(String [] args){
        char l1;
        Scanner lee = new Scanner(System.in);
        System.out.println("Escribe una letra y te diré si esta en mayusculas o en minusculas");
        l1 = lee.next().charAt(0);
        boolean s1 = Character.isUpperCase(l1);
            System.out.println("Es Mayuscula? " + s1 );



    }
}
