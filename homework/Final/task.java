package homework.Final;
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметр
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task {

    public static void main(String[] args) throws Exception {

        Laptor laptor1 = new Laptor("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        Laptor laptor2 = new Laptor("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        Laptor laptor3 = new Laptor("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        Laptor laptor4 = new Laptor("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
        Laptor laptor5 = new Laptor("Xiomi RedmiBook 15", 8, 256, "Windows 11", "серый", 15.6);
        Laptor laptor6 = laptor1;

        Set<Laptor> unicLaptor = new HashSet<Laptor>();
        unicLaptor.add(laptor1);
        unicLaptor.add(laptor2);
        unicLaptor.add(laptor3);
        unicLaptor.add(laptor4);
        unicLaptor.add(laptor5);
        unicLaptor.add(laptor6);
        System.out.println(laptor1.equals(laptor6));
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicLaptor.size());


        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("объем накопителя: ");
        int storUser = sc.nextInt();

        System.out.println("диагональ");
        double digUser = sc.nextDouble();

        for(Laptor lap: unicLaptor) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();

    }

}
