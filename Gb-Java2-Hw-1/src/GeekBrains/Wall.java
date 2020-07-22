package GeekBrains;

public class Wall extends Obstacle {
    protected double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void overtake(double possibleHeight, double height) {
        if (possibleHeight >= height) {
            System.out.println(String.format("Someone jumps over %s", height));
        } else {
            System.out.println("It is impossible");
        }
    }
    @Override
    public void overtake() {
        System.out.println(String.format("You ran %s", height));
    }
}
