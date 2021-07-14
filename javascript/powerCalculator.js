 /*these 2 functions calculates Math.pow(a,b) using recursion*/
    function calculatePower(a, b){
        if(b==0) return 1;
        return a*calculatePower(a,b-1);
    }
    function calculatePowerII(a, b){
        if(b==0) return 1;
        if(b%2==0) return calculatePowerII(a ,Math.floor(b/2))*calculatePowerII( a, Math.floor(b/2) );
        return a * calculatePowerII(a, Math.floor(b/2)) * calculatePowerII(a, Math.floor(b/2));
    }

    console.log(calculatePower(3,2));
    console.log(calculatePowerII(3,5));