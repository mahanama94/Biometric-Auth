/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhanuka
 */
public class AuthenticationChain {
    
    private List<AuthUnit> chain;
    
    public AuthenticationChain(){
        
        // TODO - Move the settings to config and configure from the config
        
        this.chain = new ArrayList();
        
        this.chain.add(new IndexFingerAuth());
        this.chain.add(new MiddleFingerAuth());
        this.chain.add(new RingFingerAuth());
        this.chain.add(new PinkyFingerAuth());
        
        for(int i=0; i < this.chain.size() -1 ; i++){
            this.chain.get(i).setNextUnit(this.chain.get(i + 1));
        }
        
    }
    
    public AuthenticationScore start(User user, AuthenticationRequest request){
        AuthenticationScore score = new AuthenticationScore();
        System.out.println(" Authenticationscore start");
        this.chain.get(0).start(user, request, score);
        System.out.println(score.indexFinger);
        return score;
    }
    
    
    
}
