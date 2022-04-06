//
//
//import java.io.*;
//import java.util.*;
//
//class Codechef
//{
//    static class fs {
//        BufferedReader br;
//        StringTokenizer st;
//        fs(){
//            br = new BufferedReader(new InputStreamReader(System.in));
//        }
//
//
//        String next()  {
//            while(st == null || !st.hasMoreTokens()){
//                try{
//                    st = new StringTokenizer(br.readLine());
//                }
//                catch (IOException e){
//                    e.printStackTrace();
//                }
//
//            }
//            return st.nextToken();
//        }
//        int ni (){
//            return Integer.parseInt(next());
//        }
//        String nextLine(){
//            String str="";
//            try{
//                str = br.readLine();
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//            return str;
//        }
//    }
//   static  boolean f(String s1,String s2,int l,int r,int n){
//       if(l-r==0){
//           return s1.charAt(l)==s2.charAt(l);
//       }
//       else if(l-r==1){
//           int a = (int)s1.charAt(l)-(int) s1.charAt(r);
//
//           int b = (int)s2.charAt(l)-(int) s2.charAt(r);
//           return a==b;
//       }
//       else{
//           int a[] = new int[r-l+1];
//           for (int i = l; i <=r ; i++) {
//
//           }
//       }
//   }
//    public static void main(String[] args) throws IOException{
//        fs sc = new fs();
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int t = sc.ni();
//        while (t-->0){
//            int n = sc.ni();
//            int q = sc.ni();
//            String  s1 = sc.next();
//            String s2 = sc.next();
//            while (q-->0){
//                int l = sc.ni();int r = sc.ni();
//                if(f(s1,s2,l,r,n))
//                    bw.write("Yes\n");
//                else
//                    bw.write("No\n");
//
//
//            }
//
//
//
//        }
//        bw.flush();
//
//
//
//
//
//
//
//
//        }
//
//
//
//    }
//
//
