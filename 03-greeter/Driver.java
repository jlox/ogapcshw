import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	String s="jeanne locker";
	space = s.indexOf(" ");
	lastname = s.substring(space);
	firstname = s.substring(0, space);
	return "last name is: " +  lastname;
	return "first name is: " + firstname;
    }
}
