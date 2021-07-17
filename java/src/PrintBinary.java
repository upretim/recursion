public class PrintBinary {
    public static void main(String[] args) {
        printBinary(43);
        System.out.println("\n");
        printBinary(2);
        System.out.println("\n");
        printBinary(12);
        System.out.println("\n");
    }
    /*this function prints binary of a decimal number*/
    private static void printBinary(int n){
        if(n<2) {
            System.out.print(n);
            return;
        }
        printBinary(n/2);
        System.out.print(n%2);
    }
}
