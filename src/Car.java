public class Car {
    private boolean engine;



    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
      return this.name+" "+this.cylinders ;
    }
    @Override
    public boolean equals(Object car){

        return (((Car)car).name==this.name && ((Car)car).cylinders==this.cylinders);
    }
    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("the car's engine is starting");

    }
    public void accelerate(){
        System.out.println(getClass().getSimpleName());

        System.out.println("the car's accelerating");
    }
    public void brake(){
        System.out.println(getClass().getSimpleName());

        System.out.println("the car's engine is braking");
    }
}
