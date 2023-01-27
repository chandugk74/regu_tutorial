package com.myjavapractice.polymorphism;

public class TestMain {

	public static void main(String args[]) {
		Trainer trainer = new Trainer();
		Animal dog = new Dog();
		Animal bird = new Bird();
		Animal fish = new Fish();
		Animal Snake = new Snake();
		
		trainer.teach(fish);
		trainer.teach(bird);
		trainer.teach(dog);
		trainer.teach(Snake);
	}
	
	
}
