import java.util.Scanner;
//Creado Por Lluc Ruiz
public class EspumaDeAfeitarMKII {
     public static void main(String[] args) {
         int numero1,numero2;
        Scanner paco =new Scanner(System.in) ;
        System.out.println("Dame 2 numeros ");
        numero1 = paco.nextInt(); //Usando La funcion de Scanner le pillamos los numeros los cuales ya tenemos definidos con Int*
        numero2 = paco.nextInt();//* Y los imprimimos con un buen sout
        System.out.println("Cogiste el " +numero1+ " y el " +numero2);

    }
}
