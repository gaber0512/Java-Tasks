public class App {
    public static void main(String[] args) throws Exception {
        Circle c = new Circle();
        c.area(7);
        c.perimeter(7);

        Triangle t = new Triangle();
        t.perimeter(2, 4, 4);
        t.area1(2, 4, 5);
        t.area2(10, 5);
    }

}
