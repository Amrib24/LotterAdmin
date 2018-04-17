package lotteryadmin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amr
 */
public class LotteryLimitHitException extends Exception {
    
    // Chcked exception used to alert limit of ticket sales is reached for current round
    LotteryLimitHitException(){
        super();
    }
    
    LotteryLimitHitException(String msg){
        super(msg);
    }
    
    LotteryLimitHitException(String msg, Throwable cause){
        super(msg,cause);
    }
    
}

