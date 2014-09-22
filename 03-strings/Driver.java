import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	String s="jeanne locker";
	int space = s.indexOf(" ");
	String lastname = s.substring(space);
	String firstname = s.substring(0, space);
	System.out.println("last name is: " +  lastname);
	System.out.println("first name is: " + firstname);
    }
}
