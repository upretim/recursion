public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println(getPower(3,2));
        System.out.println(getPowerII(3,5));
    }
    /*these 2 functions calculates Math.pow(a,b) using recursion*/
    private static int getPower(int a, int b){
        if(b==0) return 1;
        return a*getPower(a,b-1);
    }
    private static int getPowerII(int a, int b){
        if(b==0) return 1;
        if(b%2==0)  return getPowerII(a,b/2)*getPowerII(a,b/2);
        return a*getPowerII(a,b/2)*getPowerII(a,b/2);
    }
}
