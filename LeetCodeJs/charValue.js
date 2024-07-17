// Input Format:// Single line containing the string of new number system’s number
// Output Format:
// Single line denoting the integer with the same decimal value as the input string
// Sample input 1: e
// Sample Output: 5
// Sample  Input 2: ac
// Sample Output: 23
const charToValue = (char) => {
  if (char.length === 0 || char < "a" || char > "t"|| char.length>2) {
    throw new error("Invalid Input");
  }

  if (char.length === 1) {
    return char.charCodeAt(0) - "a".charCodeAt(0) + 1;
  } else {
    const firstValue = char[0].charCodeAt(0) - "a".charCodeAt(0) + 1;
    const secondValue = char[1].charCodeAt(0) - "a".charCodeAt(0) + 1;
    return firstValue * 20 + secondValue;
  }
};
console.log(charToValue("ac"));
