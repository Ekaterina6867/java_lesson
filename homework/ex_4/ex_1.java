//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
// который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
package homework.ex_4;
import java.util.LinkedList;

import java.util.*;

/**
 * ex_4
 */
public class ex_1 {

    public static void main (String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("tree");
        System.out.println(list);
        
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);

       
        

    }
    public static LinkedList<String> reverseLinkedList(LinkedList<String> list){
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i =list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            reversedList.add(element);
        }
        return reversedList;
        
    }

}