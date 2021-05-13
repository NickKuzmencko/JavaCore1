package chapter008.lesson05;
//Использовать ключевое слово super с целью предовратить сокрытие имен
public class A {
    int i;

}
//создать подкласс путем расширения класса А
class B extends A{
    int i;// этот член i скрывает член  i из класса А
    B(int a,int b){
        super.i=a;//член i из класса А
        i=b;// член і из класса В
    }
    void show (){
        System.out.println("Член і в суперклассе :"+super.i);
        System.out.println("Член і в подклассе:"+ i);
    }
}
class UseSuper {
    public static void main(String[] args) {
        B subob=new B(1,2);
        subob.show();
    }
}
