package lab01;

public class OddEvenSum {
    public static void main(String[] args) {
//        int lowerbound = 1, upperbound = 1000;
//        int sumOdd = 0;
//        int sumEven = 0;
//        int number = lowerbound;
//        while (number <= upperbound){
//            if(number % 2 == 0){
//                sumEven += number;
//            }else {
//                sumOdd += number;
//            }
//            ++number;
//        }
//        System.out.println("The sum of odd number from" + lowerbound + " to " + upperbound + " is " + sumOdd);
//        System.out.println("The sum of even number from" + lowerbound + " to " + upperbound + " is " + sumEven);
//        System.out.println("The difference between the two sum is " + (sumOdd - sumEven));
        int i = 1;
        int sum = 0;
        for(;i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0 && i % 15 != 0 && i % 21 != 0 && i % 35 != 0 && i % 105 != 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
