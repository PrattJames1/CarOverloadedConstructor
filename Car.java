public class Car
{
	public int yearModel;
	public String make;
	public int speed;

	Car()
	{
		yearModel = 0;
		make = "";
		speed = 0;
	}

	Car(int newYearModel, String newMake, int newSpeed)
	{
		yearModel = newYearModel;
		make = newMake;
		speed = newSpeed;
	}

	public String toString()
	{
		return yearModel + " " + make + " " + speed + ".";
	}


	// Mutators

	public int accelerate()
	{
		speed = speed + 5;

		return speed;
	}

	public int brake()
	{
		speed = speed - 5;

		return speed;
	}

	public void setYearModel(int model)
	{
		yearModel = model;
	}

	public void setMake(String newMake)
	{
		make = newMake;
	}

	public void setSpeed(int newSpeed)
	{
		speed = newSpeed;
	}

	// Accessors

	public int getSpeed()
	{
		return speed;
	}
}