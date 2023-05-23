

//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
package homework;

import java.util.Scanner;

/**
 * ex01
 */
public class ex01 {

    public static void main(String[] args) {

        int summa = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            summa = summa+i;
            
        }System.out.println(summa);
    } 
}
