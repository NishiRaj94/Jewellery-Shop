package com.net.ShoppingFrontend.controller;





import java.io.FileOutputStream;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.net.ShoppingBackend.dao.CategoryDao;
import com.net.ShoppingBackend.dao.ProductDao;
import com.net.ShoppingBackend.dao.SuplierDao;
import com.net.ShoppingBackend.model.Product;

@Controller
public class ProductController {

	@Autowired
	 Product product;
	@Autowired
	 ProductDao productDao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	SuplierDao supplierDao;
	@Autowired
	 HttpSession httpSession;
	@RequestMapping("/product")
	 public String product(Model model) {
	 model.addAttribute("product",product);	
model.addAttribute("productList",productDao.listAllProduct());
	 model.addAttribute("categoryList",categoryDao.listAllCategory());
	 model.addAttribute("suplierList",supplierDao.listAllSuplier());
		return "product";
		
	}
	
@RequestMapping(value="/addproduct", method=RequestMethod.POST)
 public String addProduct(@ModelAttribute("product") Product product,Model model)
{
	if(product.getProductId()==0)
	{
	productDao.addProduct(product );
	MultipartFile f=product.getFile();
	ServletContext servletContext=httpSession.getServletContext();
	String filelocation=servletContext.getRealPath("/resources/images/");
	String filename=filelocation+"\\"+product.getProductId()+".jpg";

    try {
       
        byte[] bytes = f.getBytes();
        FileOutputStream buffStream=new FileOutputStream(filename);
        buffStream.write(bytes);
        buffStream.close();
        
    } catch (Exception e) {
        
    }
	}
	else
	{
	productDao.updateProduct(product);
	
}	
return "product";

}
  @RequestMapping("/updateProduct/{productId}")
  public String updateProduct(@PathVariable("productId") String productId,Model model) {	
	  System.out.println("in update controller");
	  model.addAttribute("Product",productDao.getProduct(productId));
      model.addAttribute("productList",productDao.listAllProduct());
               return "product";
}
	@RequestMapping("/deleteProduct/{productId}")
	public String deleteCategory(@PathVariable("productId") String productId,Model model) {
productDao.deleteProduct(productId);
return "redirect:/product";
	}
	
	@RequestMapping("/getproductByCategory/{cat_id}")
	public String getproductByCategory(@PathVariable("cat_id")String cat_id,Model model) {
		model.addAttribute("productList", productDao.getproductByCategory(cat_id));
		return "product";
	}

  }


