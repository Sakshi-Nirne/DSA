import java.util.*;
public class Hash
{
    public static int unionhash(int num1[], int num2[])
    {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<num1.length;i++)
        {
            h.add(num1[i]);
        }
        for(int j=0;j<num2.length;j++)
        {
            h.add(num2[j]);
        }
        // for(int k=0;k<num1.length;k++)
        // {
        //     System.out.println(num1[k]);
        // }
        return h.size();
    }
   public static void main(String[] args)
    {
        int num1[]={1,2,5};
        int num2[]={1,3,5,7,8};
        //Hash h=new Hash();
        System.out.println(unionhash(num1, num2));
    }

}

output
6
