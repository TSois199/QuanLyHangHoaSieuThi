/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUILD;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Apiriori {
    Map<String,Itemset> dataSet;
    double support;
    Set<Itemset>  setL;

    public Apiriori(Map<String, Itemset> dataSet, double support) {
        super();
        this.dataSet = dataSet;
        this.support = support;
        setL=new HashSet<>();
    }
    public Set<Itemset> getCadidates()
    {
        Set<Itemset> setLi=new HashSet<>();
        for(Itemset it:this.dataSet.values())
        {
            for(Integer i: it.itemset)
            {
            int count=countFrequent(i);
            Set<Integer> setItem= new HashSet<>();
            setItem.add(i);
            Itemset itemset =new Itemset(setItem,count);
            if(!checkContain(itemset,setLi))
            {
                setLi.add(itemset);
            }
            
            }
        }
        setLi=checkMInSupport(setLi);
        return setLi;
    }
    private Set<Itemset> checkMInSupport(Set<Itemset> set)
    {
        Set<Itemset> setLi=new HashSet<>();
        for(Itemset it : set)
        {
            if(it.support>=this.support)
            {
                setLi.add(it);
            }
        }
        return setLi;
    }
    public int countFrequent(int i)
    {
        int count=0;
        for(Itemset it:this.dataSet.values())
        {
            for(Integer k:it.itemset)
            {
                if(k==i) count++;
            }
        }
     return count;   
    }
    
    private boolean checkContain(Itemset itemset,Set<Itemset> setLi)
    {
        for(Itemset it: setLi)
        {
            if(it.itemset.equals(itemset.itemset)) return true;
        }
        return false;
    }
    public Set<Itemset> apriori_gen()
    {
        System.out.println("Buoc phat sinh lan thu 1 ");
     
        Set<Itemset> setRes= new HashSet<>();
        Set<Itemset> setCan=getCadidates();
        this.setL.addAll(setCan);
         Set<Set<Integer>> setGen= new HashSet<>();
         printSetItem(this.setL);
         int size=2;
         while((setGen=getCandidates(setCan, size))!=null)
         {
             System.out.println("Buoc phat sinh lan thu: "+size);
             Set<Itemset> setitem= new HashSet<>();
             for(Set<Integer> item: setGen)
             {
                 if(has_subnet(item))
                 {
                     int count= countFrequent(item);
                     setitem.add(new Itemset(item,count));
                 }
             }
             setRes=checkMInSupport(setitem);
             this.setL.addAll(setRes);
             printSetItem(this.setL);
             size++;
         }
        return setRes;
    }
    public Set<Set<Integer>> getSubnet(Set<Integer> set)
    {
          Set<Set<Integer>> setRes= new HashSet<>();
        int arr[]=new int[set.size()];
        int count=0;
             for(Integer i : set)
        {
            arr[count]=i;
            count++;
        
        
        }
        int n=arr.length;
        for (int i = 0; i < (1<<n); i++)
        {
            Set<Integer> setA= new HashSet<>();
 
            for (int j = 0; j < n; j++)
              if ((i & (1 << j)) > 0)
              {
                  setA.add(arr[j]);
              }
            
              if(setA.size()==set.size()-1)
              {
                 setRes.add(setA);
              }
         
            
        }
           
             return (setRes.isEmpty())?null:setRes;
    }
    public Set<Set<Integer>> getCandidates(Set<Itemset> set,int size)
    {
        Set<Set<Integer>> setRes= new HashSet<>();
        int arr[]=new int[set.size()];
        int count=0;
        for(Itemset it : set){
            for(Integer i : it.itemset)
        {
            arr[count]=i;
        }
        count++;
        }
        int n=arr.length;
        for (int i = 0; i < (1<<n); i++)
        {
            Set<Integer> setA= new HashSet<>();
 
            for (int j = 0; j < n; j++)
              if ((i & (1 << j)) > 0)
              {
                  setA.add(arr[j]);
              }
            
              if(setA.size()==size)
              {
                 setRes.add(setA);
              }
         
            
        }
           
             return (setRes.isEmpty())?null:setRes;
    }
    public void printSetItem1(Set<Set<Integer>> set)
    {
        
        for(Set<Integer> it: set)
        {
            System.out.println(it);
        
            
        }
    }
    public void printSetItem(Set<Itemset> set)
    {
        System.out.println("Item\tSupport");
        Set<Integer> kk= new HashSet<>();
        for(Itemset it: set)
        {
            
            System.out.println(it.itemset+"\t"+it.support);
            kk=it.itemset;
        }
       
    }

    private int countFrequent(Set<Integer> item) {
       int count=0;
       for(Itemset it : this.dataSet.values())
       {
           if(it.itemset.containsAll(item))
               count++;
       }
      return count;
    }

    private boolean has_subnet(Set<Integer> item) {
        Set<Set<Integer>> setSubnet  =getSubnet(item);
        int count=0;
        for(Set<Integer> it: setSubnet)
        {
            if(checkSubnet(it))
            {
                count++;
            }
        }
        
        return (count==setSubnet.size())?true:false;
    }

    private boolean checkSubnet(Set<Integer> it) {
        for(Itemset item: this.setL)
        {
            if(item.itemset.equals(it)) return true;
        }
        return false;
    }
    
}
