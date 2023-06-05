package homework.ex_5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов. 
public class ex_1 {
    

    
       // Метод, который добавляет номера в книгу
    public static void add(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void print(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        add("Kate", 17823, bookPhone);
        add("Kate", 12989734, bookPhone);
        add("Dad", 1111111, bookPhone);
        add("Mom", 786868, bookPhone);
        add("Kate", 999873, bookPhone);
        add("Dad", 87878787, bookPhone);
        print(bookPhone);
       }
}