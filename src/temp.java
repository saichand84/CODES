import java.io.BufferedReader;
import java.io.*;


public class temp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(String.valueOf(br.read()));
        long l= Long.parseLong(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("the line is : "+i+"\n");
        bw.newLine();
        bw.write("dfdsf" + l);
        bw.flush();

    }

    static class Main
    {
        public static void main (String[] args) throws Exception {

    //        bw.close();
        }
    }
}
