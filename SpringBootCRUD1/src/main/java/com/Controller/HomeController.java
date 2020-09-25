package com.Controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Emp;
import com.Model.MailClass;
import com.Service.ServiceI;

@RestController
public class HomeController {
	private static final Logger logger= LogManager.getLogger(HomeController.class);
	@Autowired
	ServiceI service;
	@Autowired
	private JavaMailSender javamailsender;
	SimpleMailMessage mail=new SimpleMailMessage();
	@PostMapping("/")
	public Emp addEmp(@RequestBody Emp emp,@RequestBody MailClass mailc) {
		
		
		logger.warn("In Add Manger Addinng Emp in data Base");
		service.addEmp(emp);
		logger.info("In main controller Adding Emp");
		System.out.println("in home controller");
		mail.setReplyTo(mailc.getTo());
		mail.setSubject(mailc.getSub());
		mail.setText(mailc.getText());
		logger.info("sending mail to Emp which is newly added in system");
		javamailsender.send(mail);
		return emp;

	}
	

	@GetMapping("/getall")
	public List<Emp> getallEmp(Emp emp) {
		logger.warn("Displaying all Data ");
		return service.getallEmp(emp);

	}
	
	
	
	@PutMapping("/update/{id}")
	public List<Emp> updateById(@RequestBody Emp emp) {	
		logger.info("updateting Emp data ");
		System.out.println("in main controller update mapping");
		List<Emp> a =service.updateById(emp);
		logger.warn("Dispalying all Emp data");
		return a;
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Emp> deleteById(@PathVariable("id")int id){
		logger.info("In maincontroller deleteing emp data by using id");
		System.out.println("i main controller Delete mapping");
		return service.deleteById(id);	
	}
	
	
	@GetMapping("/update/{firstName}/{lastName}")
	public List<Emp> getAllData(@PathVariable String firstName,@PathVariable String lastName){
		logger.warn("Displaying All Emo data using firstNAme And LastName");
		List<Emp> b=service.getallData(firstName, lastName);
		logger.info("Dsiplaying All emp data");
		return b;
	}
	
	
	
}
