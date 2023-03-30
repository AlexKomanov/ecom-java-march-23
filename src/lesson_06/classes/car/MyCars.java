package lesson_06.classes.car;

public class MyCars {
    public static void main(String[] args) {

        Car myCar = new Car("Tesla", -256, true);


//        myCar.brand = "Ilon Mask";

        System.out.println("myCar.getYear() = " + myCar.getYear());
        myCar.setYear(2020);
        System.out.println("myCar.getYear() = " + myCar.getYear());
//        myCar.isElectrical = true;

        System.out.println(myCar.toString());

        Car myBmw = new Car("BMW", 2019, false);

        Car generalCar = new Car("General", true);

//        System.out.println(myBmw.brand + " " +myBmw.year + " " + myBmw.isElectrical);

    }
}
