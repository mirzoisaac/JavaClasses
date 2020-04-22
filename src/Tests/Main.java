package Tests;

import java.util.*;


public class Main  {
	public static void main(String[] args) {

		List<Integer> nums= new LinkedList<>();
	      
	    int s;
	    
	      for(int i=2; i<100; i++){
	    	  s=0;
	    	  for(int j=2; j<i; j++) {
	    		  if(i%j==0) {
	    			  s=1;
	    			  break;
	    		  }
	    	  }
	    	  if( s==0){
	        nums.add(i);
	        
	    }
	    }
	    System.out.println(nums);
	    
	}
	  }


