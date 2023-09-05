package JpaProject.Repo;

import java.util.List;
import java.lang.*;

import JpaProject.Entity.employeeDet;

public interface service {
	public List<employeeDet> getdetails();
	public employeeDet getDetails(long employeeid);
	public employeeDet addemployee(employeeDet addemp); 
	public employeeDet updateemployee(employeeDet update);
	public void deleteemployee(long employeeId);


}
