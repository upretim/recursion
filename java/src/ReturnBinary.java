public class ReturnBinary {

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println(returnBinary(5, ""));
        System.out.println(returnBinary(8, ""));
        System.out.println(returnBinary(2, ""));
    }

    private static String returnBinary(int n, String str){
        if(n<2) return n+str;
        return returnBinary(n/2, n%2+str);
    }
}
