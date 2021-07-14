function printN(n){
  if(n==0) return;
  console.log(n);
  printN(n-1);
}
printN(5);

console.log("============");

function printNRev(n){
  if(n==0) return;
  printNRev(n-1);
  console.log(n);
}
printNRev(5);