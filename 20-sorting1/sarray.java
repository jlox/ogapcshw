public class sarray {
    private String[] data;
    private int lastIndex;

    public sarray() {
	data = new String[5];
	lastIndex = 0;
    }

    public String toString() {
	String ans = "";
	for (int i = 0; i < data.length; i++) {
	    if (i < data.length - 1) {
		ans = ans + data[i] + ", ";
	    } else {
		ans = ans + data[i];
	    }
	}
	return ans;
    }

    public void expand() {
	if (lastIndex >= data.length) {
	    String[] ans = new String[data.length + 1];
	    for (int i = 0; i < data.length; i++){
		ans[i] = data[i];
	    }
	    data = ans;
	}
    }
    
    public String[] showList() {
	return data;
    }

    public boolean add(String i) {
	expand();
	data[lastIndex] = i;
	lastIndex = lastIndex + 1;
	return true;
    }

    public void add(String val, int index) {
	for (int i = lastIndex; i > 0; i--){
	    if (i > index) {
		data[i] = data[i - 1];
	    } else if (i == index) {
		data[i] = val;
		lastIndex = lastIndex + 1;
	    }
	}
    }

    public String get(int index) {
	return(data[index]);
    }

    public String set(String val, int index) {
	String original = data[index];
	data[index] = val;
	return original;
    }

    public int size() {
	return lastIndex;
    }

    public String remove(int index) {
	String original = data[index];
	String[] ans = new String[data.length - 1];
	int i = 0;
	//places all elements before the requested index in the new array
	for (i = i; i < index; i++) {
	    ans[i] = data[i];
	}
	//skip requested index, essentially removing it from the array
	//places all elements after the requested index in the array
	for (i = i; i < ans.length; i++) {
	    ans[i] = data[i+1];
	}
	data = ans;
	lastIndex = lastIndex - 1;
	return original;
    }

    public void isort() {
	int i = 0;
	while (i<data.length) {
	    String value = data[i];
	    int j = i - 1;
	    while (j > -1 && data[j].compareTo(value) > 0){
		data[j+i] = data[j];
		j = j - 1;
	    }
	    i = i + 1;
	    data[j+1] = value;
	}
    }

    public void ssort() {
	for (int i=0;i<data.length;i++){
	    String temp = "";
	    int index;
	    for (int j=0;j<data.length;j++){
		if (data[j].compareTo(data[i]) < 0){
		    index = j;
		    temp = data[i];
		    data[i] = data[index];
		    data[index] = temp;
		}
	    }

	}
    }
    /*
    public void minessort() {
	int index = 0;
	int otherdex = 1;
	int mindex = 0;
	String p1 = "";
	String replacer = "";
	while (index<data.length) {
	    while (otherdex<data.length) {
		if (data[index].compareTo(data[otherdex]) < 0){
		    mindex = index;
		    otherdex = otherdex + 1;
		} else {
		    if (data[index].compareTo(data[otherdex]) > 0){
			mindex = otherdex;
			otherdex = otherdex + 1;
		    } else {
			if (data[index].compareTo(data[otherdex]) == 0) {
			    mindex = index;
			    otherdex = otherdex + 1;
			}
		    }
		}
	    }
	    p1 = data[index];
	    replacer = data[mindex];
	    data[index] = replacer;
	    data[replacer] = p1;
	    index = index + 1;
	}
    }
    */		
}
