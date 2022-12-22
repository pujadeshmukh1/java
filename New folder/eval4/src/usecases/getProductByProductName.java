//package usecases;
//
//import java.util.Scanner;
//
//import com.masai.ProductDaoImpl;
//import com.masai.productDao;
//import com.mysql.cj.exceptions.CJException;
//
//import Mod.product;
//
//public class getProductByProductName {
//
//	
//	public static void main(String[] args) throws CJException {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter ProductName :");
//		String ProductName= sc.next();
//
//		productDao dao = new ProductDaoImpl();
//		
//		product pro;
//		try {
//			pro = dao.getProductByProductName(ProductName);
////		} catch (CJException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		if(pro != null)
//			System.out.println(pro);
//		else
//			System.out.println("Student does not exist with ProductName :"+ProductName);
//		
//		
//		
//	}	
//}
