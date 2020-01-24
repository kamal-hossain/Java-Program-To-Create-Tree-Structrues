package Main_package;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Tree {

    Scanner input = new Scanner(System.in);
    String userTreeName;
    final String locationOfPlantation= "Dhaka";
    
    // common Default features
    protected boolean isMangrove;
    protected boolean isSeasonalFruit;
    protected String scientificName;
    protected String leafColor;
    protected int growthRate;

    // Getting input from User
    void enterInfo() {
        System.out.print("Enter Scientific Name: ");
        scientificName = input.nextLine();
        System.out.print("Enter leaf color: ");
        leafColor = input.nextLine();
        try {
            System.out.print("Enter growth rate(cm/per month): ");
            growthRate = input.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("*** Error in: " +  e);
            System.out.println("Proceeding without Growth rate for this tree...");
        } finally{
            System.out.println("Your part of info has been stored successfully!");
        }
    }
    // Printing after taking input
    void showInfo() {
        System.out.println("^^^");
        System.out.println("Your Created tree specification is: ");
        System.out.println("----------------------------------");
        System.out.println("The scientific name for this tree is: " + scientificName);
        System.out.println("Leaf color: " + leafColor);
        System.out.println("Growth rate: " + growthRate);
        System.out.println("Tree plantation location: " + locationOfPlantation);
    }
    protected void refreshAir(){
        System.out.println("This tree takes CO2 from air & Reveals Oxygen to air...");
    }
    
    // Abstract Functions for all classes
    abstract void fruitStatus();
    abstract void healthBenefits();
    

}
