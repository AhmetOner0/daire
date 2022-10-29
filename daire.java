package giris;
import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        Scanner girilen = new Scanner(System.in);
        double pi=3.14,r,angle,area,circumference;
        System.out.print("enter the radius of circle: ");
        r = girilen.nextDouble();
        System.out.print("enter the centre angle of circle: ");
        angle = girilen.nextDouble();

        area = (pi * (r * r) * angle) / 360;
        System.out.println("area of the circle is: "+area);

        circumference = 2 * pi * r;
        System.out.println("circumference of the circle is: "+circumference);












    }
}
