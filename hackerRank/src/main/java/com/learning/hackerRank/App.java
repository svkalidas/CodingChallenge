package com.learning.hackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if (null instanceof Object) {
    		System.out.println(" null ");
    	}
    	
    	voidMethodTest(true);
    	voidMethodTest(false);
        System.out.println( "Hello World!" );
        String[] a = {"a", "b"};
        System.out.println(oddNumbers(2, 5));
        
    }
    
   public static void voidMethodTest (boolean input) {
    	
    	if(input) {
    		System.out.println(" inside if");
    		return;
    	}
    	
    	System.out.println("outside if");
    	
    }
        
    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> result = new ArrayList();
        for(int i = l; i<=r; i++){
            if(i%2 !=0){
                result.add(i);
            }
        }
        return result;
    }
    
    public static List<Integer> missingReservations(List<List<Integer>> firstReservationList, List<List<Integer>> secondReservationList) {
        // Write your code here
    	List<Integer> result = null;
            if (secondReservationList != null && !secondReservationList.isEmpty()){
                SortedMap<Integer, Integer> sortedResult = new TreeMap<Integer, Integer>();
                for(List<Integer> input : secondReservationList){
                    if(input.size() >1){
                        sortedResult.put(input.get(1), input.get(0));
                    }
                }

                if(!sortedResult.isEmpty()){
                    result = new ArrayList<Integer>(sortedResult.values());
                }
            }
            if(!result.isEmpty() && firstReservationList !=null && !firstReservationList.isEmpty()){
               
                for(List<Integer> input1 : firstReservationList){

                    if(input1.size() >1 && result.contains(input1.get(0))){

                        result.remove(input1.get(0));
                    }
                }
                

            }

            return (List<Integer>)result;
        }

}
