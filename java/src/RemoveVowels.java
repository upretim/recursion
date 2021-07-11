public class RemoveVowels {
    public static void main(String[] args) {

        String str1 = "hello world";
        System.out.println(removeVowels(str1,0,""));;
    }
    /*this method removes all the vowels from a given string using recursion*/
    private static String removeVowels(String str, int length, String result){
        if(str.length()==length) return result;
        String vowels = "aeiou";
        if(vowels.contains(String.valueOf(str.charAt(length))))
            return removeVowels(str,length+1, result);
        return removeVowels(str,length+1, result+String.valueOf(str.charAt(length)));
    }
}
