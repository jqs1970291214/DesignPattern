package DesignPattern.mvc;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/7 14:17
 */
public class StudentView {
    void printStudentDetail(int id, String name) {
        System.out.println("Student Info:\n");
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
        System.out.println();
    }
}
