
package testclass;

import java.util.Scanner;
class MonkTeachesPallindrome 
{
    public static void main(String args[] ) throws Exception 
    {
       int n,i;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(i=0;i<n;i++)
       {
           String a=sc.next();
           String b=new StringBuilder(a).reverse().toString();
           if(a.equals(b))
           {
               System.out.print("YES ");
              
               System.out.print((a.length()/2)==0?"EVEN \n":"ODD \n");
               
           }
           else
           {
               System.out.println("NO");
           }
       }

    }
}