public class Point {

    private double pointX;

    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * abc.
     * @param other abc
     * @return abc
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.pointX - other.pointX, 2)
                + Math.pow(this.pointY - other.pointY, 2));
    }
}
