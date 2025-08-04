/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current staff number: ");
        int staffNum = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Enter staff location: ");
        String location = input.nextLine();

        CompanyStaff cs = new CompanyStaff(staffNum, location);

        System.out.println("\n--- Staff Details ---");
        System.out.println("Staff Number: " + cs.getStaffNumber());
        System.out.println("Location: " + cs.getStaffLocation());
        System.out.println("Hiring Advice: " + cs.getStaffHiringProcess());
    }
}

