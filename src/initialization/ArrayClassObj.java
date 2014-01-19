//: initialization/ArrayClassObj.java
// Creating an array of nonprimitive objects.
import static net.mindview.util.Print.print;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {

    public static void main(String[] args) {
	Random rand = new Random(47);
	Integer[] a = new Integer[rand.nextInt(20)];
	print("length of a = " + a.length);
	for (int i = 0; i < a.length; i++)
	    a[i] = rand.nextInt(500); // Autoboxing
	print(Arrays.toString(a));
    }

}
