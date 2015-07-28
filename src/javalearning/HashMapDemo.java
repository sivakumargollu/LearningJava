                                        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

import java.util.*;
/**
 *
 * @author Siva
 */
public class HashMapDemo {
    
    public static void main(String args[]){
        
        HashMap hm = new HashMap(5);
        Object ob= new Object();
        hm.put(ob, 1);
        hm.put(ob, 3);
        hm.put(ob, 4);
        System.out.println(hm.toString());
    }
}
