package aaaaa;
import java.util.Scanner;

public class Pizzahut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			Pizza pi = new Pizza();
			ChickenPizza cp = new ChickenPizza();
			MuttonPizza mp = new MuttonPizza();
			int ch;
			do {
				Scanner sc= new Scanner(System.in);
			System.out.println("Price of Chicken Pizza: Rs 199 and Mutton Pizza: Rs 399");
			System.out.println("Please select choice \n 1. Chicken Pizza \n 2. Mutton Pizza:");
			ch =sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("For CHICKEN PIZZA");
				cp.display();
				break;
			}
			case 2:
			{

				System.out.println("For MUTTON PIZZA");
				mp.display();
				break;
			}
			default:
			{
				System.out.println("Wrong input!");
				break;
			}
			}
			}while(ch>3);
			}
			
		
	}


