package DesignPattern.flyweight;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:06
 */
public class Test {
    private static final String[] colors = {"green", "red", "blue", "yellow", "pink", "black", "white"};

    public static String getRandomColor(){
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

    public static int getRandomXYR() {
        return (int) (Math.random() * 1000);
    }

    public static void main(String[] args) {
        for(int i = 0;i < 50; i++ ) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomXYR());
            circle.setY(getRandomXYR());
            circle.setRadis(getRandomXYR());
            circle.draw();
        }
    }
}
