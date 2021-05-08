package chapter007.lesson18; //Продемонстрировать применение внутренного класса

class Outer {
    int outer_x=100;
    void test(){
        Inner inner=new Inner();
        inner.display();
    }
    // это внутренный класс
    class Inner{
        int y=10;//y- локальная переменная класса Inner
        void display() {
            System.out.println("вывод: outer_x= "+outer_x);
        }
    }
    //void showy(){
        //System.out.println(y);
    }

class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.test();
    }
}

