package com.masai;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exceptions.ProductException;
import com.mysql.cj.exceptions.CJException;

import Mod.product;
import Utility.DBUtil;



public class ProductDaoImpl implements productDao{

	

	private static final product product = null;

	@Override
	public String addProduct(product product) throws CJException {
		
String message = "Not Inserted...";
		
		
		try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into product values(?,?,?,?)");
			
			
			ps.setInt(1, product.getProductId());
		     ps.setString(2,  product.getProductName());
		     ps.setInt(3, product.getPrice());
		     ps.setInt(4, product.getQuantity());

		
		int x=  ps.executeUpdate();
		
		
			if(x > 0)
				message = "Record Inserted Successfully..";
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		
		return message;
		
		
		
		
		
		
	}

	@Override
	public List<product> getAllProducts() throws CJException {
		// TODO Auto-generated method stub
List<product> products = new ArrayList<>();
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from product");
			
			
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) {
				
				
				int pro_id= rs.getInt("productId");
				String pro_N= rs.getString("productName");
				int pro_p= rs.getInt("price");
				int pro_q= rs.getInt("quantity");
				
				
				product pro = new product(pro_id, pro_N, pro_p,pro_q);
				
				products.add(pro);
				
				
				
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			
			throw new CJException(e.getMessage());
		}
		
		
		if(products.size() == 0)
			throw new CJException("No product found...");
		
		
		
		return products;
	}

	@Override
	public List<product> getAllProductQuantityLessThan(int quantity) throws CJException {
		product products= null;
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement("select * from student where quantity = ?");
			
			ps.setInt(1, quantity);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int pro_id= rs.getInt("productId");
				String pro_N= rs.getString("productName");
				int pro_p= rs.getInt("price");
				int pro_q= rs.getInt("quantity");
				
				
             product prod = new product(pro_id, pro_N, pro_p,pro_q);
				
			
				
			}
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return (List<product>) products;
		
		
	}

	@Override
	public product getProductByProductName(String pname) throws CJException {
		String productName ="";
try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select marks from product where roll = ?");
		
			ps.setString(1, productName);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				productName= rs.getString("productName");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return product;
		
	}

	

	

	
	}

			
		
		
		

