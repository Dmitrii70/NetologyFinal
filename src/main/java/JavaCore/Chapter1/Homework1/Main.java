package JavaCore.Chapter1.Homework1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Возможно, вы пытаетесь разделить на ноль");
        }
        /* При реализации метода accept появляется следующая ошибка:
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at JavaCore.Chapter1.Homework.Calculator.lambda$new$3(Calculator.java:14)
	    at JavaCore.Chapter1.Homework.Main.main(Main.java:8)
	    ArithmeticException является классом-потомком для RuntimeException, то есть исключений,
	    появляющихся после запуска программы.
	    Суть ошибки в данном случае заключается в следующем.
	    В классе Main в 8 строке возникает ошибка из-за того,
	    что Java пытается разделить на ноль.
	    Java пытается разделить результат, сохраненный в переменную a (1+2=3) на результат,
	    сохраненный в переменную b (1-1=0).
	    Существует множество вариантов выхода из данной ситуации.
	    На мой взгляд, наилучшим вариантом решения будет попытка поймать данную ошибку и вывести в консоль
	    оповещение о попытке разделить на ноль.
	    ArithmeticException может появляться не только при делении на ноль,
	    но деление на ноль - самая частая ошибка.
	    */
        }
    }
