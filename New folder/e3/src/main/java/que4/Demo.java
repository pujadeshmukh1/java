package que4;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;

public class Demo {

	public static void main(String[] args){
		
		EntityManager em = EMUtil.getEM();
		
		SalariedEmployee se = new SalariedEmployee();
		SalariedEmployee se1 = new SalariedEmployee();
		SalariedEmployee se2 = new SalariedEmployee();
		SalariedEmployee se3 = new SalariedEmployee();
		
		se.setEmpName("asha");
		se.setEmail("asha@gmail.com");
		se.setSalary(10000);
		se1.setEmpName("annu");
		se1.setEmail("anu@gmail.com");
		se1.setSalary(11000);
		se2.setEmpName("disha");
		se2.setEmail("disha@gmail.com");
		se2.setSalary(12000);
		se3.setEmpName("uma");
		se3.setEmail("uma@gmail.com");
		se3.setSalary(9000);
		
		ConractualEmployee ce = new ConractualEmployee();
		ConractualEmployee ce1 = new ConractualEmployee();
		ConractualEmployee ce2 = new ConractualEmployee();
		ConractualEmployee ce3 = new ConractualEmployee();
	    ce.setEmpName("Aju");
	    ce.setCostofperday(500);
	    ce.setMobileNumber("1234567890");
	    ce.setNoOfWorkingDays(5);
	    
	    ce1.setEmpName("Shub");
	    ce1.setCostofperday(600);
	    ce1.setMobileNumber("1234567890");
	    ce1.setNoOfWorkingDays(4);
	    
	    ce2.setEmpName("Hari");
	    ce2.setCostofperday(700);
	    ce2.setMobileNumber("9874563210");
	    ce2.setNoOfWorkingDays(7);
	    
	    ce3.setEmpName("Ram");
	    ce3.setCostofperday(400);
	    ce3.setMobileNumber("9012507749");
	    ce3.setNoOfWorkingDays(8);
	    
	    em.getTransaction().begin();
	    em.persist(se);
	    em.persist(se1);
	    em.persist(se2);
	    em.persist(se3);
	    
	    em.persist(ce);
	    em.persist(ce1);
	    em.persist(ce2);
	    em.persist(ce3);
	    em.getTransaction().commit();
	    System.out.println("Done...");
	    em.close();
	    
	}
	
	
	
}
