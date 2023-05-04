package Day7;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        double average = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = (double) sum / arr.length;
        System.out.println("Average of array elements is: " + average);

	}

}
