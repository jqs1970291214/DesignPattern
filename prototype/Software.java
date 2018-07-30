package DesignPattern.prototype;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 16:06
 */
public abstract class Software implements Cloneable{
    private String version;
    private String name;
    private int copyCount;

    abstract void use();

    @Override
    protected Object clone(){
        Object cloned = null;
        try {
            cloned = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;

    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCopyCount() {
        return copyCount;
    }

    public void setCopyCount(int copyCount) {
        this.copyCount = copyCount;
    }
}
