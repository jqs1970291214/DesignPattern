package DesignPattern.prototype;

/**
 * Chrome
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 16:12
 */
public class Chrome extends Software {
    @Override
    void use() {
        System.out.println("使用chrome" + " v" + this.getVersion() + "(copyCount = " + this.getCopyCount() +") 上网");
    }

    public Chrome(String version) {
        this.setVersion(version);
        this.setName("chrome");
    }

}
