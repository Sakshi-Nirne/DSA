import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int n, r, sum=0 , ch;
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter No.!");
        n=sc.nextInt();
        int t=n;
        while(n>0)
        {
        r=n%10;
        n=n/10;
        sum=sum*10+r;
        }
        if(sum==t)
          System.out.println("palindrome");
         
        else
        {
            System.out.println("not palindrome");
        }
        
    }
}
