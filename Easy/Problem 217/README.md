# 🧩 Contains Duplicate — Solution in JavaScript and Java

## 📘 Problem Statement

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is **distinct**.

---

### 🧠 Example 1:
**Input:**
```text
nums = [1,2,3,1]
```
**Output:**
```text
true
```
**Explanation:**  
The element `1` occurs twice — at indices `0` and `3`.

---

### 🧠 Example 2:
**Input:**
```text
nums = [1,2,3,4]
```
**Output:**
```text
false
```
**Explanation:**  
All elements are distinct.

---

### 🧠 Example 3:
**Input:**
```text
nums = [1,1,1,3,3,4,3,2,4,2]
```
**Output:**
```text
true
```

---

## 💡 Approach

1. **Sort** the array so that duplicate elements come **next to each other**.  
2. **Compare** each element with its next one.  
   - If `nums[i] == nums[i + 1]`, return `true`.  
3. If no duplicates are found, return `false`.

### 🕒 Time Complexity:
- **O(n log n)** — due to sorting.
- **O(1)** — extra space (if sorting in place).

---

## 🚀 JavaScript Solution

```javascript
function containsDuplicate(nums) {
  // Step 1: Sort the array
  nums.sort((a, b) => a - b);

  // Step 2: Compare adjacent elements
  for (let i = 0; i < nums.length - 1; i++) {
    if (nums[i] === nums[i + 1]) {
      return true; // Duplicate found
    }
  }

  // Step 3: No duplicates found
  return false;
}

// Example Usage
console.log(containsDuplicate([1, 2, 3, 1])); // true
console.log(containsDuplicate([1, 2, 3, 4])); // false
console.log(containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2])); // true
```

---

## ☕ Java Solution

```java
import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Compare adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }

        // Step 3: No duplicates found
        return false;
    }

    // Example Usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 4})); // false
        System.out.println(sol.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
    }
}
```

---

## 🧾 Explanation

| Step | Description | Example |
|------|--------------|----------|
| 1️⃣ | Sort the array | `[1,2,3,1]` → `[1,1,2,3]` |
| 2️⃣ | Compare adjacent elements | `1 == 1` → Duplicate found |
| ✅ | Return `true` | Output → `true` |

---

## 🔍 Key Takeaways

- Sorting makes duplicate detection simple and efficient.
- This approach avoids using extra memory (like HashSets).
- It’s a clean and intuitive solution for small to medium datasets.

---
