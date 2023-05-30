package homework.ex_3;
//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class ex_02 {
    public static void main(String[] args) {
        System.out.print("Введите длину списка S: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int S = iScanner.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < S; i++) {
                int x = ran.nextInt(S);
                array.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + array);

            for (int i = array.size() - 1; i >= 0; i--) {
                int even = array.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число:" + array.get(i));
                    array.remove(i);
                }
            }
            Collections.sort(array);
            System.out.println("Список с удаленными четными числами: \n " + array);
        }
    }
}
