package usecases;

import java.util.List;

import com.masai.ProductDaoImpl;
import com.masai.productDao;
import com.mysql.cj.exceptions.CJException;

import Mod.product;

public class getAllProducts {

public static void main(String[] args) {
		
		
	productDao dao = new ProductDaoImpl();
		
		
		try {
		 	List<product> students = dao.getAllProducts();
		 	students.forEach(s -> System.out.println(s));
			 	
		 	
		} catch (CJException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	
}
