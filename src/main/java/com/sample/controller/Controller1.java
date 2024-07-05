package com.sample.controller;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.pojo.Employee;

public class Controller1 {
	public static void main(String[] args) throws JsonProcessingException {
	 Employee impl1=new Employee();
     
     impl1.setId(1);
     impl1.setName("Alien");
     impl1.setCity("Bengaluru");
//           System.out.println(impl1);
     
     Employee impl2=new Employee();
     
     impl2.setId(2);
     impl2.setName("Alex");
     impl2.setCity("Newyork");
     
     Employee impl3=new Employee();
     
     impl3.setId(1);
     impl3.setName("Bumrah");
     impl3.setCity("Mumbai");
     
     List<Employee> list=new ArrayList<>();
     list.add(impl1);
     list.add(impl2);
     list.add(impl3);
     
     ObjectMapper mapper = new ObjectMapper();
//     String json=mapper.writeValueAsString(list);
     String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
     System.out.println(json);
}
}
