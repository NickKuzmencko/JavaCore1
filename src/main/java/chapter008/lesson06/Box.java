package chapter008.lesson06;
//Расширение класса BoxWeight включением в него поля стоимости доставки
 class Box {
    private double width;
    private double height;
    private double depth;
    // сконструировать клон объекта
    Box(Box ob){ //передать объект конструктору
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    //конструктор , применяемый при указании всех размеров
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    //конструктор,применяемый в отсутсвие размеров
    Box(){
        width=-1;//значение -1 служит для обозначения
        height=-1;//неинициализированного
        depth=-1;//параллелепипеда
    }
    //конструктор, применяемый при создании куба
    Box(double len){
        width=height=depth=len;
    }
    //рассчитать и возвратить объем
    double volume(){
        return height*width*depth;
    }
}
//добавить поле веса
class BoxWeight extends Box{
     double weight;//вес параллелепипеда
    // сконструировать клон объекта
    BoxWeight(BoxWeight ob){// передать объект конструктору
        super (ob);
        weight=ob.weight;
    }
    //конструктор, применяемый при указании всех параметров
    BoxWeight(double w,double h,double d,double m){
        super(w, h, d);//вызвать конструктор суперкласса
        weight=m;
    }
    //конструктор используемый по умолчанию
    BoxWeight(){
        super();
        weight=-1;
    }
    //конструктор, применяемый при создании куба
    BoxWeight(double len,double m){
        super(len);
        weight=m;
    }
}
//добавить поле стоимости доставки
class Shipment extends BoxWeight{
     double cost;
     // сконструировать клон объекта
    Shipment(Shipment ob){//передать объект конструктору
        super(ob);
        cost=ob.cost;
    }
    //конструктор, используемый при указании всех параметров
    Shipment(double w,double h,double d ,double m,double c){
        super(w, h, d, m);//вызвать конструктор суперкласса
        cost=c;
    }
    //конструктор, применяемый по умолчанию
    Shipment(){
        super();
        cost=-1;
    }
    //конструктор, применяемый при создании куба
    Shipment(double len,double m,double c){
        super(len, m);
        cost=c;
    }
}
class DemoShipment{
    public static void main(String[] args) {
        Shipment shipment1=new Shipment(10,20,15,10,3.41);
        Shipment shipment2=new Shipment(2,3,4,0.76,1.28);
        double vol;
        vol=shipment1.volume();
        System.out.println("Объем shipment1 равен "+vol);
        System.out.println("Вес shipment1 равен "+shipment1.weight);
        System.out.println("Стоимость доставки : $"+shipment1.cost);
        System.out.println();
        vol=shipment2.volume();
        System.out.println("Объем shipment2 равен "+vol);
        System.out.println("Вес shipment2 равен "+shipment2.weight);
        System.out.println("Стоимость доставки : $"+shipment2.cost);
        System.out.println();
    }
}