// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//  Вывести название каждой планеты и количество его повторений в списке. Collections.frequency() 
package homework.ex_3;
import java.util.ArrayList;
/**
 * ex_01
 */
public class ex_01 {

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

        for (String planet : planets) {
            int count = 0;
            for (String s : planets) {
                if (planet.equals(s)) {
                    count++;
                }
            }
            System.out.printf( "%s - %d%n",planet, count);
        }
        
        

    }
}