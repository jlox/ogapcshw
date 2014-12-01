import java.io.*;
import java.util.*;

public class OrderedSuperArray extends SArray{
    //public String[] data;
    public static void main(String[] args){
	OrderedSuperArray osa = new OrderedSuperArray(5);
	osa.add("cat");
	osa.add("pumpernickel");
	osa.add("beats");
	osa.add("platypus");
	osa.add("pumpkin");
	System.out.println(osa.toString());
    }
    public OrderedSuperArray(int i){
	data = new String[i];
	for (int j=0;j<data.length;j++){
	    data[j]="";
	}
    }
    public void add(int index, String i){
	int length = i.length();
	int j = 0;
	while (length <= this.get(j).length()){
	    j++;
	}
	super.add(j, i);
    }
    public boolean add(String i){
	int length = i.length();
	int j = 0;
	while (length <= this.get(j).length()){
	    j++;
	}
	super.add(j, i);
	return true;
    }
}
