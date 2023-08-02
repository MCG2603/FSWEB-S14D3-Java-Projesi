public class CarSkeleton {
    public String name;
    public String description;

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("the car's engine is starting");

    }
    public void drive(){
        System.out.println(getClass().getSimpleName());
        this.runEngine();

        System.out.println("the car's driving");
    }
    protected void runEngine(){
        System.out.println(getClass().getSimpleName());

        System.out.println("the car's engine is running");
    }

}
