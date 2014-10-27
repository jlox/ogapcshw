public class Driver {
    public static void main(String[] args){
	int[] tester;
	tester = new int[5];
	tester[0] = 12;
	tester[1] = 14;
	tester[2] = 3;
	tester[3] = 7;
	tester[4] = 16;
	ArrayStuff homework = new ArrayStuff();
	System.out.println(homework.find(tester, 12));
        System.out.println(homework.find(tester, 111));
        System.out.println(homework.maxVal(tester));
    }
}
