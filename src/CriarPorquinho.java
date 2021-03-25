package src;

import java.util.Scanner;

interface Animal {
	public void animalSound();

	public void sleep();
}

class Pig implements Animal {
	public String name;
	public int age;
	private int idadeMax = 10;

	public void animalSound() {
		if (this.age >= this.idadeMax) {
			System.out.println("Esse porquinho está muito velho para fazer: oinc oinc. :(");
		} else {
			System.out
					.println("O nome do porquinho é: " + this.name + " e sua idade é: " + this.age + ", ele diz: oinc oinc");
		}
	}

	public void sleep() {
		System.out.println("Zzz");
		System.out.println("Shhhh!! Ele tá dormindo");
		if (this.age >= this.idadeMax) {
			System.out.println("É, esquece, ele morreu mesmo....");
		}
	}
}

class CriarPorquinho {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Pig myOldPig = new Pig();

		myOldPig.age = in.nextInt();
		myOldPig.name = in.next();

		in.close();

		myOldPig.animalSound();
		myOldPig.sleep();
	}
}
