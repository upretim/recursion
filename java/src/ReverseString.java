public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("hello", 4));
        System.out.println(reverse("the", 2));
        System.out.println(reverse("hattttt", 6));
    }
    private static String reverse(String str, int len){
        if(len ==-1) return "";
        return String.valueOf(str.charAt(len)) + reverse(str, len-1);
    }


}
