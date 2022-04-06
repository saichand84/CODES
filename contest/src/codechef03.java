import java.util.*;
import java.io.*;

class codechef03{

    public static void main(String[] args) throws IOException {
        
    }




}
class fs{
    BufferedReader br;
    StringTokenizer st ;
    fs(){
        br = new BufferedReader(new InputStreamReader(System.in));

    }
    public String next() {

        while(st==null && !st.hasMoreTokens()) {
            try{
                st = new StringTokenizer(br.readLine());
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    public int ni(){
        return Integer.parseInt(next());
    }

}