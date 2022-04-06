package Bit_manuplations;


        import java.util.*;

public class reverse_bits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a =sc.nextInt();
            int c=0;
            int j=0;
            while(a>0){
                c<<=1;
                j++;
                if((a&1)==1)
                    c^=1;
                a>>=1;
            }
            c=c<<(32-j);

            System.out.println(c);
        }

    }
}