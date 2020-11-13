package task_3_3_1;

public class Main {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }

    public static class Robot {

        Robot(Direction currentDirection, int x, int y) {
            this.currentDirection = currentDirection;
            this.x = x;
            this.y = y;
        }

        private Direction currentDirection = Direction.RIGHT;
        int x = 0;
        int y = 0;

        public Direction getDirection() {
            return currentDirection;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
            System.out.println();
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
            currentDirection = Direction.values()[(currentDirection.ordinal() + 1) % 4];

        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int xdir = toX - robot.getX();
        int ydir = toY - robot.getY();


        if (xdir >= 0) {

        }
    }


    public static void main(String[] args) {

        Robot robot = new Robot(Direction.UP, 0,0);

    }
}


