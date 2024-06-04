package EmployeesalaryCalcualtion;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeSal_impl implements SalaryDao {
	private HibernateTemplate hTemplate;	

	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
	//-----------------------------------

	@Transactional
	public int insert(Employee ep) {
		int i= (Integer)hTemplate.save(ep);
		return i;
	}

	
	public Employee getEmployee(int id) {
		Employee emp=hTemplate.get(Employee.class, id);
		return emp;
	}

	
	public List<Employee> getAllEmployee() {
		List<Employee> list = hTemplate.loadAll(Employee.class);
		return list;
	}

	@Transactional
	public void update(Employee ep) {
		hTemplate.update(ep);
		
	}

	@Transactional
	public void delete(int id) {
		Employee ep = hTemplate.get(Employee.class, id);
		hTemplate.delete(ep);
	}

}
