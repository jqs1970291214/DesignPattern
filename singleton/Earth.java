package DesignPattern.singleton;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:37
 */
public class Earth {
    //只存储一个earth对象
    private static Earth earth = new Earth();
    //私有构造方法，禁止创建其他实例
    private Earth(){}

    public static Earth getEarth() {
        return earth;
    }

    public void roll(){
        System.out.println("地球自转");
    }

    public static void main(String[] args) {
        Earth earth = Earth.getEarth();
        earth.roll();
    }

}
