package Object;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setLength(40);
        room1.setWidth(20);
        double areaOfRomm1 = room1.calculateArea();


        Rectangle room2 = new Rectangle(50,20);
        double areaOfRoom2 = room2.calculateArea();
    }
}
