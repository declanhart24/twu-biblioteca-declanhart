/**
 * Created by declanhart on 3/12/2015.
 */
import java.util.ArrayList;
import java.util.List;
public class fizzBuzzPrime {
    public fizzBuzzPrime () {
        fizzBuzz();
        generate(30);
    }

    public void fizzBuzz () {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    public void generate (int n){
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        System.out.println(factors.toString());
    }
}
