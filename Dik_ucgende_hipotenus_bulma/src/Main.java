import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c,u;

        System.out.println("Bir sayi giriniz");
        Scanner inp = new Scanner(System.in);

        System.out.println("a kenarını giriniz");
        a  = inp.nextInt();

        System.out.println("b kenarını giriniz");
        b  = inp.nextInt();

        System.out.println("c kenarını giriniz");
        c  = inp.nextInt();

        u = (a+b+c)/2;
        System.out.println("Cevre: " + u*2);
        System.out.println("Alan" + (u*(u-a)*(u-b)*(u-c)));





    }
}