
/*print n number from n to 1 using recursion*/
//1. Increasing order
function printN(n){
  if(n==0) return;
  printN(n-1);
  console.log(n);
}
console.log("=====increasing order=======");
printN(5);

//2. Decreasing (reverse) order
function printNRev(n){
  if(n==0) return;
  console.log(n);
  printNRev(n-1);
}
console.log("=====reverse order=======");
printNRev(5);
