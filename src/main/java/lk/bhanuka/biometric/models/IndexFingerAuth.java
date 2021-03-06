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
public class IndexFingerAuth extends AuthUnit{

    @Override
    protected void authenticate(User user, AuthenticationRequest request, AuthenticationScore score) {
        score.indexFinger = Math.abs((user.getIndexFinger() - request.indexFinger)/request.indexFinger);
        
        score.indexWidth = Math.abs((user.getIndexWidth() - request.indexWidth)/ request.indexWidth);
        
    }
    
}
