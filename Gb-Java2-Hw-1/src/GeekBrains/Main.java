package GeekBrains;

public class Main {

    public static void main(String[] args) {
        Human Stan = new Human("Stan", 1000, 0.5);
        Human Tim = new Human("Tim", 10000, 1.3);
        Cat mur = new Cat("MurMur", 2000, 2.3);
        Robot iRobot = new Robot("1120243473", 25000, 4);
        Treadmill first = new Treadmill(1000);
        Wall second = new Wall(0.3);
        Treadmill third = new Treadmill(8000);
        Wall fourth = new Wall(1.5);


        MovingObject[] participants = new MovingObject[]{Stan, Tim, mur, iRobot};
        Obstacle[] newCourse = new Obstacle[]{first, second, third, fourth};

        for (MovingObject m : participants) {
            for (Obstacle o : newCourse) {
                if (m instanceof Human) {
                    if (o instanceof Treadmill) {
                        ((Human) m).run((Treadmill) o);
                    } else if (o instanceof Wall) {
                        ((Human) m).jump((Wall) o);
                    }
                }
                if (m instanceof Cat) {
                    if (o instanceof Treadmill) {
                        ((Cat) m).run((Treadmill) o);
                    } else if (o instanceof Wall) {
                        ((Cat) m).jump((Wall) o);
                    }
                }
                if (m instanceof Robot) {
                    if (o instanceof Treadmill) {
                        ((Robot) m).run((Treadmill) o);
                    } else if (o instanceof Wall) {
                        ((Robot) m).jump((Wall) o);
                    }
                }
            }
        }
    }
}
