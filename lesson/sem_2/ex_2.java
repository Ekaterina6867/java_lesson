package lesson.sem_2;
// Напишите метод, который сжимает строку.
// � Пример: вход aaaabbbcdd результат: а4b3cd2
public class ex_2 {
    public static void main(String[] args) {
        String line = "aaaabbbcdd";
        System.out.println(res(line));
    }
static String res(String line){
    StringBuilder stringBuilder = new StringBuilder();
    int count = 1;
    //  идем по индексам, сравниваем индекс текущего элемента с предыдущим, если они равны, 
    //то увеличиваем count на 1, если не равны то в Stringbilder добавляем запись.
    // чтобы получить символ по индексу, используется CharAt
    for (int i = 1; i < line.length(); i++) {
        if(line.charAt(i) == line.charAt(i-1)){
            count++;
        }
        else{
        stringBuilder.append(line.charAt(i-1));
        if (count != 1){
           stringBuilder.append(count); 
           count = 1;
        }
    }  
        
    }stringBuilder.append(line.charAt(line.length()-1));

    if (count != 1){
        stringBuilder.append(count); 
        }
        return stringBuilder.toString();
    }

}
  
