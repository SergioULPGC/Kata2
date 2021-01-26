/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.*;

/**
 *
 * @author delSe
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[] = {1, 5, 6, 23, 36, 41, 43, 48, 50, 55, 63, 67, 77, 82, 99};
        
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if(!histogram.containsKey(data[i])){
                histogram.put(data[i], 1);
            } else {
                histogram.put(data[i], histogram.get(data[i])+1);
            }
            
            System.out.println(data[i] + "==>" + histogram.get(data[i]));

        }
        
    }
    
}
