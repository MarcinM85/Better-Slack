package Lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {
        Checker checker = new Cecker(){
            @Override
            public boolean check(int number) {
                return number % 2 ==0;
            }
        };

        List<Integer> numbers = ArrayList(1, 2, 3, 4, 5, 6);

        for (int number : numbers) {
            if (evenChecker.check(number)) {
                System.out.println(number);
            }
        }
    }
}
