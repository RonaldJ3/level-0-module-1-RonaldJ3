
public class Badger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Badger ";
		String fun = "Mushroom, ";
		String boop = "Snake";
		for (int i = 0; i < 3; i = i + 1) {
			System.out.println(" ");
			for (int p = 1; p < 11; p = p + 1) {
				System.out.print(name);
			}
			for (int m = 0; m < 2; m++) {
				System.out.println();
				for (int w = 1; w < 3; w = w + 1) {
					System.out.print(fun);
					System.out.print(fun.toLowerCase());
					System.out.print("a");
					for (int j = 1; w < 11; w = w + 1) {
						System.out.println();
						for (int k = 1; w < 11; w = w + 1) {
							System.out.print(name.toLowerCase());
						}
					}
				}
			}
			System.out.println();
			System.out.print("Mush-");
			for (int x = 1; x < 2; x = x + 1) {
				System.out.print(fun.toLowerCase());
				System.out.println("a");
				for (int k = 1; x < 11; x = x + 1) {
					System.out.print(name);
				}
				System.out.println();
				System.out.print("A " + boop.toLowerCase() + ",");
				System.out.print(" a ");
				System.out.println(boop.toLowerCase());
				System.out.print(boop + "!");
				System.out.print(" Oooh, it's a " + boop.toLowerCase());
			}
		}
	}
}