/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.controller;

import java.util.ArrayList;
import java.util.List;
import lk.bhanuka.biometric.DAO.UserDAO;
import lk.bhanuka.biometric.models.AuthenticationRequest;
import lk.bhanuka.biometric.models.User;

/**
 *
 * @author bhanuka
 */
public class AuthenticationController {
    
    public static User checkAuth(AuthenticationRequest request){
        return UserDAO.getUser(request.indexFinger, request.middleFinger, request.ringFinger, request.pinkyFinger, request.palmWidth, request.palmHeight);        
    }
    
    public static void addUser(String name, String indexNumber, Float indexFinger, Float middleFinger, Float ringFinger, Float pinkyFinger, Float palmWidth, Float palmHeight){
        User newUser = new User(indexNumber, name,  middleFinger, indexFinger, pinkyFinger, ringFinger, palmWidth, palmHeight);
        UserDAO.saveUser(newUser);
    }

    public static List<User> checkAuthentication(){
        
        return new ArrayList<User>();
    }
    
    public static List<User> getUsers(){
        return UserDAO.getUsers();
    }
    
}
