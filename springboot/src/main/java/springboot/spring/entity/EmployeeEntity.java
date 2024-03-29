package springboot.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name="employee")
@Table(name="employee")
public class EmployeeEntity {

	@Id
	@Column(name="employeeid")
	private int employeeid;
	
	@Column(name="employeename")
	private String employeename;
	
	
	public EmployeeEntity() {
		super();
	}
	
	
	public EmployeeEntity(int employeeid, String employeename) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
	}


	public int getEmployeeid() {
		return employeeid;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	
}
