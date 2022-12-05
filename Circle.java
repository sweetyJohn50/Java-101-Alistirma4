package circle;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        int radius;
        double pi = 3.14;
        Scanner i = new Scanner(System.in);

        System.out.print("Yari capi giriniz : ");

        radius = i.nextInt();

        i.close();
        
        double area = pi * radius * radius;
        double enviroment = 2 * pi * radius;

        System.out.println("Dairenin alani : "+ area);
        System.out.println("Dairenin cevresi : " + enviroment);

        
    }
    
}
