/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            String s = sc.nextLine();
            int  m=0,c=0,t=0;
            for (int i=0;i<s.length()-1 ;i++ ){
                if(s.charAt(i) == '1'){
                    c++;

                }else{
                    if(m<c)
                        m=c;
                    c=0;
                    t++;
                }
            }
            if(m<c)
                m=c;
            if(t==s.length() || m!=s.length()-t )
                System.out.println(m+" "+c+" "+t);
            else
                System.out.println("YES");

        }
    }
}
