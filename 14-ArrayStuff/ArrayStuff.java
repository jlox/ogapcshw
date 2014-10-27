public class ArrayStuff{
    public int find(int[] ray, int n){
	int count = 0;
	int result = -1;
	while (count < ray.length){
	    if (ray[count] ==  n) {
		result = count;
		count = ray.length;
	    } else {
		count = count + 1;
	    }
	}
	return result;
    }

    public int maxVal(int[] ray){
	int count = 1;
	int stalin = ray[0];
	while (count < ray.length){
	    if (ray[count] > stalin) {
		stalin = ray[count];
		count = count + 1;
	    } else {
		count = count + 1;
	    }
	}
	return stalin;
    }
}
