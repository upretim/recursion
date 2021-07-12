  /*this function reverse a string using recursion*/
  function reverseString(str){
    return reverse(str, str.length-1)
  }
  function reverse(str, len){
        if(len ==-1) return "";
        return str.charAt(len) + reverse(str, len-1);
    }
   console.log(reverseString("hello"));