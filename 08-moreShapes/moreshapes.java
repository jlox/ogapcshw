public class moreshapes{
    public String line (String x, int l){
	String s = "";
	while (l > 0){
	    s = s + x;
	    l = l - 1;
	}
	return s;
    }

    public String frame (int r, int c) {
	String q = "";
	int count = 1;
	while (count <= r){
	    if (count == 1){
		q = q + line("*", c);
	    } else if((count != 1) && (count != r)) {
		q = q + "*" + line(" ", (c-2)) + "*";
	    } else if (count == r){
		q = q + line("*", c);
	    }
	    q = q + "\n";
	    count = count + 1;
	}
	return q;
    }

    public String stringSplosion(String str) {
	String s = "";
	int count = 0;
	while (count <= str.length()){
	    s = s + str.substring(0, count);
	    count = count + 1;
	}
	return s;
    }

    public String stringX(String str) {
	String s = "";
	for (int j=0; j<str.length(); j++) {
	    if (!(j>0 && j<(str.length()-1) && str.substring(j, j+1).equals("x"))) {
		s = s + str.substring(j, j + 1);
	    }
	}
	return s;
    }
}
