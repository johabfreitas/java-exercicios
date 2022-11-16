package application;

public class App {

	public static void main(String[] args) {
		int [] vect = {2, 3, 5, 7, 11, 13, 18, 34};
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.println(vect[i]);
			}
		}

	}

}
