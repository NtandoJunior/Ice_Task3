/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */

public abstract class Staff implements iStaff {
    protected int staffNumber;
    protected String staffLocation;

    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public String getStaffLocation() {
        return staffLocation;
    }
}

