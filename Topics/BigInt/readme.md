<h1>Using BigInteger in Java</h1>

<p>
In Java, when you need to handle very large integers that exceed the limits of primitive data types like 
<b>int</b> or <b>long</b>, you can use the <b>BigInteger</b> class from the <b>java.math</b> package.
</p>

<p>
The <b>BigInteger</b> class allows you to perform arithmetic operations on numbers of any size — limited only by your system’s memory.
</p>

<h2>Example: Taking BigInteger Input in Java</h2>

<pre><code>
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a big integer: ");
        BigInteger num = sc.nextBigInteger(); // Reads large number

        System.out.println("You entered: " + num);
    }
}
</code></pre>

<h2>Explanation:</h2>
<ul>
  <li><b>Import Statements:</b> The <code>java.math.BigInteger</code> package provides the BigInteger class.</li>
  <li><b>Scanner:</b> Used to take input from the user.</li>
  <li><b>nextBigInteger():</b> Reads a large integer value from the input.</li>
  <li><b>Output:</b> Prints the entered big integer.</li>
</ul>

<h2>Sample Output:</h2>

<pre><code>
Enter a big integer: 999999999999999999999999999
You entered: 999999999999999999999999999
</code></pre>

<p>
<b>Tip:</b> You can also perform operations using methods like 
<code>add()</code>, <code>subtract()</code>, <code>multiply()</code>, and <code>divide()</code>.
</p>
