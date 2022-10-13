import java.util.Scanner;
//Creado Por Lluc Ruiz
public class EspumaDeAfeitarMKIV {
    public static void main(String[] args){
        double numero1,numero2;
        Scanner lee= new Scanner(System.in);
        System.out.println("Dame tu temp en grados normales y te los paso al desproposito ese americano");
        numero1= lee.nextDouble(); //En este ejercicio arreglamos el desproposito de los Farrenheit, inutiles e ineficaces
        numero2= (numero1*1.8)+32;// Para hacerlo he decidido crear una variable numero2
        System.out.println("Tu temperatura eb Fahrenheit son "+numero2);
    }
}
