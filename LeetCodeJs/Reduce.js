const sum = (accum, curr) => {
  accum = accum + curr;
  console.log(accum, "****");
  return accum;
};

const reduce = (arr, func, init) => {
  if (arr.length === 0) {
    return init;
  } else {
    for (num of arr) {
      init = func(init, num);
      console.log(init, "....");
    }
  }
  return init;
};

console.log(reduce([1, 2, 3, 4], sum, 0));
