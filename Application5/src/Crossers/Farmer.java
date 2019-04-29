/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crossers;

import java.awt.image.BufferedImage;

/**
 *
 * @author USER
 */
public class Farmer implements ICrosser{
    
    private int weight;
    private String label;
    
     @Override
    public boolean canSail() {
        return true;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getEatingRank() {
        return 0;
    }

    @Override
    public BufferedImage[] getImages() {
        BufferedImage x [] = new BufferedImage[2];
        
        
        return x;
    }

    @Override
    public ICrosser makeCopy() {
        
        ICrosser x = new Farmer();
        
        
        return x;
    }

    @Override
    public void setLabelToBeShown(String label) {
        this.label = label;
    }

    @Override
    public String getLabelToBeShown() {
        return label ;
    }
    
    
}
