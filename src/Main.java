public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);

        //операция не может быть выполнена из-за деления целого числа на ноль, выбрасывается исключение ArithmeticException

        calc.println.accept(c);
    }
}
