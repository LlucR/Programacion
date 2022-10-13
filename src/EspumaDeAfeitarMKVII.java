import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
//Creado Por Lluc Ruiz
public class EspumaDeAfeitarMKVII {
    public static void main(String[] args){
        double num1,num2,sol1,sol2,num3;
        Scanner lee= new Scanner(System.in);
        System.out.println("Saludos,¿Quieres pasar pesetas a euros 0 o euros a pesetas 1 ");
        num1 = lee.nextDouble();
        if (num1==0) {
            System.out.println("Escribe la cantidad a convertir");
            num2 = lee.nextDouble();
            sol1 = num2/166386/1000;
            System.out.println("Son "+ sol1+" Euros");
        }
        if (num1==1){
            System.out.println("Escribe la cantidad a convertir");// en este ejercicio asumí que el usuario seria capaz de usar mas de
            num3 = lee.nextDouble();//doce neuronas sin probocarse un infarto cerebral
            sol2 = num3*166386/1000;//claro error
            System.out.println("Son "+sol2+" pesetas");//tuve que crear una posibilidad para el usuario que no usaba ni el 1 ni el 0
        }
        else {
            System.out.println("Ese numero no me vale, vuelve a intentarlo");
        }
    }
}
