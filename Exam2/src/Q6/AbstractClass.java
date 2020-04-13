package Q6;

import java.util.ArrayList;

public class AbstractClass {
		public static void main(String [] args) {
			ArrayList<Shippy> Ships = new ArrayList <Shippy>();
			SpaceShip STShip1 = new StarWarsSpaceShip (3200, "Exquisitor", "Star Wars");
			SpaceShip STShip2 = new StarWarsSpaceShip (1, "Onyx", "Star Wars");
			SpaceShip STShip3 = new StarWarsSpaceShip (8000, "Clepalo", "Star Wars");
			SpaceShip SWShip1 = new StarTrekSpaceShip (2845, "Justice Saint", "Star Trek");
			SpaceShip SWShip2 = new StarTrekSpaceShip (2578, "Lupradore", "Star Trek");
			SpaceShip SWShip3 = new StarTrekSpaceShip (10000, "Hellfire", "Star Trek");
			SpaceShip WHShip1 = new OtherSciFiSpaceShip (12000, "Emporer 1", "Warhammer 40k");
			SpaceShip WHShip2 = new OtherSciFiSpaceShip (8590, "Titan", "Warhammer 40k");
			SpaceShip WHShip3 = new OtherSciFiSpaceShip (69, "Papal", "Warhammer 40k");
			Ships.add(STShip1);
			Ships.add(STShip2);
			Ships.add(STShip3);
			Ships.add(SWShip1);
			Ships.add(SWShip2);
			Ships.add(SWShip3);
			Ships.add(WHShip1);
			Ships.add(WHShip2);
			Ships.add(WHShip3);
			
				for (Shippy arrList: Ships) {
			
					System.out.println("Name:" + arrList.getName() + "Weight:" + arrList.getWeight() + " Mapped destination: " + arrList.getDestination()); 
			}
		}
}
