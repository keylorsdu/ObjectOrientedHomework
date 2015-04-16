package work2serviceloader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.Maker;
import util.RandomListGen;

public class Application {
	
	public static Maker maker = new Maker();
	public static void main(String[] args) {
		SortServiceProvider sp = new SortServiceProvider();
		sp.registerService(new BubbleSort());
		sp.registerService(new QuickSort());
		sp.registerService(new SelectSort());
		
		System.out.println(sp.getAllServices());
		
		
		SortService sorter = sp.getService(QuickSort.name);
		for(int i  = 15 ;i <= 20; i++){
		List<Integer> A = RandomListGen.gen(20);
		System.out.println("δ����ʱΪ��"+A);
		sorter.sort(A);
		List<Integer> B = new ArrayList<Integer>(A);
		Object[] b = B.toArray();
		Arrays.sort(b);
		Arrays.equals(A.toArray(),b);
		boolean passtest = Arrays.equals(A.toArray(),b);
		System.out.println("�����Ϊ��"+A);
		System.out.println("�Ƿ����  "+Arrays.equals(A.toArray(),b));
		if(!passtest){
			System.out.println("failed");
			break;
		}
		else{
			System.out.println(passtest);
		}
		
		}
//		maker.print();
//		A  = RandomListGen.gen(30);
//		System.out.println("δ����ʱΪ��"+A);
//		sorter = sp.getService(SelectSort.name);
//		sorter.sort(A);
//		System.out.println("�����Ϊ��"+A);
//		maker.print();
		
		
	}

}
