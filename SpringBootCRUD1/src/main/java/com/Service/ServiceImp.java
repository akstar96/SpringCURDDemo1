package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.DaoI;
import com.Model.Emp;

@Service
public class ServiceImp implements ServiceI {
	@Autowired
	DaoI dao;

	@Override
	public void addEmp(Emp emp) {
		dao.save(emp);
	
		System.out.println("in services layer");
		
	}

	@Override
	public List<Emp> getallEmp(Emp emp) {
		return dao.findAll();
		
	}

	@Override
	public List<Emp> updateById(Emp emp) {
		dao.save(emp);
		List<Emp> e=dao.findAll();
		return e;
	}

	@Override
	public List<Emp> deleteById(int id) {
	dao.deleteById(id);
	List<Emp> e1=dao.findAll();
		return e1;
	}

	@Override
	public List<Emp> getallData(String fristName, String lastName) {
		List<Emp> b=dao.findByFristNameAndLastName(fristName, lastName);
		return b;
	}

}
