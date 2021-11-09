package syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		// Creating an object of Dog class
		
		Dog alonasDog = new Dog(); //the constructor
		alonasDog.name = "Lexy";
		alonasDog.breed = "american hound";
		alonasDog.colors = "black";
		alonasDog.height = 2.5;
		alonasDog.age = 10;
		alonasDog.gender = 'M';
		
		System.out.println("My Dog Name is "+alonasDog.name);
		System.out.println("His Breed is "+ alonasDog.breed);
		System.out.println("His color is "+ alonasDog.colors);
		
		Dog jimmaysDog = new Dog();
		jimmaysDog.name = "Teddy";
		jimmaysDog.breed = "Labrador Retriever";
		jimmaysDog.colors = "Golden";
		jimmaysDog.height = 5;
		jimmaysDog.gender = 'M';
		
		System.out.println("My Dog Name is "+jimmaysDog.name);
		System.out.println("His Breed is "+ jimmaysDog.breed);
		System.out.println("His color is "+ jimmaysDog.colors);
		
		

	}

}
