//driver program to test Car Class
class CarDemo
{
   public static void main (String [] args)
   {
      Car honda = new Car (); //default constructor

      honda.accelerate();
      System.out.println(honda.getSpeed());
      honda.accelerate();
      System.out.println(honda.getSpeed());
      honda.accelerate();
      System.out.println(honda.getSpeed());

      //accessor methods
      honda.brake();
      System.out.println(honda.getSpeed());
      honda.brake();
      System.out.println(honda.getSpeed());
      honda.brake();
      System.out.println(honda.getSpeed());
      
      //overloaded constructore
      Car suv = new Car(2008, "Lexus R350", 43);

      //toString is being called 
      System.out.println(suv);
      
      //mutator methods
      suv.setYearModel(2016);
      suv.setMake("Tesla Model X");
      suv.setSpeed(74);

      System.out.println(suv);
   }
}