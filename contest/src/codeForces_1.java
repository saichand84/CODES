import java.io.*;
import java.util.StringTokenizer;

public class codeForces_1 {
    static class fs{
        BufferedReader br;
        StringTokenizer st;
        fs(){
            br = new BufferedReader(new InputStreamReader(System.in));

        }
        String next(){
            while (st==null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return  st.nextToken();
        }
        int ni(){
            return Integer.parseInt(next());
        }
        long nl(){
            return  Long.parseLong(next());
        }
    }
    static int N = 998244353;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        fs sc = new fs();
        int t = sc.ni();
        int ans=0;
        while (t-->0){
            int n = sc.ni();
            ans = fact(n);
            bw.write(ans+"\n");
        }

        bw.flush();
        }
        static int fact(int n){
           if(n==1)
               return 1;
           return n*fact(n-1);
        }


}

