const sleep=async(millis)=>{
    if(millis<1 || millis >1000){
        throw error('input out of range')
    }
    return new Promise(resolve=>{
        setTimeout(resolve,millis)
    })
}