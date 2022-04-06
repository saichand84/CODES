class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfWays("11100"));;
    }
    public static long numberOfWays(String s) {
        long ans=0;
        int n = s.length();
        int z[]  = new int[n];
        int o[]= new int[n];
        int pvt = s.charAt(0)=='0'?0:1;
        if(pvt==0)
            z[0]=1;
        else
            o[0]=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='0'){
                z[i]=z[i-1]+1;
                o[i]+=o[i-1];
            }
            else{

                o[i]=o[i-1]+1;
                z[i]+=z[i-1];
            }

        }
        // System.out.println(Arrays.toString(o));

        // System.out.println(Arrays.toString(z));
        for(int i=1;i<n-1;i++){
            if(s.charAt(0)=='0'){
                int l = o[i];
                int r = o[n-1]-o[i];
                ans += l*r;
            }
            else{
                int l = z[i];
                int r = z[n-1]-z[i];
                ans  += l*r;
            }

        }


        return ans;
    }
}