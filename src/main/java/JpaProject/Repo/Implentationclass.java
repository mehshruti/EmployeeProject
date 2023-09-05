package JpaProject.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JpaProject.Entity.employeeDet;
@Service
public class Implentationclass implements service
{
	@Autowired
	 Employee employee1;
	public Implentationclass() {
	
	}

	@Override
	public List<employeeDet> getdetails() {
		return employee1.findAll();
	}

	@Override
	public employeeDet getDetails(long employeeid) {

		return employee1.getOne(employeeid);
	}

	@Override
	public employeeDet addemployee(employeeDet addemp) {
		
		return employee1.save(addemp);
	}

	@Override
	public employeeDet updateemployee(employeeDet update) {
		return employee1.save(update);
	}

	@Override
	public void deleteemployee(long employeeId) {
		 		employeeDet entity=employee1.getOne(employeeId);
		 		employee1.delete(entity);		
	}
}
