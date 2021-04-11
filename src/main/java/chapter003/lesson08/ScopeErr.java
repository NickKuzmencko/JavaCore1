package chapter003.lesson08; // скомпилировать эту программу нельзя

public class ScopeErr {
    public static void main (String args []){
        int bar=1;
        {
            int bar=2; // создается новая область действия
                      // Ошибка во время компиляции
                     // переменная bar уже определена!
        }
    }
}
