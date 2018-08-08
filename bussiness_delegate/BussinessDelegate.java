package DesignPattern.bussiness_delegate;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/8 19:39
 */
public class BussinessDelegate {
    private BussinessLookUp lookUp = new BussinessLookUp();
    private BussinessService service = null;
    private String type;

    public void setType(String type) {
        this.type = type;
        service = lookUp.getBussinessService(type);
    }

    public void doTask() {
        if (service == null) {
            service = lookUp.getBussinessService(type);
        }
        service.doProcessing();
    }
}
