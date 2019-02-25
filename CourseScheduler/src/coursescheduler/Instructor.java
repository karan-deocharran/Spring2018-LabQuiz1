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
public class Instructor {
    private String firstname;
    private String lastname;
    private String officeBuilding;
    private int roomNumber;
    
    public Instructor() {
        firstname = "Albert";
        lastname = "Einstein";
        officeBuilding = "McNair";
        roomNumber = 420;
    }
    
    public Instructor(String fname, String lname, String officeBuilding, int roomNum) {
        firstname = fname;
        lastname = lname;
        this.officeBuilding = officeBuilding;
        roomNumber = roomNum;
    }
    
    public String toString() {
        return firstname + "*" + lastname + "*" + officeBuilding + "*" + roomNumber;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the officeBuilding
     */
    public String getOfficeBuilding() {
        return officeBuilding;
    }

    /**
     * @param officeBuilding the officeBuilding to set
     */
    public void setOfficeBuilding(String officeBuilding) {
        this.officeBuilding = officeBuilding;
    }

    /**
     * @return the roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
}
