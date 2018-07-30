package DesignPattern.prototype;

/**
 * Photoshop
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 16:09
 */
public class Photoshop extends Software {
    private static int copyCount = 0;
    @Override
    void use() {
        System.out.println("使用ps v" + this.getVersion() + "(copyCount = " + this.getCopyCount() + ")作图");
    }

    public Photoshop(String version) {
        this.setName("photoshop");
        this.setVersion(version);
    }


}
