public class Driver{
    public static void main(String[] args){
	    WordSearch ws = new WordSearch();
	    ws.addWordV1("hello", 10, 10);
	    ws.addWordH1("hello", 10, 10);
	    ws.addWordH1("hello", 9, 9);
	    ws.addWordH2("hello", 3, 6);
	    ws.addWordH2("hello", 12, 12);
	    ws.addWordH2("hello", 13, 11);
	    System.out.println(ws.toString());
    }
}
