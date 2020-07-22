package GeekBrains;

public class Treadmill extends Obstacle {
    protected int range;

    public Treadmill(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }
    public void run(int distance, int range) {
        if (distance >= range) {
            System.out.println(String.format("Someone runs %s", range));
        } else {
            System.out.println("It is impossible");
        }
    }
    @Override
    public void overtake() {
        System.out.println(String.format("You ran %s", range));
    }

}
