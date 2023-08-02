public class ElectricCar extends CarSkeleton{
    public void startEngine(){
        System.out.println(getClass().getSimpleName() +" engine is starting");

    }
    public void drive(){
        this.runEngine();

        System.out.println(getClass().getSimpleName() +" driving");
    }
}
