package Day1;

public class FindTheSmallestIntegerInTheArray1_2 {
	public static void main(String args[]) {
		int[] arr = {1,2,3,-1};
		int a = findSmallestInt(arr);
		System.out.println(a);
	}
	public static int findSmallestInt(int[] args) {
        int min = args[0];
        for(int i = 0; i < args.length ; i++) {
            if(args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}
