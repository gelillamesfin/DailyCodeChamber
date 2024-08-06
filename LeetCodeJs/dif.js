function difference(num) {
  num = num.toString();
  let totalSum = 0;
  let totalProduct = 1;

  for (let i = 0; i < num.length; i++) {
    let digit = parseInt(num[i]);
    totalSum += digit;
    totalProduct *= digit;
  }
  return totalProduct - totalSum;
}

console.log(difference(321));
