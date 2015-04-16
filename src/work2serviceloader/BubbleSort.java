package work2serviceloader;

import java.util.List;

import util.Maker;

public class BubbleSort implements SortService {
	
	public final static String name = "√∞≈›≈≈–Ú ";

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public <T extends Comparable<T>> void sort(List<T> A) {
		// TODO Auto-generated method stub
		for(int i = 0;i<A.size();i++){
			for(int j = i ;j<A.size();j++){
				T aT = A.get(i);
				T bT = A.get(j);
				if(aT.compareTo(bT) > 0){
					A.set(i, bT);
					A.set(j, aT);
					Application.maker.add(i+"->"+ aT+" ”Î "+j+"->"+bT+"Ωªªª¡À");
				}
			}
		}
		
	}

}
