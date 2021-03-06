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
public class MiddleFingerAuth extends AuthUnit{

    @Override
    protected void authenticate(User user, AuthenticationRequest request, AuthenticationScore score) {
        score.middleFinger = Math.abs((user.getMiddleFinger() - request.middleFinger)/request.middleFinger);
        
        score.middleWidth = Math.abs((user.getMiddleWidth() - request.middleWidth)/ request.middleWidth);
    }
    
}
