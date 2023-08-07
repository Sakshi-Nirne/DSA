import java.util.*;
class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number.");
        int n = sc.nextInt();
        boolean b = isPerfect(n);

        if (b) {
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not a perfect number.");
        }
    }
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return n == sum;
    }
}

output
Enter number.
6
Perfect number.
6-> 1+2+3
