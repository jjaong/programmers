package level2;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxValue {
	public static void main(String[] args) {
		
	}
	
	public String solution(String s) {
        String answer = "";
        String a [] = s.split(" ");
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0; i<a.length;i++) {
        	arr.add(Integer.parseInt(a[i]));
        }
        
        
        return answer =Collections.min(arr)+ " " + Collections.max(arr);
    }
	
}
