package DesignPattern.proxy;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:21
 */
public class Star {
    private String name;
    private int cent;

    public void sing() {
        System.out.println(name + "sing a song");
    }

    public Star(String name, int cent) {
        this.name = name;
        this.cent = cent;
    }

    public int getCent() {
        return cent;
    }

    public void setCent(int cent) {
        this.cent = cent;
    }
}
