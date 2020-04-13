package Q7;

import java.util.ArrayList;

public class Q7 {
	public static void main(String[] args) {
		ArrayList <Q7> Food = new ArrayList <Q7>();
		Cookie C1 = new Cookie(1.49, "Oatmeal", "2/20/2019");
		Cookie C2 = new Cookie(2.99, "Blueberry", "1/23/2018");
		Cookie C3 = new Cookie(2.49, "Rock-flavored", "6/19/1996");
		Brownie B1 = new Brownie(1.49, "Feet-flavored", "5/10/2015");
		Brownie B2 = new Brownie(3.99, "Plain", "2/2/2029");
		Brownie B3 = new Brownie(3.99, "Double fudge", "7/18/2019");
		CinnamonRoll CR1 = new CinnamonRoll(1.99, "Doritos", "1/15/2021");
		CinnamonRoll CR2 = new CinnamonRoll(2.49, "Regular", "2/15/2019");
		CinnamonRoll CR3 = new CinnamonRoll(9.99, "Espresso infused", "6/1/2020");
		Food.add(C1); Food.add(C2);Food.add(C3);Food.add(B1);Food.add(B2);
		Food.add(B3);Food.add(CR1);Food.add(CR2);Food.add(CR3);
		for (Q7 f: Food) {
			System.out.println("Price: " f.getPrice() + "Description: " + f.getDescription() + "SellByDate: " + f.getSellByDate());
			}
		}
}