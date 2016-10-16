import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		int i=0;
		System.out.println("Input Number: ");
		int n = scan.nextInt();
			
		for(i=0;i<n; i++){
			if(i%3==0 && i%7==0){
				System.out.println(i);
			}
		}
			
		
	}
			
	}


