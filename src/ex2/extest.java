package ex2;

import javax.swing.*;

public class extest {
    public static void main(String[] args) {
        String firstname, lastname;
        for (int i = 1; i > 0; i++) {
            firstname = JOptionPane.showInputDialog("enter name of person " + i +". Q to exit");
            if(firstname.equals("Q")){
                break;
            }
            lastname = JOptionPane.showInputDialog("enter last name: ");


            person per1 = new person(firstname, lastname);

            

        }
    }
}
