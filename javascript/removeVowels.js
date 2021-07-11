
/* This function removes all the vowels from a string using recursion
 for detail explanation please watch
 https://youtu.be/QRW43YPDcNM
*/
function removeVowels(){
    let str = "hello world";
    console.log(removeVowels_helper(str, 0, ""));
}

function removeVowels_helper(str, length, result){
  if(str.length==length) return result;
  let vowels = "aeiou";
   if(vowels.includes(str.charAt(length))) 
      return removeVowels_helper(str, length+1, result);
   return removeVowels_helper(str, length+1, result+ str.charAt(length));
}
removeVowels();