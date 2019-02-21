
public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car(2000, "Some make");
		for (int i = 0; i < 5; i ++)
		{
			car1.accelerate();
			System.out.println("The current speed of the car is " + car1.getSpeed());
		}
		for (int i = 0; i < 5; i ++)
		{
			car1.brake();
			System.out.println("The current speed of the car is " + car1.getSpeed());
		}
		
		

	}

}
