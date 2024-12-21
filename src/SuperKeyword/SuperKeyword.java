package SuperKeyword;

class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        return super.getCorner();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
