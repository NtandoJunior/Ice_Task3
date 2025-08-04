/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
// CompanyStaff.java
public class CompanyStaff extends Staff {

    public CompanyStaff(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    @Override
    public String getStaffHiringProcess() {
        if (staffNumber < 5) {
            return "Hire more staff immediately for " + staffLocation + ".";
        } else if (staffNumber < 10) {
            return "Consider hiring more staff for " + staffLocation + ".";
        } else {
            return "Staff level is sufficient in " + staffLocation + ".";
        }
    }
}

