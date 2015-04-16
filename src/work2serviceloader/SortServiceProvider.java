package work2serviceloader;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortServiceProvider {
	Map<String,SortService> services = new HashMap<String,SortService>();
	
	public void registerService(SortService service){
		String name  = service.getName();
		if(!services.containsKey(name)){
			services.put(name, service);
			Application.maker.add(name+"已添加");
		}else{
			Application.maker.add("排序方法："+name+"已经存在");
		}
	}
	public void unregister(String servicename){
		
	}
	public Set<String> getAllServices(){
		return services.keySet();
		
	}
	
	public SortService getService(String servicename){
		if(services.containsKey(servicename)){
			return services.get(servicename);
		}else{
			Application.maker.add("排序方法："+servicename+"不存在");
			return null;
		}
	}

}
