package homework.ex_4;

import java.util.Iterator;
import java.util.LinkedList;

// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class ex_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        

        Iterator<Integer> iterator = list.iterator();

        int sum = 0;
        while (iterator.hasNext()) {
        sum = sum + iterator.next();
        }
        System.out.println(sum);

    }
}
