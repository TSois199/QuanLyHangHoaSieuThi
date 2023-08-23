/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUILD;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Itemset {
    Set<Integer> itemset;
    double support;

    public Itemset(Set<Integer> itemset, double support) {
        this.itemset = itemset;
        this.support = support;
    }

    public Itemset() {
        itemset= new HashSet<>();
        support=0;
    }

    @Override
    public String toString() {
        String resuilt="";
        for(Integer i: itemset)
        {
            resuilt+=i+",";
        }
        resuilt=resuilt.substring(0,resuilt.length()-1);
        resuilt+=" : "+support;
        return resuilt;
         
    }

    
    public String printDataSet() {
        String resuilt="";
        for(Integer i :itemset)
        {
            resuilt+=i+",";
        }
        resuilt=resuilt.substring(0,resuilt.length()-1);
        resuilt+=" : "+support;
        return resuilt;
    }
    
}
