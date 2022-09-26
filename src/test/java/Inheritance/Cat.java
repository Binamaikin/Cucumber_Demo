package Inheritance;

public class Cat extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c1= new Cat();
		
		System.out.println(c1.Legs);
		System.out.println(c1.eyes);
		
		c1.Walk();
		c1.Run();
		c1.Sing();

	}

}
