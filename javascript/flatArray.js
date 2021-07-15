/**flat a Javascript array */
/* explaination video  https://youtu.be/5uw-6DKH3Rk */
function flatArray(arr){
    let result =[];
    const flat=(arr)=>{
      for(let i=0;i<arr.length;i++){
          if(Array.isArray(arr[i])) flat(arr[i])
          else result.push(arr[i])
       }
    }
    flat(arr);
    return result;
}


let arr = [1,2,3,[1,2,[7,8]], 9];
console.log(flatArray(arr));