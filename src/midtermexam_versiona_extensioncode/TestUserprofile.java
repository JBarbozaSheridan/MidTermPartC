/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *
 * @author Jose
 */

public class TestUserprofile {
    
    public static void main(String[] args) {
        
        /*
        Create a class called TestUserprofile with main method  where a user 
        wants to create a new profile. The user will enter their name and choose
        their favourite Genre from a displayed list of the possible Genres. 
        The user will then see a message that their userProfile was created. 
        */
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userID = input.nextLine();

        System.out.println("Choose a genre:\n1 COMEDY\n2 DRAMA\n3 ACTION\n4 MYSTERY");
        String genre = input.nextLine();
        
        
        UserProfile myUserProfile = new UserProfile(userID,genre);
        
          

    
    }


    
}
