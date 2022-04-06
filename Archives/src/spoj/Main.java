package spoj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


class Main {
    static int n = 86028121;
    static boolean[] p = new boolean[n+1];
    static ArrayList<Integer> list = new ArrayList<>();

    public static void sieve(){
        for (int i = 2; i<=n; i++) {
            p[i]=true;

        }
        for (int i = 2; i*i<=n ; i++) {
            if(p[i] == true){
                for (int j = i*i; j<=n ; j+=i) {
                    p[j]=false;
                }
            }
        }
        //  System.out.println(Arrays.toString(p));
        for (int i = 2; i <=n; i++) {
            if(p[i])
            {
                list.add(i);
            }
        }


    }
    public static void main(String[] args) throws IOException {
        sieve();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

       // System.out.println(list);
        while (a-->0){
            int b = Integer.parseInt(br.readLine());
            bw.write(list.get(b-1)+"\n");

        }
        bw.flush();

    }
}
