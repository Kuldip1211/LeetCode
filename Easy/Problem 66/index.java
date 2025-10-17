
import java.math.BigInteger;
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
