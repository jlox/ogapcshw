public class box{
    public String box(int r, int c){
	String row = "";
	int reset = c;    
	while (r > 0){
	    c = reset;
	    while (c > 0){
		row = row + "*";
		c = c - 1;
	    }
	    row = row + "\n";
	    r = r - 1;
	}
	return row;
    }

    public String tri1(int s){
	String triangle = "";
	int tall = s;
	int fat = 1;
	int it = 1;
	while (tall > 0){
	    while (it > 0){
		triangle+="*";
	        it-=1;
	    }
	    fat+=1;
	    it = fat;
	    triangle+="\n";
	    tall-=1;
	}
	return triangle;
    }

    public String tri2(int s){
	String triangle = "";
	int tall = s;
	int fat = 1;
	int it = 1;
	int space = s;
	while (tall > 0){
	    while (space > it){
		triangle+=" ";
		space-=1;
	    }
	    while (it > 0){
		triangle+="*";
	        it-=1;
	    }
	    fat+=1;
	    it = fat;
	    triangle+="\n";
	    space=s;
	    tall-=1;
	}
	return triangle;
    }
}

