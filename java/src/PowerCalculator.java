public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println(calculatePower(3,2));
        System.out.println(calculatePowerII(3,5));
    }
    /*these 2 functions calculates Math.pow(a,b) using recursion*/
    private static int calculatePower(int a, int b){
        if(b==0) return 1;
        return a*calculatePower(a,b-1);
    }
    private static int calculatePowerII(int a, int b){
        if(b==0) return 1;
        if(b%2==0)  return calculatePowerII(a,b/2)*calculatePowerII(a,b/2);
        return a*calculatePowerII(a,b/2)*calculatePowerII(a,b/2);
    }
}
