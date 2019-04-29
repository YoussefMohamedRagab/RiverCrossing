/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Crossers.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Story1 implements ICrossingStrategy{
    
    
 @Override
    public boolean isValid(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers, List<ICrosser> boatRiders) {
        
        boolean valid = false;
        int difference ;
        
        for(int i =0;i<boatRiders.size();i++){
            
            ICrosser x = boatRiders.get(i);
            if(x.canSail())
                valid = true;
            break;      
        }
        
        if(valid == false){
            return false;
        }
        
        if(leftBankCrossers.size()==3){
            return false;
        }
        
        if (leftBankCrossers.size() == 2){
            
          difference = leftBankCrossers.get(0).getEatingRank() - leftBankCrossers.get(1).getEatingRank();
            
          if(difference == -1 || difference == 1)
              return false;
        }
        
        if(rightBankCrossers.size()==3){    
            return false;
            
        }
        
        if(rightBankCrossers.size()==2){
            
          difference = rightBankCrossers.get(0).getEatingRank() - rightBankCrossers.get(1).getEatingRank();
            
          if(difference == -1 || difference ==1)
              return false;
            
        } 
        
        return true;
    }

    @Override
    public List<ICrosser> getInitialCrossers() {
        
        List<ICrosser> x = new ArrayList<>();
        x.add(new Farmer());
        x.add(new Plant());
        x.add(new Fox());
        x.add(new Goat());
        
        return x;
    }

    @Override
    public String[] getInstructions() {
        
        String [] instructions = new String[6];
        
        instructions [0] = "A farmer wants to cross a river and take with him a wolf, a goat, and a cabbage";
        instructions [1] = "Rules:";
        instructions [2] = "1)The farmer is the only one who can steer the rafthe can only take one passenger"
                + "(the wolf,the goat,or the cabbage) in addition to himself";
        instructions [3] = "2)If the wolf and the goat are alone on the same riverbank, the wolf will eat the goat";
        instructions [4] = "3)If the goat and the cabbage are alone on the same bank, the goat will eat the cabbage";
        instructions [5] = "How can the farmer get the wolf, the goat , and the cabbage across the river"
                + "without any of them being eaten?";
        
        
        return instructions;
    }
    
}
