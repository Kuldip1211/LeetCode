<h1>Intersection of Two Arrays</h1>

<p>Given two integer arrays <code>nums1</code> and <code>nums2</code>, return an array of their intersection. Each element in the result must be <strong>unique</strong> and you may return the result in any order.</p>

<h2>Example 1</h2>
<pre>
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
</pre>

<h2>Example 2</h2>
<pre>
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
</pre>

<h2>Approach</h2>
<ol>
  <li>Convert one array into a <code>Set</code> to store unique values.</li>
  <li>Iterate through the other array and check which values are present in the first set.</li>
  <li>Store those values in another <code>Set</code> to ensure uniqueness.</li>
  <li>Return the result as an array.</li>
</ol>

<h2>Time and Space Complexity</h2>
<ul>
  <li>Time Complexity: <code>O(n + m)</code></li>
  <li>Space Complexity: <code>O(min(n, m))</code></li>
</ul>

<h2>JavaScript Code</h2>
<pre>
function intersection(nums1, nums2) {
  const set1 = new Set(nums1);
  const res = new Set();
  for (const n of nums2) {
    if (set1.has(n)) {
      res.add(n);
    }
  }
  return Array.from(res);
}
</pre>

<h2>Java Code</h2>
<pre>
import java.util.*;
class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    for (int n : nums1) set1.add(n);
    Set<Integer> res = new HashSet<>();
    for (int n : nums2) if (set1.contains(n)) res.add(n);
    int[] ans = new int[res.size()];
    int i = 0;
    for (int n : res) ans[i++] = n;
    return ans;
  }
}
</pre>

<p><em>Note:</em> The order of output elements does not matter.</p>
