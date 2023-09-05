package JpaProject.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employeeDet {
	@Id
	 //@GeneratedValue
	private long id;
	 
	private String emp_name;
	private String address;
	
	@Override
	public String toString() {
		return "employeeDet [id=" + id + ", name=" + emp_name + ", address=" + address + "]";
	}
//	
	
	public long getid() {
		return id;
	}
	public void setid(long id) {
		this.id = id;
	}
	public String getemp_name() {
		return emp_name;
	}
	public void setemp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public employeeDet() {
		
	}
	public employeeDet(long id, String emp_name, String address) {
		this.id = id;
		this.emp_name = emp_name;
		this.address = address;
	}
	
}
