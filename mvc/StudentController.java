package DesignPattern.mvc;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/7 14:21
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getName();
    }

    public int getStudentId() {
        return model.getId();
    }

    public void setStudentName(String name) {
        model.setName(name);
        updateView(getStudentId(), name);
    }

    public void setStudentId(int id) {
        model.setId(id);
        updateView(id, getStudentName());
    }

    public void updateView(int id,String name){
        view.printStudentDetail(id, name);
    }

    public static void main(String[] args) {

    }
}
