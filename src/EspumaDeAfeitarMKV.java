import java.util.Scanner;
//Creado Por Lluc Ruiz
public class EspumaDeAfeitarMKV {
    public static void main(String[] args){
        double num1,sol1,sol2;
        Scanner lee=new Scanner(System.in);
        System.out.println("Dame tu radio");// Vengo del Social, con lo cual pensaba que "radio" era donde acababan los actores
        num1 = lee.nextDouble();// fracasados. Tuve que buscarlo en internet
        sol1=2*Math.PI*num1;// Aqui aparece por primera vez PI el cual debemos escribir con su Math.PI
        sol2=Math.PI*Math.pow(num1,2);
        System.out.println("La longitud de tu circulo es "+sol1+" Y el area es "+ sol2);
    }
}
