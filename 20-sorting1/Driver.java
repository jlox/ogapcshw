public class Driver {
    public static void main(String[] args) {
	try{
	    sarray s = new sarray();
	    OrderedSuperArray x = new OrderedSuperArray();
	    
	    System.out.println(s.toString());
	    System.out.println(s.size());

	    for (int i=0;i<10;i++){
		s.add(i, "JEANNEEEEEE");
	    }
	    System.out.println(s.toString());
	    System.out.println(s.size());
	    
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("An error has occured: "+e);
	}
	
    }
}
