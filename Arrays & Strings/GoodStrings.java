
package goodstrings;

import java.util.Scanner;

/**
 *
 * @author saish.mohare
 */
public class GoodStrings 
{

    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int maxcount=0,count=0;
        for(int i=0;i<S.length();i++)
        {
            int flag=0;
            if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
            {
                flag=1;
            }
            else
                flag=0;
            if(flag==1)
                count++;
            else
            {
               
                count=0;
            }
             if(count>maxcount)
                    maxcount=count;
              
        }
        System.out.println(maxcount);
    }
    
}
