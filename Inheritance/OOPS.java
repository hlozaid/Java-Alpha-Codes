public class OOPS {
    public static void main(String[] args) {
       Car car = new Car();
       car.color = "Blue";
       car.brand = "Tata";
       car.year = 2024;
       car.modal = "Safari";
       car.speed = 40;

    //    car.accelator(1);
        car.Break(1);
    //    System.out.println(car.speed);

    }
}

class Car{
    String color;
    String brand;
    int year;
    int speed;
    String modal;
    public void accelator(int increament){
        speed = speed + increament;
    }

    public void Break(int decreament){
        speed = speed - decreament;
        if(speed < 0 ){
            speed = 0;
        }
    }
}