//: holding/UniqueWords.java

import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class UniqueWords {

    public static void main(String[] args) {
	Set<String> words = new TreeSet<String>(new TextFile(
							     "SetOperations.java", "\\W+"));
	System.out.println(words);
    }

}
