/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

/**
 *
 * @author Karan PC
 */
public class CourseScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructor testInstructor = new Instructor();
        System.out.println(testInstructor.toString());
        Instructor test = new Instructor();
        test.setFirstname("Karan");
        test.setLastname("Deocharran");
        test.setOfficeBuilding("ACB");
        test.setRoomNumber(900);
        System.out.println(test.toString());
    }
    
}
