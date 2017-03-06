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
public class AddUserRequest {
    
    public String indexNumber;
    public String name;
    
    public Float indexFinger;
    public Float middleFinger;
    public  Float ringFinger;
    public Float pinkyFinger;
    public Float thumb;
    public Float palmWidth;
    public Float palmHeight;
    
    public Float indexWidth;
    public Float middleWidth;
    public Float ringWidth;
    public Float pinkyWidth;
    public Float thumbWidth;
    
    public AddUserRequest(){}
}
