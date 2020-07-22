package GeekBrains;

public class Robot implements MovingObject {
    protected String model;
    protected int distance;
    protected double possibleHeight;

    public String getModel() {
        return model;
    }

    public int getDistance() {
        return distance;
    }

    public double getHeight() {
        return possibleHeight;
    }

    public Robot(String model, int distance, double possibleHeight) {
        this.model = model;
        this.distance = distance;
        this.possibleHeight = possibleHeight;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s runs", model));
    }
    public void run(Treadmill a) {
        System.out.println(String.format("%s runs", model));
        a.run(distance, a.getRange());
    }

    @Override
    public void jump() {
        System.out.println(String.format("%s jumps", model));
    }
    public void jump(Wall w) {
        System.out.println(String.format("%s jumps", model));
        w.overtake(possibleHeight, w.getHeight());
    }
}
