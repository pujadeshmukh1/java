package que4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.EMUtil.EMUtil;


public class Demo2 {
	public static void main(String[] args) {
		EntityManager em = EMUtil.getEM();
		String jpql = "from ConractualEmployee";
		TypedQuery<ConractualEmployee> q = em.createQuery(jpql, ConractualEmployee.class);
		
		List<ConractualEmployee> ce = q.getResultList();
		ce.forEach(c->{
			System.out.println(c);
		});

	}
}
