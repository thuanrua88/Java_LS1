package lession01;

import java.util.Scanner;

public class SP3_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int intValue = s.nextInt();
        System.out.println("Enter a decimal number : ");
        float floatValue = s.nextFloat();
        System.out.println("Enter a string value : ");
        String strValue = s.next();
        System.out.println("Value entered are : ");
        System.out.println(intValue + " " + floatValue + " " + strValue);
    }
}
