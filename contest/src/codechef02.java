import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


import java.io.*;
        import java.util.*;

class codechef02 {
    static  class fs{
        BufferedReader br ;
        StringTokenizer st ;
        fs(){
            br = new BufferedReader(new InputStreamReader(System.in));

        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int ni(){
            return Integer.parseInt(next());
        }
        long nl(){
            return  Long.parseLong(next());
        }

    }
    public static void main(String[] args) throws IOException{
        fs sc= new fs();
        long N = 1000000007;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.ni();
        int m= sc.ni();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {

            a[i]=sc.nl();
        }
        while (m-->0){
            int c= sc.ni();
            int x = sc.ni();


            long v = a[c-1];
            a[c-1]=0;
            while (x-->0)
            {
                int pr = sc.ni();
                int suf = sc.ni();
                a[suf-1]= (a[suf-1]%N + (((v%N)*(pr%N))%N))%N;
            }




        }
        for (long e:a
        ) {
            bw.write(e+"\n");
        }
        bw.flush();
    }

}
