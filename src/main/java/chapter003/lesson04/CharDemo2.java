package chapter003.lesson04; // Символьные переменные ведут себя как целочисленные значения

public class CharDemo2 {
    public static void main(String args []){
        char ch1;
        ch1= 'X';
        System.out.println("ch1 содержит "+ ch1);
        ch1++;//увеличить значение ch1 на единицу
        System.out.println("ch1 теперь содержит " +ch1);
    }
}
