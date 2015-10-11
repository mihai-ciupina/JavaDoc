//: object/HelloDate.java
import java.util.*;
/** The first Thinking in Java example program.
* Displays a string and today’s date.
* @author Bruce Eckel
* @author www.MindView.net
* @version 4.0
*/
public class HelloDate {

/** Entry point to class & application.
* @param args array of string arguments
* @throws exceptions No exceptions thrown
*/
public static void main(String[] args) {
System.out.println("Hello, it’s: ");
System.out.println(new Date());
}

/** Some test function
* @deprecated foo is deprecated. You should use bar for now on!
* @param firstPar1 This is the first parameter
* @return int value
* @since v1.0
*/
public int foo(int firstPar1) {
    int i = 1;
    return i;
}
} /* Output: (55% match)
Hello, it’s:
Wed Oct 05 14:39:36 MDT 2005
*///:~
