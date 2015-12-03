import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by declanhart on 2/12/2015.
 */
public class diamond {
    public diamond() throws IOException {
        System.out.println("Please enter first number: ");
        int first = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            first = Integer.parseInt(br.readLine());
        } catch (NumberFormatException nfe) {
        }
        System.out.println("Please enter second number: ");
        int second = 0;
        try {
            second = Integer.parseInt(br.readLine());
        } catch (NumberFormatException nfe) {
        }
        System.out.println("Please enter third number: ");
        int third = 0;
        try {
            third = Integer.parseInt(br.readLine());
        } catch (NumberFormatException nfe) {
        }
        isosceles(first);
        buildDiamond(second);
        diamondWithName(third);
    }

    public int isosceles(int n) {
        System.out.println("Isosceles Triangle");
        int stars = 1;
        int spaces = n - 1;
        int rowCount = 1;
        for (; rowCount <= n; rowCount++) {
            for (int numSpaces = 1; numSpaces <= spaces; numSpaces++) {
                System.out.print(" ");
            }
            for (int starCount = 1; starCount <= stars; starCount++) {
                System.out.print("*");
            }
            System.out.println("");
            stars += 2;
            spaces--;
        }
        return rowCount;
    }

    public void buildDiamond(int n) {
        System.out.println("\nDiamond");
        int stars = 1;
        int spaces = n - 1;
        int rowCount = 1;
        for (; rowCount <= n; rowCount++) {
            for (int numSpaces = 1; numSpaces <= spaces; numSpaces++) {
                System.out.print(" ");
            }
            for (int starCount = 1; starCount <= stars; starCount++) {
                System.out.print("*");
            }
            System.out.println();
            if (rowCount != n) {
                stars += 2;
                spaces--;
            }
        }
        for (; rowCount > 2; rowCount--) {
            for (int i = 0; i <= spaces; i++) {
                System.out.print(" ");


            }
            for (int starCount = stars - 2; starCount >= 1; starCount--) {
                System.out.print("*");
            }
            System.out.println();
            stars -= 2;
            spaces++;
        }
    }

    public void diamondWithName(int n) {
        System.out.println("\nDiamond With Name");
        int stars = 1;
        int spaces = n - 1;
        int rowCount = 1;
        for (; rowCount <= n - 1; rowCount++) {
            for (int numSpaces = 1; numSpaces <= spaces; numSpaces++) {
                System.out.print(" ");
            }
            for (int starCount = 1; starCount <= stars; starCount++) {
                System.out.print("*");
            }
            System.out.println();
            if (rowCount != n) {
                stars += 2;
                spaces--;
            }
        }
        System.out.println("Declan");
        for (; rowCount > 1; rowCount--) {
            for (int i = 0; i <= spaces; i++) {
                System.out.print(" ");


            }
            for (int starCount = stars - 2; starCount >= 1; starCount--) {
                System.out.print("*");
            }
            System.out.println("");
            stars -= 2;
            spaces++;
        }
    }
}

