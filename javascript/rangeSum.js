/* this function recursively calculates sum of first n natural numbers
for more details and explanation
https://youtu.be/2XpeZGSEJxE
*/
function rangeSum(num){
// base case when n reaches to 1.
 if(num==1) return 1;
 return num + rangeSum(num-1);
}
console.log(rangeSum(1));
console.log(rangeSum(2));
console.log(rangeSum(3));
console.log(rangeSum(4));
console.log(rangeSum(5));