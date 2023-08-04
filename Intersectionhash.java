import java.util.*;
public class Hash
{
    public static int intersectionhash(int num1[], int num2[])
    {
        HashSet<Integer> h=new HashSet<>();
        int count=0;
        for(int i=0;i<num1.length;i++)
        {
            h.add(num1[i]);
        }
        for(int j=0;j<num2.length;j++)
        {
            if(h.contains(num2[j]))
            {
                count++;
                h.remove(num2[j]);
            }
            
        }
        
        return count;
    }
   public static void main(String[] args)
    {
        int num1[]={1,2,5};
        int num2[]={1,3,5,7,8};
        //Hash h=new Hash();
        System.out.println(intersectionhash(num1, num2));
    }

}

output
  2
