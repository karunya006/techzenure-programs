/**program to display  bill generater
 * since 27th june 2023(day 1)
 * 
 */
package techzenure;

import java.util.Scanner;

public class M0vie {

	public static void main(String[] args) {
		int pizzaUnitPrice=100;
		int puffUnitPrice=20;
		int coolDrinkUnitPrice=10;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no of pizzas brought:");
		int pizzaQty=sc.nextInt();
		System.out.print("enter the no of puffy brought:");
		int puffQty=sc.nextInt();
		System.out.print("enter the no of coolDrink brought:");
		int coolDrinkQty=sc.nextInt();
		System.out.println();
		int pizzaCost=pizzaUnitPrice*pizzaQty;
		int puffCost=pizzaUnitPrice*puffQty;
		int coolDrinkCost=pizzaUnitPrice*coolDrinkQty;
		System.out.println();
		System.out.println("BILL DETAILS");
		System.out.println("no of pizzas:"+pizzaQty+"cost:"+pizzaCost);
		System.out.println("no of puffs:"+puffQty+"cost:"+puffCost);
		System.out.println("no of coolDrink:"+coolDrinkQty+"cost:"+coolDrinkCost);
		System.out.println();
		System.out.printf("TOTAL price:%2\n+total cost");
		System.out.println( "ENJOY THE SHOW!!");
	
	}

}
