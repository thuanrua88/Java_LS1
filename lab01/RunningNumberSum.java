package lab01;

public class RunningNumberSum {
    public static void main(String[] args) {
//        int lowerbound = 1;
//        int upperbound = 1000;
//        int sum = 0;
//        int number = lowerbound;
//        while (number <= upperbound){
//            sum = sum + number;
//            ++number;
//        }
//        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
        int num1 = 9;
        int sum;
        int num2 = 899;
        for(sum = 0; num1 <= num2; num1++){
            sum = sum + num1;
        }
        System.out.println("The sum is " + sum);
        int  num3;
        for(num3 = 1, sum = 0; num3 <= 1000;){
            sum =  sum + num3;
            num3 = num3 + 2;
        }
        System.out.println("The sum numberOdd is " + sum);
        int num4;
        for(num4 = 1, sum = 0; num4 <= 100; num4++){
            sum = sum + num4*num4;
        }
        System.out.println("The SquareSum is " + sum);
        int i,NumPro;
        for (i =1, NumPro = 1; i <= 10; i++){
            NumPro = NumPro*i;
        }
        System.out.println("The NumberProduct is " + NumPro);
    }
}
