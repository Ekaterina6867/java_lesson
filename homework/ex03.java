package homework;
//Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
public class ex03 {
    public static void main(String[] args) {
       for (int index = 1; index <= 1000; index++) {
        if(index/1==index && index/index == 1){
            System.out.println(index);
        }
       }
    }
}
