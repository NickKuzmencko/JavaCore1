package chapter007.lesson11; //В этой программе демонстрируется отличие
// модификаторов public и private .

public class Test {
    int a;//доступ,определяемый по умолчанию
    public int b;//открытый доступ
    private int c;
    //методы доступа к члену с данного класса
    void setc(int i){// установить значение члена с данного класса
        c=i;
    }
    int getc() {//получить значение с данного класса
        return c;
    }
}
class AccessTest {
    public static void main(String[] args) {
        Test ob=new Test();
        ob.a=10;
        ob.b=20;
        // Этот оператор неверен и может вызвать ошибку
        //ob.c=100; // ОШИБКА!

        //Доступ к члену данного с данного класса должен ошуществляться
        // с помощью методов ее класса
        ob.setc(100); // верно!
        System.out.println("a,b,c : "+ob.a+" "+ob.b+" "+ob.getc());
    }
}