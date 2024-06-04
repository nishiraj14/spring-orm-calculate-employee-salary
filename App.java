package EmployeesalaryCalcualtion;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
        SalaryDao ed=ac.getBean("salDao",SalaryDao.class);
        
      /*  Employee ee=new Employee();       
	
		float bs1,h,t,d,p,tx;
        ee.setId(1);
        bs1=ee.setBs(25000);
        h=ee.setHra(bs1*15/100);
        t=ee.setTa(bs1*20/100);
        d=ee.setDa(bs1*5/100);
        p=ee.setPf(bs1*12/100);
        tx=ee.setTax(bs1*8/100);     
        ee.setNetsal(bs1+h+t+d-p-tx);
        
        int i = ed.insert(ee);
        System.out.println("Inserted Data: "+i);*/
        //-----------------------------------------
        /*Employee ee=ed.getEmployee(1);
        System.out.println(ee);*/
        //-------------------------
       /* List<Employee> list = ed.getAllEmployee();
        for(Employee e1:list)
        {
        	System.out.println(e1);
        }*/
        //-------------------------------
       /* Employee ee=new Employee();
        ee.setId(1);
        ee.setBs(45000);
        ee.setHra(35000*15/100);
        ee.setTa(35000*20/100);
        ee.setDa(3500*5/100);
        ee.setPf(35000*12/100);
        ee.setTax(35000*8/100);    
        ed.update(ee);
        System.out.println("Updated successfully !!!");*/
        //---------------------------------
       Employee ee=new Employee();
       float bs1,h,t,d,p,tx;
       ee.setId(1);
       bs1=ee.setBs(25000);
       h=ee.setHra(bs1*15/100);
       t=ee.setTa(bs1*20/100);
       d=ee.setDa(bs1*5/100);
       p=ee.setPf(bs1*12/100);
       tx=ee.setTax(bs1*8/100);     
       ee.setNetsal(bs1+h+t+d-p-tx);
        
       	ed.delete(1);
        System.out.println("Data deleted !!!");
        
       //---show remaining data---After delete-----
        List<Employee> list = ed.getAllEmployee();
        for(Employee e:list)
        {
        	System.out.println(e);
        }
    }
}
