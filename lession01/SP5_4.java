package lession01;

public class SP5_4 {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        do {
            sum = sum + num;
            num++;
        }while (num <= 10);
        System.out.printf("Sum of 10 number is : %d\n", sum);
    }
}
