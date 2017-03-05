/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.bhanuka.biometric.models;

/**
 *
 * @author bhanuka
 */
public abstract class AuthUnit {
    
    protected AuthUnit next;
    
    public void setNextUnit(AuthUnit next){
        this.next = next;
    }
    
    protected void start(User user, AuthenticationRequest request, AuthenticationScore score){
        this.authenticate(user, request, score);
        if(this.next !=null){
            this.next.start(user, request, score);
        }
    }
    
    protected void discontinue(){
        this.next = null;
    }
    
    abstract protected void authenticate(User user, AuthenticationRequest request, AuthenticationScore score);
    
}
