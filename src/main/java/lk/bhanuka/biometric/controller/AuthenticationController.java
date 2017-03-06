/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.controller;

import java.util.List;
import java.util.Map;
import lk.bhanuka.biometric.DAO.UserDAO;
import lk.bhanuka.biometric.models.AuthenticationRequest;
import lk.bhanuka.biometric.models.AuthenticationScore;
import lk.bhanuka.biometric.models.Authenticator;
import lk.bhanuka.biometric.models.User;

/**
 *
 * @author bhanuka
 */
public class AuthenticationController {
    
    
    public static void addUser(String name, String indexNumber, Float indexFinger, Float middleFinger, Float ringFinger, Float pinkyFinger, Float thumb, Float palmWidth, Float palmHeight){
        User newUser = new User(indexNumber, name,  middleFinger, indexFinger, pinkyFinger, ringFinger, palmWidth, palmHeight);
        UserDAO.saveUser(newUser);
    }

    public static Map<User, AuthenticationScore> checkAuthentication(AuthenticationRequest authenticationRequest){
        return Authenticator.getUsers(authenticationRequest);
    }
    
    public static List<User> getUsers(){
        return UserDAO.getUsers();
    }
    
}
