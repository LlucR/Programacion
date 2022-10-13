import java.util.Scanner;

public class EspumaDeAfeitarMKXIV  { public static void main(String[]args){
    String l1,l2;
    Scanner lee = new Scanner(System.in);
    System.out.println("Escribe 2 letras");
    l1 = lee.next();
    l2= lee.next();
    if (l1.equals(l2)){
        System.out.println("Son las misma letra");

    }
    else {
        System.out.println("Son distintas letras");
    }
}
}