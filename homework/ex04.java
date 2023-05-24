package homework;

import java.util.Scanner;

//Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
public class ex04 {
    public static void main(String[] args) {
        double n;
        double m;
        double res;
        char a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите два числа");
        n = scanner.nextDouble();
        m = scanner.nextDouble();
        System.out.print("введите операцию + или - ");
        a = scanner.next().charAt(0);
        res = 0;
        switch (a) {
            case '+': res = n + m;
                
                break;
            case '-': res = n - m;
                break;
            default: System.out.println("ошибка");
                return;
        }System.out.println(res);

    }
}
