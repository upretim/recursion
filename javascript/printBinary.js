 /*this function prints binary of a decimal number*/
    function printBinary(n){
        if(n<2) {
            console.log(n);
            return;
        }
        printBinary(Math.floor(n/2));
        console.log(n%2);
    }
    printBinary(3)