import java.util.Scanner;

public class EspumaDeAfeitarMKXIII  { public static void main(String[]args){
    char l1,l2;
    Scanner lee = new Scanner(System.in);
    System.out.println("Escribe 2 letras");
    l1 = lee.next().charAt(0);
    l2= lee.next().charAt(0);
    if (l1==l2){
        System.out.println("Son las misma letra");

    }
    else {
        System.out.println("Son distintas letras");
    }
}
}
