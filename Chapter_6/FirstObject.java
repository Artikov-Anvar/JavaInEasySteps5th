public class FirstObject {

    public static void main(String[] args) {
        
        System.out.println("Цвет " + Car.color);
        System.out.println("Тип кузова " + Car.bodyType);
        System.out.println(Car.accelerate());
    }
}

class Car {
    public static final String color = "Красный";
    public final static String bodyType = "Купе";

    public static String accelerate() {
        String motion = "Ускоряется...";
        return motion;
    }
}