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
        
        Textbook test2 = new Textbook();
        System.out.println(test2.toString());
        Textbook testTextbook = new Textbook();
        testTextbook.setTitle("Title name");
        testTextbook.setPublisher("Made by Me");
        testTextbook.setEdition(1000);
        System.out.println(testTextbook.toString());
        
        Course testCourse = new Course();
        testCourse.setName("New teacher");
        testCourse.setSemester("Spring");
        testCourse.setInstructor(testInstructor);
        testCourse.setTextbook(testTextbook);
        System.out.println(testCourse);
    }
    
}
