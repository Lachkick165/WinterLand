package my_project.model;

public class CollisionDetector {
    public static boolean circleWithRectangle(double cx, double cy, double radius, double rx, double ry, double rw, double rh){
        // temporary variables to set edges for testing
        double testX = cx;
        double testY = cy;

        // which edge is closest?
        if (cx < rx)         testX = rx;      // test left edge
        else if (cx > rx+rw) testX = rx+rw;   // right edge
        if (cy < ry)         testY = ry;      // top edge
        else if (cy > ry+rh) testY = ry+rh;   // bottom edge

        // get distance from closes edges
        double distX = cx-testX;
        double distY = cy-testY;
        double distance = Math.sqrt( (distX*distX) + (distY*distY) );

        // if the distance is less than the radius, collision!
        if (distance <= radius) {
            return true;
        }
        return false;
    }
    public static boolean circleCircle(double c1x, double c1y, double c1r, double c2x, double c2y, double c2r) {

        // get distance between the circle's centers
        // use the Pythagorean Theorem to compute the distance
        double distX = c1x - c2x;
        double distY = c1y - c2y;
        double distance = Math.sqrt( (distX*distX) + (distY*distY) );

        // if the distance is less than the sum of the circle's
        // radii, the circles are touching!
        if (distance <= c1r+c2r) {
            return true;
        }
        return false;
    }
}
