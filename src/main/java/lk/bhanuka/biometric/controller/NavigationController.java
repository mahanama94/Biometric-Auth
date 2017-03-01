/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.controller;


import lk.bhanuka.biometric.view.AddUser;
import lk.bhanuka.biometric.view.Main;
import lk.bhanuka.biometric.view.ViewUser;
import lk.bhanuka.biometric.view.ViewUsers;
import lk.bhanuka.models.User;

/**
 *
 * @author bhanuka
 */
public class NavigationController {
    
    public static void launch(){
        Main an = new Main();
        an.setVisible(true);
    }

    public static void exit(){
        System.exit(0);
    }
    
    public static void openAddUserPage(){
        AddUser page = new AddUser();
        page.setVisible(true);
    }
    
    public static void openViewUsersPage(){
        ViewUsers page = new ViewUsers();
        page.setVisible(true);
    }
    
    public static void openViewUserPage(User user){
        ViewUser userPage = new ViewUser(user);
        userPage.setVisible(true);
    }
}
