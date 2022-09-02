import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    public Calculator() {
    }

    public static Calculator getCalc() {
        return instance.get();
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> divide = (x, y) -> x / y;     //исходный вариант
    BinaryOperator<Integer> divide = (x, y) -> y !=0 ? x / y : 0; //рабочий вариант: при делении на 0 вернет 0

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
