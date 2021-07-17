public class PrintBinary {

    public static void main(String[] args) {
        printBinary(5);
        System.out.println("\n");
        printBinary(8);
        System.out.println("\n");
        printBinary(2);

    }
  /*This function prints binary of a decimal number using recursion*/
    private static void printBinary(int n){
        if(n<2){
             System.out.print(n);
            return;
        }
        printBinary(n/2);
        System.out.print(n%2);
    }
    private static String returnBinary(int n, String str){
        if(n<2) return n+str;
        return returnBinary(n/2, n%2+str);
    }
}


