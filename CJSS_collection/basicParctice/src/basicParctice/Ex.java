package basicParctice;

public class Ex {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6};
		int odd = 1;
		int even = 0;
		int newArr[] = new int[arr.length];
//		for (int i = 0, j = arr.length / 2; i < arr.length / 2 && j < arr.length ; i++, j++) {
//			newArr[even] = arr[i];
//			newArr[odd] = arr[j];
//			even += 2;
//			odd += 2;
//		}
		
		
		for (int i : newArr) {
			System.out.println(i);
		}
	}
}
