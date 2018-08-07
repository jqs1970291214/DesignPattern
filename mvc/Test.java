package DesignPattern.mvc;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/7 17:06
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student(1, "Sam");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.getStudentId();
        controller.getStudentName();
        controller.updateView(1, "Sam");
        controller.setStudentId(10);
        controller.setStudentName("Tony");

    }
}
