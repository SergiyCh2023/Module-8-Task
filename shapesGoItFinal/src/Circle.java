class Circle extends Shape {
    private   Point centre;
    private   int radius;

    public Circle(Point a, int radius1) {
      super(a, null, null, null, radius1);
      setNameShape("circle");
      this.centre = a;
    }

    public Point getCentre() {
        return centre;
    }

    public int getRadius() {
        return radius;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public double area () {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimetr() {
        return 2.0 * Math.PI * radius;
    }

    String output() {
        return this.getNameShape();
    }

    public String toString() {
        return "This shape is: " + output() + ", with coordinat centre: (" + getCentre().getX() + ", " + getCentre().getY()+
                 ") and value of radius: " + getRadius();
    }
}