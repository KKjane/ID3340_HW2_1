
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        double s = sc.nextInt();
        double t = sc.nextInt();
        System.out.println("Enter the number :");
        double u = sc.nextInt();
        double v = sc.nextInt();

        Complex a = new Complex(s, t);
        Complex b = new Complex(u, v);
        Complex c = a.add(b);
        Complex d = a.substract(b);
        Complex e = a.multiple(b);
        double f = a.magnitude();
        double g = b.magnitude();
        boolean h = a.compare(b);

        System.out.print("Real part of complex a is : ");
        System.out.println(a.getRealPart());
        System.out.print("Imaginary part of complex a is : ");
        System.out.println(a.getImaginaryPart());
        System.out.print("Real part of complex b is : ");
        System.out.println(b.getRealPart());
        System.out.print("Imaginary part of complex b is : ");
        System.out.println(b.getImaginaryPart());
        System.out.print("a + b = ");
        System.out.println(c);
        System.out.print("a - b = ");
        System.out.println(d);
        System.out.print("a * b = ");
        System.out.println(e);
        System.out.print("Magnitude of complex a is ");
        System.out.printf("%.2f",f);
        System.out.println("");
        System.out.print("Magnitude of complex b is ");
        System.out.printf("%.2f",g);
        System.out.println("");
        if(h == true){
            System.out.println("Magnitude of complex a is equal to Magnitude of complex b.");
        }
        else{
            System.out.println("Magnitude of complex a is not equal to Magnitude of complex b.");
        }
    }

}
