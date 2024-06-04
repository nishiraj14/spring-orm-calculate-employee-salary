package EmployeesalaryCalcualtion;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //Entity means pogo class
@Table(name="Empslary")
public class Employee {
	
	@Id
	private int id;
	private float bs;
	private float hra;
	private float ta;
	private float da;
	private float pf;
	private float tax;
	private float netsal;
	
	public float getNetsal() {
		return netsal;
	}
	public float setNetsal(float netsal) {
		return this.netsal = netsal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getBs() {
		return bs;
	}
	public float setBs(float bs) {
		return this.bs = bs;
	}
	public float getHra() {
		return hra;
	}
	public float setHra(float hra) {
		return this.hra = hra;
	}
	public float getTa() {
		return ta;
	}
	public float setTa(float ta) {
		return this.ta = ta;
	}
	public float getDa() {
		return da;
	}
	public float setDa(float da) {
		return this.da = da;
	}
	public float getPf() {
		return pf;
	}
	public float setPf(float pf) {
		return this.pf = pf;
	}
	public float getTax() {
		return tax;
	}
	public float setTax(float tax) {
		return this.tax = tax;
	}
	

	public Employee(int id, float bs, float hra, float ta, float da, float pf, float tax, float netsal) {
		super();
		this.id = id;
		this.bs = bs;
		this.hra = hra;
		this.ta = ta;
		this.da = da;
		this.pf = pf;
		this.tax = tax;
		this.netsal = netsal;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", bs=" + bs + ", hra=" + hra + ", ta=" + ta + ", da=" + da + ", pf=" + pf
				+ ", tax=" + tax + ", netsal=" + netsal + "]";
	}
	
	
	
	
    
	

	
	
	

}
