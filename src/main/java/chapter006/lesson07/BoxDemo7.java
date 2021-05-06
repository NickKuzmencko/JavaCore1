package chapter006.lesson07; //В данном примере программы для инициализации размеров
//параллелепипеда в классе Вох применяется параметризированный конструктор
 class Box {
     double width;
     double height;
     double depth;
     //Это конструктор класа Box
    Box (double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    //рассчитать и возвратить объем
    double volume(){
        return width*height*depth;
    }
}
class BoxDemo7{
    public static void main(String[] args) {
        //объявить, выделить память и инициализировать объекта типа Box
        Box mybox1= new Box(10,20,15);
        Box mybox2=new Box(3,6,9);
        double vol;
        //получить объем первого параллелепипеда
        vol=mybox1.volume();
        System.out.println("Объем равен "+vol);
        //получить объем второго параллелепипеда
        vol=mybox2.volume();
        System.out.println("Объем равен second"+vol);
    }
}
