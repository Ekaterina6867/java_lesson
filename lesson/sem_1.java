package lesson;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * sem_1
 */
public class sem_1 {

    public static void main(String[] args) {
     ex0();
    }
    static void ex0(){
        System.out.println("what is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //System.out.println("hi!"  + name);
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("good morning" + name + "!");
        }else if(hour >= 12 && hour < 18){
            System.out.println("good day" + name + "!");
        }else if(hour >= 18 && hour < 23){
            System.out.println("good evening!" + name + "!");
        }else {
            System.out.println("good night!"  + name + "!");
        }

    }
}