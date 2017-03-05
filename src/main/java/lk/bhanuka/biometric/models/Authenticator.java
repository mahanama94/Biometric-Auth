/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lk.bhanuka.biometric.DAO.UserDAO;

/**
 *
 * @author bhanuka
 */
public class Authenticator {

    public static Map<User, AuthenticationScore> getUsers(AuthenticationRequest request){
      
        return Authenticator.filter(request, UserDAO.getUsers());
    }
    
    private static Map<User, AuthenticationScore> filter(AuthenticationRequest request, List<User> users){
        
        HashMap<User, AuthenticationScore> results = new HashMap();
        
        for(User user: users){
            System.out.println(request.threshold);
            if(Authenticator.getAuthenticationScore(request, user).getScore() < request.threshold){
                results.put(user, Authenticator.getAuthenticationScore(request, user));
            }
        }
        
        return results;
    }
    
    private static AuthenticationScore getAuthenticationScore(AuthenticationRequest request,User user ){
        AuthenticationChain chain = new AuthenticationChain();
        return chain.start(user, request);
    }
}
