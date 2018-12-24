package com.net.ShoppingFrontend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.net.ShoppingBackend.dao.SuplierDao;
import com.net.ShoppingBackend.model.Supplier;

@Controller
public class SuplierController {
	@Autowired
	Supplier supplier;
	@Autowired
	SuplierDao suplierDao;
	@RequestMapping("/suplier")
	 public String suplier(Model model)
	{
		model.addAttribute("supplier",supplier);
	model.addAttribute("supplierList",suplierDao.listAllSuplier());
		return "suplier";
	}
                   
@RequestMapping(value="/addSuplier", method=RequestMethod.POST)
public String addSuplier(@ModelAttribute("suplier") Supplier suplier,Model model) {
	

	if(suplier.getSuplierId()==null)
	suplierDao.addSuplier(suplier);
	else
		suplierDao.updateSuplier(suplier);
	return "redirect:/suplier";	
}
@RequestMapping("/updateSuplier/{suplierId}")
public String updateCategory(@PathVariable("suplierId") String suplier,Model model) {
	
	System.out.println("in update controller");
	model.addAttribute("suplier",suplierDao.getSuplier(suplier));
	model.addAttribute("suplierList",suplierDao.listAllSuplier());
return "suplier";	
}
@RequestMapping("/deleteSuplier/{suplierId}")
public String deleteSuplier(@PathVariable("suplierId") String suplierId,Model model) {
		suplierDao.deleteSuplier(suplierId);
return "redirect:/suplier";

}
}

