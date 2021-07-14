 /*these 2 functions calculates Math.pow(a,b) using recursion*/
    function getPower(a, b){
        if(b==0) return 1;
        return a*getPower(a,b-1);
    }
    function getPowerII(a, b){
        if(b==0) return 1;
        if(b%2==0) return getPowerII(a ,Math.floor(b/2))*getPowerII( a, Math.floor(b/2) );
        return a * getPowerII(a, Math.floor(b/2)) * getPowerII(a, Math.floor(b/2));
    }

    console.log(getPower(3,2));
    console.log(getPowerII(3,5));