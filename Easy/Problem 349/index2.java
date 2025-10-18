import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // ✅ Use HashSet for fast lookup and to avoid duplicates
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                resultSet.add(n);
            }
        }

        // ✅ Convert HashSet<Integer> → int[]
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
