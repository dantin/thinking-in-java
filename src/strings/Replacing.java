//: strings/Replacing.java

import static net.mindview.util.Print.print;

public class Replacing {

    static String s = Splitting.knights;

    public static void main(String[] args) {
	print(s.replaceFirst("f\\w+", "located"));
	print(s.replaceAll("shrubbery|tree|herring", "banana"));
    }

}
