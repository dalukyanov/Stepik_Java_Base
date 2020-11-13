import java.math.BigInteger;

public class Main {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }

    public static void main(String[] args) {
        Direction direction = Direction.RIGHT;
        System.out.println(direction);
        System.out.println(Direction.values()[(direction.ordinal() + 1) % Direction.values().length]);
    }
}

