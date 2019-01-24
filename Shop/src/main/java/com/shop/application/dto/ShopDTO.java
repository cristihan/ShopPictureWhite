package com.shop.application.dto;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.shop.domain.Picture;
import com.shop.domain.Shop;
import com.shop.utilities.InvalidParamException;
import com.shop.utilities.NotFoundException;

public class ShopDTO {
	
	@Expose
	private int shopId;
	@Expose
	private String nameShop;
	@Expose
	private int maxCapacity;
	
	@Expose
	private List<PictureDTO> allPictures = new ArrayList<PictureDTO>();
	
	public ShopDTO() {
		
	}
	
	public ShopDTO(Shop shop) throws NotFoundException, InvalidParamException  {
		if(shop == null)
			throw new NotFoundException();
		
		this.shopId = shop.getShopId();
		this.nameShop = shop.getNameShop();
		this.maxCapacity = shop.getMaxCapacity();
		this.allPictures = convertToDTO(shop.getAllPictures());		
	}
	
	private List<PictureDTO> convertToDTO(List<Picture> allPictures) throws InvalidParamException{
		List<PictureDTO> result = new ArrayList<>();
		for (Picture p : allPictures) {
			result.add(new PictureDTO(p));
		}
		return result;
	}

	public int getShopId() {
		return this.shopId;
	}

	public String getNameShop() {
		if(this.nameShop == null) return"";
		return this.nameShop;
	}

	public int getMaxCapacity() {
		if(this.maxCapacity <=0) return 1;
		return this.maxCapacity;
	}

	public List<PictureDTO> getAllPictures() {
		return new ArrayList<>(this.allPictures);
	}

	
	
	
	
	

}
