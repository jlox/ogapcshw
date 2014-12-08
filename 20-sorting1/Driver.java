public class Driver {
    public static void main(String[] args) {
	try{
	    sarray s = new sarray();
	    OrderedSuperArray x = new OrderedSuperArray();
	    
	    System.out.println(s.toString());
	    System.out.println(s.size());

	    for (int i=0;i<10;i++){
		s.add("JEANNEEEEEE");
	    }
	    s.set("DERRICK", 5);
	    s.set("ZAMANSKY", 8);
	    s.set("SPARTANS", 3);
	    s.set("PINEAPPLE", 7);
	    s.set("DOUBLELEG", 2);

	    sarray r = s;
	    sarray t = s;
	    
	    System.out.println(s.toString());
	    s.isort();
	    System.out.println(s.toString());
	    System.out.println("icount is: " + s.icount);
	    r.ssort();
	    System.out.println(r.toString());;
	    System.out.println("scount is: " + r.scount);
	    t.bsort();
	    System.out.println(t.toString());
	    System.out.println("bubcount is: " + t.bubcount);
	    System.out.println(s.size());
	    
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("An error has occured: "+e);
	}
	
    }
}
