package codechef;
import java.util.*;
 class primeinbstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >0){
            String s  = sc.next();
            int l = s.length();
            if(l==1) {
                System.out.println("no");
                continue;
            }
            if(l == 2 ){
                if(s.equals("11") || s.equals("10"))
                    System.out.println("yes");
                else
                    System.out.println("no");
                continue;
            }

            if(s.contains("11") || s.contains("10"))
                System.out.println("yes");
            else
                System.out.println("no");

        }
    }
}
