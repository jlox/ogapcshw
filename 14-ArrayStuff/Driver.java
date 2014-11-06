public class Driver {
    public static void main(String[] args){
	/*int[] tester;
	tester = new int[10];
	tester[0] = 12;
	tester[1] = 14;
	tester[2] = 3;
	tester[3] = 7;
	tester[4] = 16;
	tester[5] = 16;
	tester[6] = 16;
	tester[7] = 3;
	tester[8] = 4;
	tester[9] = 12;
	ArrayStuff homework = new ArrayStuff();
	System.out.println(homework.find(12));
        System.out.println(homework.find(111));
        System.out.println(homework.maxVal(tester));
	*/
	int n=20,
	    maxval=20;
	/*
	if (args.length > 0){
	    n = Integer.parseInt(args[0]);
	}
	if (args.length > 1){
	    maxval = Integer.parseInt(args[1]);
	}
	*/
	Mode m = new Mode(n,maxval);
	// System.out.println(m);
	//System.out.println("modecount = "+m.mode());
	System.out.println("modecount = "+m.fastmode());
    }
}
