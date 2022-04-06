package leetcode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        while(t-->0){
            list.add(sc.nextInt());

        }
        int q = sc.nextInt();

        while(q-->0){
            sc.nextLine();
            String st = sc.nextLine();

            int a = sc.nextInt();
            if(st.equals("Insert")){

                int b = sc.nextInt();
                if(a< list.size())
                list.set(a,b);
                else
                    list.add(b);

            }
            else{

                list.remove(a);
            }


        }
        for(Integer y : list){
            System.out.print(y+" ");

        }
        System.out.println();



    }
}