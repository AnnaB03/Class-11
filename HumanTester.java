package syntax.class11;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human Tamana = new Human();
		Tamana.name = "Tamana";
		Tamana.age = 16;
		Tamana.height = 5.8;
		Tamana.weight = 30;
		Tamana.gender = 'F';
		Tamana.bloodType = "A+";
		
		Tamana.eat();
		Tamana.sleep();
		Tamana.walk();
		Tamana.sendMemes();
	
		System.out.println("------------------------");
		Human sebastian = new Human();
		sebastian.name = "Sebastian";
		sebastian.age = 18;
		sebastian.height = 6.5;
		sebastian.weight = 100;
		sebastian.gender = 'M';
		sebastian.bloodType = "A-";
		sebastian.eat();
		sebastian.sleep();
		sebastian.walk();
		sebastian.sendMemes();
		
				Scanner scanner = new Scanner (System.in);
				
		

	}

}
