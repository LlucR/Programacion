import java.util.Scanner;

public class EspumaDeAfeitarMKXI {
    public static void main(String[] args){
        Double n1,sol1;
        Scanner lee= new Scanner(System.in);
        System.out.println("Escibe un numero");
        n1 = lee.nextDouble();
        sol1 = n1%2;
        if (sol1 == 0){
            System.out.println("Es par");
        }
        if (sol1 !=0){
            System.out.println("Es impar");
        }
    }
}
