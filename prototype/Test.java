package DesignPattern.prototype;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 16:25
 */
public class Test {
    public static void main(String[] args) {
        SoftwarePrototype prototype = new SoftwarePrototype();
        Chrome chrome = (Chrome) prototype.getSoftware("chrome");
        Photoshop photoshop = (Photoshop) prototype.getSoftware("photoshop");
        chrome.use();
        photoshop.use();
        Chrome chrome1 = (Chrome) prototype.getSoftware("chrome");
        chrome1.use();

    }
}
