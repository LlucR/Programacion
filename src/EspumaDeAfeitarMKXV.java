import java.util.Scanner;

public class EspumaDeAfeitarMKXV {
    public static void main(String[] args) {
        char l1, l2;
        Scanner lee = new Scanner(System.in);
        System.out.println("Escribe 2 letras");
        l1 = lee.next().charAt(0);
        l2 = lee.next().charAt(0);
        if (l1 == l2 && Character.isLowerCase(l1) && Character.isLowerCase(l2)) {
            System.out.println("Son las misma letra y ambas estan en minuscula");

        }
        if (Character.isLowerCase(l1) && Character.isLowerCase(l2) && l1 != l2) {
            System.out.println("Ambas estan en minusculas pero no son la misma letra");
        } else {
            System.out.println("No son la misma letra, mu mal");

        }
    }
}
