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
public class AuthenticationRequest {
    
    public Float indexFinger;
    public Float middleFinger;
    public  Float ringFinger;
    public Float pinkyFinger;
    public Float thumb;
    public Float palmWidth;
    public Float palmHeight;
    
    public Float margin = 0.1f;
    public Float threshold = 1.2f;

    public AuthenticationRequest(Float indexFinger, Float middleFinger, Float ringFinger, Float pinkyFinger, Float thumb, Float palmWidth, Float palmHeight){
        
        this.indexFinger = indexFinger;
        this.middleFinger = middleFinger;
        this.ringFinger = ringFinger;
        this.pinkyFinger = pinkyFinger;
        this.thumb = thumb;
        this.palmWidth = palmWidth;
        this.palmHeight = palmHeight;
        
    }
    
    
}
