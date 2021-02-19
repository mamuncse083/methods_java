/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

public class Exercise_2 {

    public static void CelsiusToFarenheit(double c) {
        double fa = (9.0 / 5) * c + 32;
        System.out.println("Farenheit = " + fa);
    }

    public static void FarenheitToCelsius(double f) {
        double ce = ((5 * (f - 32)) / 9);
        System.out.println("Celsius = " + ce);
    }

    public static void main(String[] args) {
        double c = 37;
        double f = 100;
        CelsiusToFarenheit(c);
        FarenheitToCelsius(f);
    }
}
