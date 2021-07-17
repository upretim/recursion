    function returnBinary(n, str){
        if(n<2) return n+str;
        return returnBinary(Math.floor(n/2), n%2+str);
    }

    console.log(returnBinary(2, ""));
    console.log(returnBinary(5, ""))
    console.log(returnBinary(10, ""))