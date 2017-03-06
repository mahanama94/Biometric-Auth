/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.controller;

import java.util.List;
import java.util.Map;
import lk.bhanuka.biometric.DAO.UserDAO;
import lk.bhanuka.biometric.models.AddUserRequest;
import lk.bhanuka.biometric.models.AuthenticationRequest;
import lk.bhanuka.biometric.models.AuthenticationScore;
import lk.bhanuka.biometric.models.Authenticator;
import lk.bhanuka.biometric.models.User;

/**
 *
 * @author bhanuka
 */
public class AuthenticationController {
    
    
    public static void addUser(AddUserRequest request){
        User newUser = new User(
                request.indexNumber, 
                request.name, 
                request.middleFinger, 
                request.indexFinger, 
                request.pinkyFinger, 
                request.ringFinger, 
                request.thumb,
                request.palmWidth, 
                request.palmHeight,
                request.indexWidth, 
                request.middleWidth, 
                request.ringWidth, 
                request.pinkyWidth, 
                request.thumbWidth
        );
        
        UserDAO.saveUser(newUser);
        
    }

    public static Map<User, AuthenticationScore> checkAuthentication(AuthenticationRequest authenticationRequest){
        return Authenticator.getUsers(authenticationRequest);
    }
    
    public static List<User> getUsers(){
        return UserDAO.getUsers();
    }
    
}
