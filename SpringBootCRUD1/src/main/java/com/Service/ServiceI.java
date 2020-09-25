package com.Service;

import java.util.List;

import com.Model.Emp;

public interface ServiceI {
void addEmp(Emp emp);
List<Emp> getallEmp(Emp emp);
List<Emp> updateById(Emp emp);
List<Emp> deleteById(int id);
List<Emp> getallData(String firstName,String lastName);
	
}
