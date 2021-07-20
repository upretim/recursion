/**this function deep clones a javascript object using recursion */
function deepCloneObject(obj, copy={}){
    for(let prop in obj){
        copy[prop] = {};
        if(typeof obj[prop]==='object') deepCloneObject(obj[prop], copy[prop]);
        else copy[prop] = obj[prop];
    }
    return copy;
}

let obj = {
           a:{
            b: {
                c: {
                      d:{
                          e:1
                        }
                    }
                }
            }
        }

 let deepCopy = deepCloneObject(obj) ;   
 let shallowCopy = obj;
 deepCopy['a']['b']['c']['d']['e'] =5;

 console.log(JSON.stringify(deepCopy));
 console.log(JSON.stringify(obj));
 shallowCopy['a']['b']['c']['d']['e'] =3;
 console.log(JSON.stringify(shallowCopy));
 console.log(JSON.stringify(obj));
 console.log(JSON.stringify(deepCopy));