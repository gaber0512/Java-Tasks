public class Triangle {
    // Java Method to Find the Perimeter of a Circle Given the Radius

    void perimeter(float a, float b, float c) {

        System.out.println("the perimeter of triangle is : " + (a + b + c));

    }

    void area1(float a, float b, float c) {
        // Length of sides must be positive
        // and sum of any two sides
        // must be smaller than third side.
        if (a < 0 || b < 0 || c < 0 || (a + b <= c) ||
                a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle");
            System.exit(0);
        }
        float s = (a + b + c) / 2;
        a = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("the area of triangle : " + a);
    }

    // When the height and base of the triangle are given
    void area2(float h, float b) {

        float a = (h * b) / 2;

        System.out.println("the area of triangle : " + a);
    }

}