//package algorithms.differance_array;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class differenceArray {
//
//}
//import java.io.*;
//        import java.util.*;
//
//public class Solution {
//    static class fs {
//        BufferedReader br;
//        StringTokenizer st;
//
//        fs() {
//            br = new BufferedReader(new InputStreamReader(System.in));
//
//        }
//
//        String next() {
//            while (st == null || !st.hasMoreTokens()) {
//                try {
//
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//
//    }
//    static int gcd(int a, int b)
//    {
//        if (a == 0)
//            return b;
//        return gcd(b % a, a);
//    }
//    static void printarr(int a[][]){
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//
//        }
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        fs sc = new fs();
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int u = sc.nextInt();
//        int q = sc.nextInt();
//        int a [][] = new int[n][m];
//
//        int b[][]= new int[n][m];//b is difference array
//
//
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <m; j++) {
//
//                a[i][j] = sc.nextInt();
//                b[i][j]=a[i][j];
//            }
//        }
//        //pre pro
////        int dif[][] = new int[n+1][m+1];
////        int ps[][] = new int[n+1][m+1];
////        for (int i = 1; i <=n; i++) {
////            for (int j = 1; j <=m; j++) {
////                ps[i][j]= a[i][j]+ps[i-1][j]+ps[i][j-1]-ps[i-1][j-1];
////            }
////        }
////        for (int i = 1; i <=n; i++) {
////            for (int j = 1; j <=m; j++) {
////                  if(i==1)
////                      dif[i][j]=a[i][j]-a[i][j-1];
////                  else if(j==1)
////                      dif[i][j]= a[i][j]-a[i-1][j];
////                  else
////                     dif[i][j]= -a[i][j]-dif[i-1][j]-dif[i][j-1]+dif[i-1][j-1];
////
////
////            }
////        }
//
//        for(int i=1;i<n;i++)
//            b[i][0]-=a[i-1][0];
//
//        for(int i=1;i<m;i++)
//            b[0][i]-=a[0][i-1];
//
//        for(int i=1;i<n;i++)
//        {
//            for(int j=1;j<m;j++)
//                b[i][j]=b[i][j]-a[i-1][j]-a[i][j-1]+a[i-1][j-1];
//        }
//
//
//
//
//
//        //u mods
//        for (int i = 0; i < u; i++) {
//
//
//        }
//
//        //q quaries
//
//
//
//
//
//    }
//}
//
