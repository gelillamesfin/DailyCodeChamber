const nums=[1,2,3]
const strs=['one','two','three']
const mapped=nums.flatMap((val,index)=>[val,strs[index]])

console.log(mapped)

const nestedArray=[[1,2,3],[4,5],[6,7,8]];

const flattend=nestedArray.flatMap(num=>num);
