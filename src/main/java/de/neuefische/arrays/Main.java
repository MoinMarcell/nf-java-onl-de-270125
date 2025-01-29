package de.neuefische.arrays;

public class Main {
	public static void main(String[] args) {
		// Jedes Array hat eine feste Größe
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		int[] numbers2 = {6, 7, 8, 9, 10};
		System.out.println(numbers[2] + numbers[3]); // Ergebnis 7
		 //int n = numbers[5]; <- führt zu einer ArrayIndexOutOfBoundsException (Programmabsturz)
		System.out.println();

		// numbers.length gibt uns die Länge des Arrays zurück
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] % 2 == 0){
				System.out.println(numbers[i]);
			}
		}

		// foreach-Schleife
		for(int number : numbers2){
			System.out.println(number);
		}
	}
}
