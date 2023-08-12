package zweiter.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		while(continueLoop) {
			try{
				System.out.print("Введите целое число: ");
				int n = scanner.nextInt();

				int n0 = 1;
				int n1 = 1;
				System.out.println("первые " + n + " чисел Фибоначчи: ");
				System.out.print(n0+" "+n1+" ");
				for(int i = 3; i <= n; i++){
					int n2=n0+n1;
					System.out.print(n2+" ");
					n0=n1;
					n1=n2;
				}
			}catch(InputMismatchException e) {
				System.out.println("Это не целое число.");
				scanner.next();
			}
			
		}
		 scanner.close();
	}
	
}
