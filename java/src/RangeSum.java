public class RangeSum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    /* this function recursively calculates sum of first n natural numbers*/
    private static int sum(int n){
        // base case when n reaches to 1.
        if(n==1) return 1;
        return n + sum(n-1);
    }
}
