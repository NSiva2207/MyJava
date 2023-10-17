package FunctionalProgramming;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        int increment = incrementByOne(5);
        System.out.println(increment);
        increment = multiplyByTen(increment);
        System.out.println(increment);
        System.out.println(incrementByOneFunction.apply(99));
        System.out.println(multiplyByTenFuncton.apply(99));
        System.out.println(fun.apply(24));
        System.out.println(incrementByOneFunction.compose(multiplyByTenFuncton).apply(10));
    }

    //increment by one using function
    public static Function<Integer,Integer> incrementByOneFunction
            = number ->number+1;

    //multiply by 10 using function
    public static Function<Integer,Integer> multiplyByTenFuncton
            = number -> number * 10;


    //using andThen function
    public static Function<Integer, Integer> fun = incrementByOneFunction.andThen(multiplyByTenFuncton);

    public static int incrementByOne(int number){
        return number+1;
    }
    public static int multiplyByTen(int number){
        return number * 10;
    }
}
