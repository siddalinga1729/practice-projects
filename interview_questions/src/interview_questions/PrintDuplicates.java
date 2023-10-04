package interview_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//print duplicate names in given data
public class PrintDuplicates {
	public static void main(String[] args) {
		List<Employee> eList = new ArrayList<>();
		eList.add(new Employee("1","siddu","manager", 26));
		eList.add(new Employee("2","varun","softwareengineer", 29));
		eList.add(new Employee("3","siddu","Asst.Manager", 26));
		eList.add(new Employee("4","hari","HR", 22));
		Map<String, Long> collect = eList.stream().collect(Collectors.groupingBy(Employee:: geteName,Collectors.counting()));
	System.out.println(collect);
	
	
	
	Map<String,Integer> emap=new HashMap<>();
	for(Employee e: eList) {
		if(!emap.containsKey(e.geteName())) {
			emap.put(e.geteName(), 1);
		}else {
			emap.put(e.geteName(),emap.get(e.geteName())+1);
		}
	}
	System.out.println(emap);
	}
	
}
