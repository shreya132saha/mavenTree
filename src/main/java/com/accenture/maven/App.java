package com.accenture.maven;

import java.util.*;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TreeMap<String, Integer> treemap=new TreeMap<String, Integer>();
        treemap.put("A", 1);
        treemap.put("B", 2);
        treemap.put("C", 3);
        treemap.put("d", 6);
        Collections.reverseOrder();
        Set set = treemap.entrySet(); 
        Iterator i = set.iterator(); 
        while (i.hasNext()) { 
        	Map.Entry me = (Map.Entry)i.next(); 
        	System.out.print(me.getKey() + ": "); 
        	System.out.println(me.getValue()); 
        
        
    }
}





} 
