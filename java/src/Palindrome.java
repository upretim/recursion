public class Palindrome {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "racecar";
        String s3 = "hello";
        System.out.println(isPalindrome(s1, 0, s1.length()-1));
        System.out.println(isPalindrome(s2, 0, s2.length()-1));
        System.out.println(isPalindrome(s3, 0, s3.length()-1));
    }
    private static boolean isPalindrome(String str, int start, int end){
        if(start>=end) return true;
        if(str.charAt(start)!=str.charAt(end)) return  false;
        return isPalindrome(str, start+1, end-1);
    };
}
