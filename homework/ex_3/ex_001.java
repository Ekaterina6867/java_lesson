package homework.ex_3;
import java.util.ArrayList;
import java.util.*;
public class ex_001 {
    // Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//  Вывести название каждой планеты и количество его повторений в списке. Collections.frequency() 
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Венера");

        int freq = Collections.frequency(planets, "Земля");
   
        System.out.println(freq);
    }
}
