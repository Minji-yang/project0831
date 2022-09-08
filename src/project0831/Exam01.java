package project0831;
class Car {
	String color;
	int speed;
	
	void upSpeed(int value){
		speed=speed+value;
	}
	
	void downSpeed(int value){
		speed=speed-value;
	}
	void print(){
		System.out.println("자동차 색상 :" + color);
		System.out.println("자동차 속성 :" + speed);
	}

}
public class Exam01 {

	public static void main(String[] args) {
		Car myCar1=new Car();
		myCar1.color="빨강";
		myCar1.speed=0;
		myCar1.upSpeed(50);
		myCar1.print();
		
		/*System.out.println("자동차 색 : "+ myCar1.color);
		System.out.println("자동차 속도  : " + myCar1.speed);
		*/
		Car myCar2=new Car();
		myCar2.color="파랑";
		myCar2.speed=30;	
		myCar2.downSpeed(10);
		myCar2.print();
		/*System.out.println("자동차 색 : "+ myCar2.color);
		System.out.println("자동차 속도  : " + myCar2.speed);*/
		
		Car myCar3=new Car();
		myCar3.color="노랑";
		myCar3.speed=100;
		myCar3.downSpeed(20);
		myCar3.print();
	/*	System.out.println("자동차 색 : "+ myCar3.color);
		System.out.println("자동차 속도  : " + myCar3.speed);*/

	}

}
