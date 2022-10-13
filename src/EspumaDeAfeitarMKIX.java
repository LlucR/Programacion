import java.util.Scanner;
//Creado Por Lluc Ruiz
public class EspumaDeAfeitarMKIX {
    public static void main(String[] args) {
        double num1,num2,sol1;
        Scanner lee= new Scanner(System.in);
        System.out.println("Dame la distancia en Km y el tiempo (Horas) recorridos por un para que calcule su velocidad");
        num1 = lee.nextDouble();
        num2= lee.nextDouble();//Km/h son Km por hora... no hay mas
        sol1= num1/num2;
        System.out.println("El coche va a una velocidad de "+sol1+" Km/h");
    }
}
