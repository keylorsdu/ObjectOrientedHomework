package work2serviceloader;

import java.util.List;

public interface SortService {
	public String getName();
	public <T extends Comparable<T>> void sort(List<T> A);

}
