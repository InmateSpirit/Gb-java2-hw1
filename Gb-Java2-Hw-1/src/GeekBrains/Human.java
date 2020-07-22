package GeekBrains;

public class Human implements MovingObject {
    protected String name;
    protected int distance;
    protected double possibleHeight;

    public String getName() {
        return name;
    }

    public int getDistance() {

        return distance;
    }

    public double getHeight() {

        return possibleHeight;
    }

    public Human(String name, int distance, double possibleHeight) {
        this.name = name;
        this.distance = distance;
        this.possibleHeight = possibleHeight;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s runs", name));
    }

    public void run(Treadmill a) {
        System.out.println(String.format("%s runs", name));
        a.run(distance, a.getRange());

    }

    @Override
    public void jump() {
        System.out.println(String.format("%s jumps", name));
    }

    public void jump(Wall w) {
        System.out.println(String.format("%s jumps", name));
        w.overtake(possibleHeight, w.getHeight());
    }
}
