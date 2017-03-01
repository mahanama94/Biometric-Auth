/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.controller;

import java.util.List;
import lk.bhanuka.biometric.DAO.UserDAO;
import lk.bhanuka.models.User;

/**
 *
 * @author bhanuka
 */
public class AuthenticationController {
    
    public static User checkAuth(Float indexFinger, Float middleFinger, Float ringFinger, Float pinkyFinger, Float palmWidth, Float palmHeight){
        return UserDAO.getUser(indexFinger, middleFinger, ringFinger, pinkyFinger, palmWidth, palmHeight);        
    }
    
    public static void addUser(String name, String indexNumber, Float indexFinger, Float middleFinger, Float ringFinger, Float pinkyFinger, Float palmWidth, Float palmHeight){
        User newUser = new User(indexNumber, name,  middleFinger, indexFinger, pinkyFinger, ringFinger, palmWidth, palmHeight);
        UserDAO.saveUser(newUser);
    }
    
    public static List<User> getUsers(){
        return UserDAO.getUsers();
    }
    
}
