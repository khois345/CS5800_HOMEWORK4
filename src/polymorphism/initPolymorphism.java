package polymorphism;

public class initPolymorphism {

	public static void main(String[] args) {
		Ship[] ships = new Ship[3];

		ships[0] = new Ship("Titanic", "1912");
		ships[1] = new CruiseShip("Disney Wish", "2022", 4000);
		ships[2] = new CargoShip("Ever Alot", "2022", 240000);

		for (Ship ship : ships) {
			ship.print();
			System.out.println();
		}
	}

}
