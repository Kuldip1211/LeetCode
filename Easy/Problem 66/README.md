<h1 align="center" style="color:#2c3e50;">✨ Plus One Problem ✨</h1>

<p style="font-size:16px; line-height:1.6; color:#333;">
You are given a large integer represented as an integer array <code>digits</code>, 
where each <code>digits[i]</code> is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
</p>

<p style="font-size:16px; line-height:1.6; color:#333;">
Increment the large integer by one and return the resulting array of digits.
</p>

<h2 style="color:#1a73e8;">🧩 Example 1</h2>

<pre style="background-color:#f1f3f8; padding:15px; border-radius:8px; border-left:5px solid #1a73e8;">
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
</pre>

<h2 style="color:#1a73e8;">🧩 Example 2</h2>

<pre style="background-color:#f1f3f8; padding:15px; border-radius:8px; border-left:5px solid #1a73e8;">
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
</pre>

<h2 style="color:#1a73e8;">🧩 Example 3</h2>

<pre style="background-color:#f1f3f8; padding:15px; border-radius:8px; border-left:5px solid #1a73e8;">
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
</pre>

<hr style="border: none; height: 1px; background-color: #ddd; margin: 25px 0;">

<h2 style="color:#2c3e50;">💡 Java Solution</h2>

```java
import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] plusOne(int[] digits) {
        // ✅ Convert array of digits → String
        String str = Arrays.stream(digits)
                           .mapToObj(String::valueOf)
                           .collect(Collectors.joining());

        // ✅ Convert to BigInteger
        BigInteger bignum = new BigInteger(str);

        // ✅ Add 1
        BigInteger bignum2 = bignum.add(BigInteger.ONE);

        // ✅ Convert back to string
        String numString = bignum2.toString();

        // ✅ Convert string → int[]
        int[] digitArray = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            digitArray[i] = Character.getNumericValue(numString.charAt(i));
        }

        return digitArray;
    }
}
```

<h3 style="color:#1a73e8;">🧠 Explanation (Java)</h3> <ul style="font-size:15px; line-height:1.6;"> <li><b>Step 1:</b> Convert the integer array <code>digits</code> into a string (e.g., [1,2,3] → "123").</li> <li><b>Step 2:</b> Use <code>BigInteger</code> to handle very large numbers without overflow.</li> <li><b>Step 3:</b> Add 1 to the number using <code>bignum.add(BigInteger.ONE)</code>.</li> <li><b>Step 4:</b> Convert the result back to a string (e.g., "124").</li> <li><b>Step 5:</b> Convert each character of the string into an integer and store it in a new array.</li> </ul> <hr style="border: none; height: 1px; background-color: #ddd; margin: 25px 0;"> <h2 style="color:#2c3e50;">⚡ JavaScript Solution</h2>
/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
  let str = digits.join("");         // Convert array to string
  let number1 = BigInt(str);         // Convert string to BigInt
  let number2 = number1 + 1n;        // Add 1 using BigInt arithmetic
  let result = Array.from(String(number2), Number); // Convert back to array
  return result;
};
<h3 style="color:#1a73e8;">🧠 Explanation (JavaScript)</h3> <ul style="font-size:15px; line-height:1.6;"> <li><b>Step 1:</b> Join the digits into a single string (e.g., [1,2,3] → "123").</li> <li><b>Step 2:</b> Convert the string into a <code>BigInt</code> for handling large numbers.</li> <li><b>Step 3:</b> Add 1 using <code>+ 1n</code> (the <code>n</code> denotes a BigInt literal).</li> <li><b>Step 4:</b> Convert the result back into a string, then use <code>Array.from()</code> to transform each digit back into a number.</li> </ul> <hr style="border: none; height: 1px; background-color: #ddd; margin: 25px 0;"> <p align="center" style="font-size:14px; color:#555;"> Created by <b style="color:#1a73e8;">Kuldeep Chudasama</b> 💻 </p> ```
