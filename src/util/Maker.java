package util;

import java.util.ArrayList;
import java.util.List;

public class Maker {
	// 
	List<String> makers = new ArrayList<String>();
	
	public void add(String textmaker){
		makers.add(textmaker+"\n");
	}
	public void clear(){
		makers.clear();
	}
	public void print(){
		System.out.println(makers);
	}

}
