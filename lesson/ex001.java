// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
package lesson;

public class ex001 {
    

public static void main(String[] args) {
    ex02();
}
static void ex02(){
int [] array = new int []{1,1,0,1,1,1};
int count = 1;
int max = 0;
for (int i = 1; i < array.length; i++) {
    if(array[i] == array[i-1]){
        count++;
    }else{
        if(count>max){
            max=count;
        }
        count=1;
    }
    if(count>max){
        max=count;
    }
}System.out.println(max);
}
}