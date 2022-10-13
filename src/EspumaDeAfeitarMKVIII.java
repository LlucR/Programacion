import java.util.Scanner;

public class EspumaDeAfeitarMKVIII {
    public static void main(String[] args){
        double num1, num2, num3,sol1,sol2,sol3,tri1,tri2,cua,pen1,pen2;
        Scanner lee= new Scanner(System.in);
        System.out.println("Quieres hacer el area de un triangulo(0), un cuadrado(1) o un pentagono(2)");
        num1 =lee.nextDouble();
        if (num1==0){
            System.out.println("Escribe la base y la altura");
            tri1=lee.nextDouble();
            tri2= lee.nextDouble();
            sol1= (tri1*tri2)/2;
            System.out.println("El area de tu triangulo es "+sol1);
        }
        if (num1==1){
            System.out.println("Escrible la longitud de tu cuadrado");
            cua= lee.nextDouble();
            sol2=cua*cua;
            System.out.println("El area de tu cuadrado es "+cua);
        }
        if (num1==2) {
            System.out.println("Escribeme el Perimetro y el apotema de tu pentagono");
            pen1= lee.nextDouble();
            pen2 = lee.nextDouble();
            sol3 = (pen1*pen2)/2;
            System.out.println("El area de tu Pentagono se "+sol3);
        }
    }
}
