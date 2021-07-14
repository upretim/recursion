public class PrintNNumbers {
    public static void main(String[] args) {
        System.out.println("=====Increasing order=====");
        PrintNNumbers.printN(5);
        System.out.println("=====Decreasing order=====");
        PrintNNumbers.printNRev(5);
    }
    /*Print n number from n to 1 using recursion*/
    // 1. increasing order
    private static void printN(int n){
        if(n==0) return;
        printN(n-1);
        System.out.println(n);
    }
    // 2. decreasing order
    private static void printNRev(int n){
        if(n==0) return;
        System.out.println(n);
        printNRev(n-1);
    }

}
