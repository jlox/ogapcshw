public class sarray {
    // Sarah and I worked on the majority in class. 
    private String[] data; // should be object
    private int last; // keeps track of last number added
    
    /* ------ Constructor ------ */
    public sarray() {
	data = new String[10];
	for(int i=0;i<10;i++){
	    data[i] = "";
	}
    }
    
    public sarray(int i) {
	// start array at 10
	data = new String[i];
	for(int x=0;x<i;x++){
	    data[x]="";
	}
    }

    /* ------ Methods ------ */
    /*  public void findLast() {
	int sum;
	int index;
	for(int i=0;i<data.length;i++) {
	sum = 0;
	for(int x=i+1; x<data.length;x++) {
	sum = sum + data[x];
	}
	if(sum == 0 && i == 0 && data[i] == 0) {
	last = 0;
	break;
	} else if (sum == 0 && data[0] != 0) {
	last = i;
	break;
	}
	}
	}
    */

    public void findLast() {
	int pos = 0;
	for(int i=data.length;i>0;i--) {
	    if (!(data[i].isEmpty())) {
		pos = i;
	    }
	}
	last = pos;
    }
    public String toString() {
	String s = "";
	for(int i=0;i<data.length;i++) {
	    if (i == data.length -1) { 
		s = s + " " + data[i]; 
	    }
	    else {s = s + " " +  data[i];}
	}
	return s;
    }

    public String[] shift(int start, int end) {
	String[] storage = new String[end - start];
	int index = -1;
	for(int i=start;i<end;i++) {
	    index += 1;
	    storage[index] = data[i];
	}
	return storage;
    }

    public boolean add(String i) {
	if(last == 0) {
	    data[0] = i;
	}
        else if(data.length <= last) {
	    String[] storage = shift(0, last);
	    data = new String[data.length + 1];
	    for(int x=0;x<storage.length;x++){
		data[x] = storage[x];
	    }
	    data[last + 1] = i;
	} 
	else {
	    data[last + 1] = i;
	}
	return true;
    }
    
    public void add(int index, String i) {
        String[] storage = shift(index, data.length);
	data[index] = i;
	int index2 = -1;
	for(int x=index+1;x<data.length;x++) {
	    index2 += 1;
	    data[x] = storage[index2];
	}
    }

    public String get(int index) {
	return data[index];
    }

    public void set(int index, String i) {
	data[index] = i;
    }

    public int size() {
        int size = 0;
	for(int i=0; i<data.length; i++) {
	    if (!(data[i].isEmpty())) {
		size += 1;
	    }
	}
	return size;
    }

    public void remove(int index) {
	data[index] = "";
    }

}
