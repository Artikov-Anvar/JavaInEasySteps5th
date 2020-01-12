class CarLast {
    private String maker;
    private String color;
    private String bodyType;

    public CarLast() {
        maker = "Porsche";
        color = "Серебристый";
        bodyType = "Купе";
    }

    private String accelerate() {
        String motion = "Ускоряется";
        return motion;
    }

    public void setCar(String brand, String paint, String style) {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " цвет " + color);
        System.out.println(maker + " тип кузова " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }

}

public class Constructor {

    public static void main(String[] args) {
        
        CarLast Porsche = new CarLast();
        //Porsche.setCar("Porsche", "Красный", "Купе");
        Porsche.getCar();

        CarLast Ferrari = new CarLast();
        Ferrari.setCar("Ferrari", "Красный", "Спортивный");
        Ferrari.getCar();
    }

}