package test;

public class Q3 {
	String arr[] = { "shashi", "nitin", "suresh", "manoj", "karan", "aman" };
	String temp = "";

	public void displayUnsorted() {
		System.out.println("UNSORTED LIST:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public void sort() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[i]) < 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("");
	}
	
	public void displaySorted() {
		System.out.println("SORTED LIST:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String a[]) {
		Q3 ob = new Q3();
		ob.displayUnsorted();
		ob.sort();
		ob.displaySorted();

	}

}
