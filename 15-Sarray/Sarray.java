public class Sarray{
    private int[] data; // should be object[]
    private int last = 0;
    
    public sarray(){
	data = int[10];
	// start array with size 10
    }

    public int find() {
	int index = 0;
	for (int i =0; i< data.length; i++) {
	    if (data[i]==0) { // 0 is initial value
		index = i;
	    }
	}
	return index;
    }

    last = find();

    public void add(int i) {
	// add to end
	data[last] = i;
    }
    public void add(int index, int i) {
	// add at location index; shift everything else down
	for(int i = data.length-1;i>index;i--){
	    if (last = data.length) {
		int Array[] = new int[array.length*2];
	        Array = data;
		data = new int[Array.length];
	    data[i] = data[i-1];
    }

    public int get(int index) {
	return data[index];
    }

    public void set(int index, int i) {
	data[index] = i;
    }
    size();
    remove(int index); // must shift things over
	
}
