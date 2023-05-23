package homework;

import java.util.Scanner;

// Вычислить n! (произведение чисел от 1 до n)
public class ex02 {
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            count = count*i;
          
        }System.out.println(count);  

    }
}
