//: control/ForEachInt.java
import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;
import static net.mindview.util.Range.range;

public class ForEachInt {

    public static void main(String[] args) {
	for(int i : range(10)) // 0..9
	    printnb(i + " ");
	print();
	for(int i : range(5, 10)) // 5..9
	    printnb(i + " ");
	print();
	for(int i : range(5, 20, 3)) // 5..20 step 3
	    printnb(i + " ");
	print();
    }

}
