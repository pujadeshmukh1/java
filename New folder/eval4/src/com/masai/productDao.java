package com.masai;





import java.util.List;

import com.masai.exceptions.ProductException;
import com.mysql.cj.exceptions.CJException;

import Mod.product;

public interface productDao {

	
	public String addProduct(product product) throws CJException;
	
	public List<product> getAllProducts() throws CJException;
	public List<product> getAllProductQuantityLessThan(int quantity)throws CJException;
	public product getProductByProductName(String pname)throws CJException;
	
}
