const argumentsLength = function (...args) {
  if (args.length === 0) {
    return 0;
  }
  return args.length;
};
console.log(argumentsLength(1, 2, 3)); // 3


