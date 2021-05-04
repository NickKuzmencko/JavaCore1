package chapter006.lesson01; // Программа , использующая класс Вох
                             // Присвоить исходному файлу имя BoxDemo.java

 class Box {
     double width;
     double height;
     double depth;
}
// В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox= new Box();
        double vol;
        //присвоить значение переменным экземпляра mybox
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
        //рассчитать объем параллепипеда
        vol= mybox.width* mybox.height* mybox.depth;
        System.out.println("объем равен "+vol);

    }
}

