package lession01;

import java.util.Scanner;

public class SP4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        if(num % 3 == 0){
            System.out.println("Inside outer if Block");
            if(num % 5 == 0){
                System.out.println("Number is divisible by 3 and 5");
            }else
                System.out.println("Number is divisible by 3, but not by 5");
        }else
            System.out.println("Number is divisible by 3");
    }
}
