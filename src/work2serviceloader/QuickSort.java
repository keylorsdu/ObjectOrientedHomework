package work2serviceloader;

import java.util.List;

public class QuickSort implements SortService{
	public final static String name ="øÏÀŸ≈≈–Ú";

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public <T extends Comparable<T>> void sort(List<T> A) {
		// TODO Auto-generated method stub
		quicksort(A, 0, A.size()-1);
		
	}
	public <T extends Comparable<T>> void quicksort(List<T>A,int L,int R){
		
		int i = L;
		int j = R + 1;
		if(L >= R){
			return;
		}
		T privot = A.get(L);
		
		while(i<j){
		do{
			if(i<A.size()-1)
				i++;
			else
				break;
			
		}while((A.get(i)).compareTo(privot) < 0);
		
		do{
			if(j>0)
				j --;
			else
				break;
		}while( (A.get(j).compareTo(privot)) > 0);
		
		Application.maker.add("i is "+i + "j is "+j+"privaot is " +privot);
		
		if(i>= j){
			break;
		}
		T aT  = A.get(i);
		T bT = A.get(j);
		A.set(i, bT);
		A.set(j,aT);
		}
		A.set(L, A.get(j));
		A.set(j, privot);
		
		quicksort(A, L, j-1);
		quicksort(A, j+1, R);
		
		
	}

}
