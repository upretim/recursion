/* this function check if a string is palindrome using recurion*/

function isPalindrome(str){
    return palindrome_helper(str,0, str.length-1);
}
function palindrome_helper(str, start, end){
    if(start>=end) return true;
    if(str.charAt(start)!==str.charAt(end)) return false;
    return palindrome_helper(str, start+1,end-1);
}
console.log(isPalindrome("madam"));
console.log(isPalindrome("racecar"));
console.log(isPalindrome("hello"));