import java.util.*;

public class Task
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Total digits: " + count);

        sc.close();
    }
}