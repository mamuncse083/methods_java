/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

public class Exercise {

    static void myMethod(double a) {
        Scanner o = new Scanner(System.in);
        double b = o.nextDouble();
        double c = a * b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        double a = 1.609;
        myMethod(a);
    }
}
