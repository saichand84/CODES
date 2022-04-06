package algorithms.searching;
// to return max(arr[i],q]
public class Bsfloor {
    public static void main(String[] args) {
        System.out.println(bsFloor(new int[]{2,5,6,23,83,334,3130},7,50));
    }
    static int bsFloor(int []a,int n,int q){
        int ans = Integer.MIN_VALUE;
        int l=0,h=n-1;
        while (l<=h){
            int m = l + (h-l)/2;
            if(a[m]>=q){
                ans = a[m];
                h=m-1;
            }
            else
                l=m+1;
        }
        return ans;
    }
}
