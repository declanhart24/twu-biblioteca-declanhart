import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by declanhart on 2/12/2015.
 */
public class triangle {
    public triangle() throws IOException{
        System.out.println("Please enter first number: ");
        int first = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            first = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe) {
        }
            System.out.println("Please enter second number: ");
        int second = 1;
        try{
            second = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe) {
        }
        System.out.println("Please enter third number: ");
        int third = 1;
        try{
            third = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe) {
        }
        printOne();
        printHorizontal(first);
        printVertical(second);
        drawTriangle(third);
    }

    public void printOne () {
        System.out.println("Print single asterisk");
        System.out.println("*");
    }

    public void printHorizontal(int n) {
        System.out.println("\nPrint multiple asterisks in one line");
        String output = new String();
        for(int i = 1; i <= n; i++)
           output = output + "*";
        System.out.println(output);
    }

    public void printVertical (int n) {
        System.out.println("\nPrint multiple asterisks in multiple lines line");
        for(int i = 1; i <= n; i++)
            System.out.println("*");
    }

    public void drawTriangle (int n) {
        System.out.println("\nPrint asterisk triangle");
        String output = new String();
        for(int i = 1; i <= n; i++) {
            output = output + "*";
            System.out.println(output);
        }
    }
}
