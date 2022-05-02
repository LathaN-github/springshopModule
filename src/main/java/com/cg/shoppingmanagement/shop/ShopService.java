package com.cg.shoppingmanagement.shop;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class ShopService 
{
	@Autowired
	public ShopRepository repo;
	
	public  List<ShopEntities> listAll(){
		return repo.findAll();
	}

	public ShopEntities get(Integer id) {
		return repo.findById(id).get();
	}

	public void save(ShopEntities shopEntities) {
		repo.save(shopEntities);
		
	}

	public void delete(Integer id) {
		repo.deleteById(id);
		
	}
}
	

	