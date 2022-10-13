import java.util.Scanner;
//Creado Por Lluc Ruiz
public class EspumaDeAfeitarMKVI {
    public static void main(String[] args){
        double num1,sol1;
        Scanner lee=new Scanner(System.in);
        System.out.println("Escribe tu velocidad en Km/h");//Solo teniamos que multiplicar la velocidad en kn/h por 5/18
        num1= lee.nextDouble();
        sol1= num1*5/18;
        System.out.println(num1+" en m/s serian "+ sol1);

    }
}
