public abstract class Shape implements Service {
 private String nameShape;
 private Point a;
 private int radius;

    public Shape(Point a, Point b, Point c, Point d, int radius1) {
      this.a = a;
      this.radius = radius1;
    }

    public String getNameShape() {
        return nameShape;
    }

    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }

    String output () {
        return nameShape;
    }

}








