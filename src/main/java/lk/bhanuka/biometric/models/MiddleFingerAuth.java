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
        System.out.println("Middle finger Auth");
        score.middleFinger = Math.abs((user.getMiddleFinger() - request.middleFinger)/request.middleFinger);
    }
    
}
