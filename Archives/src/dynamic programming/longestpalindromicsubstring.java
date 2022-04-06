import java.util.Scanner;

class longestpalindromicsubstring {
    public static String lps(String str){
        int n = str.length();

        boolean dp[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {//for 1 len sub
            dp[i][i] = true;
        }
        for (int i = 0; i < n-1; i++) {//for 2 len sub
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i+1]=true;
            }
        }
        //for k len sub
        int start =0,max=Integer.MIN_VALUE;
        for (int k = 3; k <=n ; k++) {
            for (int i = 0; i < n-k+1; i++) {
                int j =i+k-1;
                if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==true){
                    dp[i][j]=true;
                    if(max<j-1+1){
                        max=j-i+1;
                        start =i;
                    }
                }
            }
        }
        return str.substring(start,start+max);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lps(s));
    }
}