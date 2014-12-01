import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
    	Random r = new Random();
	WordSearch ws = new WordSearch();
	//SArray sa = new SArray();
	OrderedSuperArray osa;
	/*String[] words = new String[]{"bacon", "brownies", "pancakes", "cookies",
	  "steak", "spaghetti", "apple", "orange", "banana", "hamburger", 
	  "biscuit", "blackberry", "cheesecake", "lasagna", "lobster", "macaroon", 
	  "marshmallow", "noodles", "oatmeal", "pizza", "sushi", "pineapple", 
	  "parsnip", "pomegranate", "persimmon", "pumpernickel", "sesame", 
	  "spinach", "scallops", "risotto", "ravioli", "watermelon"};*/
	Scanner sc=null;
	try{
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e){
	    System.out.println("ur poop");
	    System.exit(0);
	}
	ArrayList<String> words = new ArrayList<String>();
	while (sc.hasNext()){
	    String s = sc.next();
	    words.add(s);
	}
	//System.out.println(words);
	    
	/* puts words in order of size (biggest to smallest) */
	osa = new OrderedSuperArray(words.size());
	for (int i=0;i<words.size();i++){
	    osa.add(words.get(i));
	}
	//System.out.println(osa.toString());
	for (int i=0;i<words.size();i++){
	    words.set(i, osa.get(i));
	}
	//System.out.println(words);
	    
	ArrayList<Integer> al = new ArrayList<Integer>();
	int index;
	int count = 0;
	int c = 0;
	int row = 0;
	int col = 0;
	boolean back = false;
	//for (int i=0;i<30;i++){
	    
	/* 
	   adds as many words as possible downwards vertical largest to
	   smallest
	   first goes from right to left, then left to right
	   comment out the stuff after this if you wanna see what it does
	*/
	while(c<words.size()){
	    index = c; //r.nextInt(words.size());
	    /*while (al.contains(index)){
	    //index = r.nextInt(words.size());
	    }*/
	    /*if(ws.addWord(words.get(index))){
	      al.add(index);
	      count++;
	      }*/
	    //System.out.println(row + " " + col);
	    if(ws.addWordV1(words.get(index), row, col)){
		count++;
		if (col<29&&!back){
		    col++;
		}
		else if (col>0&&back){
		    col--;
		}
		else if (col == 29){
		    back = true;
		}
		else if (col == 0){
		    back = false;
		}
		row = 0;
		while (ws.value(row, col) != '.'){
		    if (row<29){
			row++;
		    }
		    else{
			break;
		    }
		}
	    }
	    //row++;
	    //col++;
	    c++;
	    //System.out.println(words);
	    //System.out.println(ws.toString());
	}
	col = 29;
	row = 0;
	    
	int len = 0;
	String filler = "";
	int last = words.size()-1;
	/* 
	   adds as many words downwards vertically as possible moving from
	   right to left
	   SUPPOSED to find the first word in the word list that perfectly
	   fits the space given
	   runs into some problem and doesn't wanna work QQ
	*/
	while (col>=0){
	    while (row<=29){
		if (ws.value(row,col) == '.'){
		    len++;
		}
		row++;
	    }
	    if (len>2){
	    	row = 0;
	    	while (ws.value(row,col) != '.'){
		    row++;
	    	}
	    	while (filler.compareTo("")==0){
		    if (words.get(last).length()==len){
			filler = words.get(last);
		    }
		    else{
			last--;
		    }
	    	}
	    	//System.out.println(row + " " + col);
	    	ws.addWordV1(filler, row, col);
	    	count++;
	    }
	    col--;
	    row = 0;
	    filler = "";
	    len = 0;
	    last = words.size()-1;
	    //System.out.println(ws.toString());
	}
	col = 0;
	row = 0;
	last = words.size()-1;
	len = 0;
	filler = "";
	while (ws.value(row, col) != '.'){
	    row++;
	}
	//System.out.println(ws.toString());
	/*
	  adds as many words as possible going horizontally left to right
	  checks to see which rows have enough space to fit a word and is
	  SUPPOSED to find the word that perfectly fits
	  also runs into some problems (curse you...)
	*/
	while (row<=29){
	    while (col<=29){
		if (ws.value(row,col) == '.'){
		    len++;
		}
		col++;
	    }
	    //System.out.println(len);
	    if (len>2){
	    	col = 0;
	    	while (ws.value(row,col) != '.'){
		    col++;
	    	}
	    	while (filler.compareTo("")==0){
		    if (words.get(last).length()==len){
			filler = words.get(last);
		    }
		    else{
			last--;
		    }
	    	}
	    	//System.out.println(row + " " + col);
	    	ws.addWordH1(filler, row, col);
	    	count++;
	    }
	    row++;
	    col = 0;
	    filler = "";
	    len = 0;
	    last = words.size()-1;
	    //System.out.println(ws.toString());
	}
	/*
	  counts up the number of periods to see how many spaces aren't filled
	*/
	row = 0;
	col = 0;
	int periods = 0;
	while (row<=29){
	    while (col<=29){
		if (ws.value(row, col) == '.'){
		    periods++;
		}
		col++;
	    }
	    col = 0;
	    row++;
	}

	ws.fill();
	System.out.println(ws.toString());
	String s = "";
	int num = 0;
	int spaces;
	for (int i=0;i<al.size();i++){
	    spaces = 15 - words.get(al.get(i)).length();
	    s += words.get(al.get(i));
	    while (spaces>0){
		s += " ";
		spaces--;
	    }
	    num++;
	    if (num == 5){
		s += "\n";
		num = 0;
	    }
	}
	//System.out.println(s);
	System.out.println("There are " + count + " words in this WordSearch.");
	System.out.println("There were " + periods + " empty spaces in this WordSearch.");
    }
}
