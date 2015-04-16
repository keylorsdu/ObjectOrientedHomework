package work2serviceloader;

import java.util.LinkedList;
import java.util.List;

public class SelectSort implements SortService{
	public final static String name ="选择排序";

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public <T extends Comparable<T>> void sort(List<T> A) {
		// TODO Auto-generated method stub
		List<T> B = new LinkedList<T>(A);
		int length = A.size()-1;
		while(!B.isEmpty()){
			T max = MaxOfList(B);
			A.set(length--, max);
			if(B.remove(max))
				Application.maker.add(max + " 从B中删除");			
		}
		
	}
	private <T extends Comparable<T>> T MaxOfList(List<T> A){
		T max = null;
		if(A.size() < 1){
			Application.maker.add("空列表:"+name);
			return max;
		}else{
			max = A.get(0);
		}
		for(T t :A){
			
			if(t.compareTo(max) > 0){
				max = t;
			}
			
		}
		return max;
	}

}
