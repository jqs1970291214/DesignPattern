package DesignPattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 16:13
 */
public class SoftwarePrototype {
    private Map<String, Software> softwareMap = new HashMap<>();
    private Map<String, Integer> copyCount = new HashMap<>();

    public Software getSoftware(String name) {
        Software software = softwareMap.get(name);
        Software cloned = (Software) software.clone();
        Integer count = copyCount.get(software.getName());
        count++;
        copyCount.put(software.getName(),count);
        cloned.setCopyCount(count);
        return cloned;
    }

    public void loadSoftware(){
        Chrome chrome = new Chrome("1.12");
        Photoshop photoshop = new Photoshop("2.35");
        softwareMap.put(chrome.getName(), chrome);
        softwareMap.put(photoshop.getName(), photoshop);
        Integer ic = 0;
        Integer ip = 0;
        copyCount.put(chrome.getName(), ic);
        copyCount.put(photoshop.getName(), ip);
    }

    public SoftwarePrototype(){
        loadSoftware();
    }

}
