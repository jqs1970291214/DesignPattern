package DesignPattern.proxy;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:23
 */
public class StarProxy {
    private Star star;

    public StarProxy(String name,int cent) {
        this.star = new Star(name, cent);
    }

    public void sing(int cent){
        if (cent < star.getCent()) {
            System.out.println("定金不足！");
        } else {
            this.star.sing();
        }
    }
}
