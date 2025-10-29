# 🧩 StringBuilder in Java

## 📘 Introduction
In Java, **`StringBuilder`** is a **mutable sequence of characters**, meaning it can be modified after creation — unlike the **`String`** class, which is immutable.

When you perform string concatenation using the `+` operator, new string objects are created each time, leading to **memory and performance overhead**.  
`StringBuilder` helps solve this issue by modifying the string content **in the same memory space**.

---

## ⚙️ Why Use StringBuilder?
- **Efficient for concatenation** (especially inside loops)
- **Mutable** (can change content without creating new objects)
- **Faster than String and StringBuffer** (when thread safety is not needed)
- **Reduces memory usage**

---

## 🧱 Syntax

```java
StringBuilder sb = new StringBuilder();
```

You can also initialize it with a string:
```java
StringBuilder sb = new StringBuilder("Hello");
```

---

## 🧰 Commonly Used Methods

| Method | Description | Example |
|--------|--------------|----------|
| `append()` | Adds text at the end | `sb.append(" World")` |
| `insert()` | Inserts text at a specified position | `sb.insert(5, " Java")` |
| `replace()` | Replaces characters between given indices | `sb.replace(0, 5, "Hi")` |
| `delete()` | Deletes characters between indices | `sb.delete(0, 2)` |
| `reverse()` | Reverses the sequence | `sb.reverse()` |
| `length()` | Returns the length | `sb.length()` |
| `toString()` | Converts StringBuilder to String | `sb.toString()` |

---

## 💻 Example Code

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at index 5
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace part of the string
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete part of the string
        sb.delete(3, 8);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Convert to normal string
        String normalString = sb.toString();
        System.out.println("Converted to String: " + normalString);
    }
}
```

---

## 🧠 Output

```
After append: Hello World
After insert: Hello Java World
After replace: Hi Java World
After delete: Hi ld
After reverse: dl iH
Converted to String: dl iH
```

---

## ⚡ Performance Comparison

| Operation | String | StringBuilder |
|------------|---------|---------------|
| Append in loop | Slow (creates new objects each time) | Fast (modifies in place) |
| Memory usage | High | Low |
| Thread safety | Safe | Not safe (use StringBuffer if needed) |

---

## 🧩 When to Use
✅ Use **StringBuilder** when:
- You need to perform **many string manipulations**.
- **Thread safety** is not required.
- You care about **performance and efficiency**.

❌ Use **String** when:
- The string content won’t change.
- Simplicity is more important than performance.

---

## 🏁 Summary

| Feature | String | StringBuilder | StringBuffer |
|----------|---------|---------------|---------------|
| Mutability | Immutable | Mutable | Mutable |
| Thread-Safe | Yes | No | Yes |
| Speed | Slow | Fast | Moderate |

---

## ✍️ Author
**Kuldeep Chudasama**  
💻 MERN Stack Developer | Java Enthusiast  
🔗 [LinkedIn](https://linkedin.com/in/kuldeep-chudasama-1759b1256)
