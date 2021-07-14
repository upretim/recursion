public class PrintNNumbers {
    public static void main(String[] args) {
        PrintNNumbers.printN(5);
        System.out.println("==========");
        PrintNNumbers.printNRev(5);
    }
    /*print n number from n to 1 using recursion*/
    // 1. increasing order
    private static void printN(int n){
        if(n==0) return;
        System.out.println(n);
        printN(n-1);
    }
    // 2. reverse order
    private static void printNRev(int n){
        if(n==0) return;
        printNRev(n-1);
        System.out.println(n);
    }
}
