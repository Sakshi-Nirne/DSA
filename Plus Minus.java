import java.util.*;

public class num {
    public static void main(String[] args) {
        int pcount = 0;
        int zcount = 0;
        int ncount = 0;
        int num = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total num");
        int n = sc.nextInt();
        
        System.out.println("Enter num");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            
            if (num == 0) {
                zcount++;
            } else if (num > 0) {
                pcount++;
            } else {
                ncount++;
            }
        }
        
        System.out.println("positive: " + String.format("%.6f", (float) pcount / n));
        System.out.println("negative: " + String.format("%.6f", (float) ncount / n));
        System.out.println("zero: " + String.format("%.6f", (float) zcount / n));
    }
}

Enter total num
5
Enter num
1 1 -2 0 -1
positive: 0.400000
negative: 0.400000
zero: 0.200000

