import java.io.*;
import java.util.*;

public class Greeter {
    public void greet() {
	String s = new String("Hello world!");
	System.out.println(s);
	ungreet();
    }
    public void ungreet() {
	System.out.println("I'm out.");
    }
}
