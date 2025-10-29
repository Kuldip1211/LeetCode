# 🧩 StringBuffer in Java

## 📘 Introduction
In Java, **`StringBuffer`** is a **mutable sequence of characters**, similar to `StringBuilder`.  
However, unlike `StringBuilder`, **`StringBuffer` is thread-safe**, meaning it can be safely used in multi-threaded environments.

When multiple threads are modifying a string simultaneously, using `StringBuffer` ensures that data remains consistent and avoids concurrency issues.

---

## ⚙️ Why Use StringBuffer?
- **Thread-safe and synchronized**
- **Mutable**, so modifications don’t create new objects
- **Efficient for string manipulation in multi-threaded environments**
- **Provides the same methods as StringBuilder**

---

## 🧱 Syntax

```java
StringBuffer sb = new StringBuffer();
```

You can also initialize it with a string:
```java
StringBuffer sb = new StringBuffer("Hello");
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
| `toString()` | Converts StringBuffer to String | `sb.toString()` |

---

## 💻 Example Code

```java
public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

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

| Operation | String | StringBuffer | StringBuilder |
|------------|---------|---------------|---------------|
| Append in loop | Slow | Fast (synchronized) | Fastest (non-synchronized) |
| Memory usage | High | Moderate | Low |
| Thread safety | Safe | Safe | Not safe |

---

## 🧩 When to Use
✅ Use **StringBuffer** when:
- You need to perform **many string manipulations** in **multi-threaded programs**.
- Thread safety is **essential**.
- You want the same features as StringBuilder but with **synchronization**.

❌ Use **StringBuilder** when:
- Only one thread is modifying the string.
- You want **maximum performance**.

---

## 🏁 Summary

| Feature | String | StringBuffer | StringBuilder |
|----------|---------|---------------|---------------|
| Mutability | Immutable | Mutable | Mutable |
| Thread-Safe | Yes | Yes | No |
| Synchronized | No | Yes | No |
| Performance | Slow | Moderate | Fast |

---

## ✍️ Author
**Kuldeep Chudasama**  
💻 MERN Stack Developer | Java Enthusiast  
🔗 [LinkedIn](https://linkedin.com/in/kuldeep-chudasama-1759b1256)
