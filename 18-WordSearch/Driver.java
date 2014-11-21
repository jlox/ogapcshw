import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
    	Random r = new Random();
	    WordSearch ws = new WordSearch();
	    String[] words = new String[]{"bacon", "brownies", "pancakes", "cookies",
	    "steak", "spaghetti", "apple", "orange", "banana", "hamburger", 
	    "biscuit", "blackberry", "cheesecake", "lasagna", "lobster", "macaroon", 
	   	"marshmallow", "noodles", "oatmeal", "pizza", "sushi", "pineapple", 
	    "parsnip", "pomegranate", "persimmon", "pumpernickel", "sesame", 
	    "spinach", "scallops", "risotto", "ravioli", "watermelon"};
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    int index;
	    for (int i=0;i<15;i++){
	    	index = r.nextInt(words.length);
	    	while (al.contains(index)){
	    		index = r.nextInt(words.length);
	    	}
	    	ws.addWord(words[i]);
	    }

		//ws.fill();
	    System.out.println(ws.toString());
    }
}
