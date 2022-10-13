import java.util.Scanner;

public class EspumaDeAfeitarMKX {
    public static void main(String[] args){
        double num1,sol1;
        Scanner lee = new Scanner (System.in);
        System.out.println("¿Cuanto pesas compa?");
        num1 = lee.nextDouble();
        sol1 = num1*165/1000;
        System.out.println("En la luna pesarias unos "+sol1+ " kilos");
    }

}
