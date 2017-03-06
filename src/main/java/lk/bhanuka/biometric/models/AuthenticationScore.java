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
public class AuthenticationScore {
    
    public Float indexFinger;
    public Float middleFinger;
    public  Float ringFinger;
    public Float pinkyFinger;
    public Float thumb;
    public Float palmWidth;
    public Float palmHeight;
    
    
    public Float indexWidth = 0.0f;
    public Float middleWidth = 0.0f;
    public Float ringWidth = 0.0f;
    public Float pinkyWidth = 0.0f;
    public Float thumbWidth = 0.0f;
    

    public AuthenticationScore(){}
    
    public Float getScore(){
        return (indexFinger + middleFinger + ringFinger + pinkyFinger + palmWidth + palmHeight + thumb + indexWidth + middleWidth + ringWidth + pinkyWidth + thumbWidth);
    }
        
    
}
