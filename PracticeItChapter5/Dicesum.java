/*
Write a method named diceSum that prompts the user for a desired sum, then repeatedly rolls two six-sided dice until their sum is the desired sum. Here is the expected dialogue with the user:

Desired dice sum: 9
4 and 3 = 7
3 and 5 = 8
5 and 6 = 11
5 and 6 = 11
1 and 5 = 6
6 and 3 = 9
(Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)
*/
import java.util.*;
public class Dicesum {
	public static void main(String[] args){
		diceSum();
	}
	public static void diceSum(){
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		int a = rand.nextInt(6) + 1;
		int b = rand.nextInt(6) + 1;
		System.out.print("Desired dice sum: ");
		int sum = console.nextInt();
		while(a + b != sum){
			a = rand.nextInt(6) + 1;
			b = rand.nextInt(6) + 1;
			int sumTwo = a + b;
			System.out.println(a + " and " + b + " = " + sumTwo);
		}

	}
}