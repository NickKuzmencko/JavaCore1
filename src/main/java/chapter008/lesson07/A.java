package chapter008.lesson07;
//продемонстрировать порядок вызова конструкторов
//создать суперкласс
public class A {
    A(){
        System.out.println("В конструкторе А");
    }
}
//создать подкласс путем расширения класса А
class B extends A{
    B(){
        System.out.println("В конструкторе В");
    }
}
//Создать еще один подкласс путем расширения класса В
class C extends B{
    C(){
        System.out.println("В конструкторе С.");
    }
}
class CallingCons{
    public static void main(String[] args) {
        C c=new C();
    }
}
