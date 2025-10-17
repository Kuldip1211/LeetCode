/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
let str = digits.join("");

let number1 = BigInt(str);

let number2 = number1+1n;

let result = Array.from(String(number2), Number);
return result;
};
