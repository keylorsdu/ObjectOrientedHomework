package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import work2serviceloader.Application;

public class RandomListGen {
	
	public static List<Integer> gen(int length){
		List<Integer> list = new ArrayList<Integer>();
		Random ran = new Random();
		for(int i = 0;i<length;i++){
			int ranint = ran.nextInt(1000);
			list.add(ranint);
		}
		Application.maker.add(list.toString());
		return list;
		
	}

}
