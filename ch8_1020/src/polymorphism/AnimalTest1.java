package polymorphism;

import java.util.ArrayList;

class Animal{
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move()
	{
		System.out.println("사람이 두 발로 걷습니다. ");
	}
	
	public void readBook()
	{
		System.out.println("사람이 책을 읽습니다. ");
	}
}

class Tiger extends Animal{
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
	
	public void hunting() 
	{
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

class kmj extends Animal{
	public void move()
	{
		System.out.println("김민지가 걸어 갑니다.");
	}
	
	public void read() 
	{
		System.out.print("김민지가 책을 읽습니다.");
	}
}

public class AnimalTest1 {
	
	 public static void main(String[] args) {
		  AnimalTest1 aTest = new AnimalTest1();
		  aTest.moveAnimal(new Human());
		  aTest.moveAnimal(new Tiger());
		  aTest.moveAnimal(new kmj());
	 }

	 public void moveAnimal(Animal animal) { //매개 변수의 자료형이 상위 클래스
		  animal.move(); 
		  //재정의 된 메서드 호출
	 }   

}



