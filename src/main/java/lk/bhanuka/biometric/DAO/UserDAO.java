/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lk.bhanuka.biometric.models.User;

/**
 *
 * @author bhanuka
 */
public class UserDAO {
    
    public static List<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();
        
        for(Object o : DatabaseService.executeHQL("from User u")){  
            users.add((User)o);
        }
        return users;
    }
    
    public static User getUser(String indexNumber){
        return (User) DatabaseService.load(User.class, indexNumber);
    }
    
    public static void saveUser(User user){
        System.out.println("Saving user : "+ user.getName());
        DatabaseService.save(user);
    }
    
    
    public static List<User> getUsers(Float indexFinger, Float middleFinger, Float ringFinger, Float pinkyFinger, Float palmWidth, Float palmHeight, Float margin){
        HashMap restrictions = new HashMap();
        restrictions.put("indexFinger", indexFinger);
        restrictions.put("middleFinger", middleFinger);
        restrictions.put("ringFinger",ringFinger);
        restrictions.put("pinkyFinger", pinkyFinger);
        restrictions.put("palmWidth", palmWidth);
        restrictions.put("palmHeight", palmHeight);
        List users = DatabaseService.search(User.class, restrictions, margin);
        return users;
    }
    
}
