package com.stackroute.oops;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {

    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
    	for(Product p:ProductRepository.getProducts())
    	{
    		if(p.getProductCode()==productCode)
    		{ 
    			return p.getName(); 
    			}
    		}
    		
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        
    	Product[] products=getProductsByCategory(category);
    	if(products==null)
    	{
    		return null;
    	}
    	Product maxPrice= products[0];
    	for(Product p:products)
    	{
    		if(maxPrice.getPrice() < p.getPrice())
    		{
    			maxPrice=p;
    		}
    	}
    	return maxPrice;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        int count=0;
        for(Product p: ProductRepository.getProducts())
        {
        	if(p.getCategory().equalsIgnoreCase(category))
        	{
        		count++;
        	}
        }
        if (count==0)
        {
        	return null;
        }
    	Product[] categoryArr= new Product[count];
    	int i=0;
    	for(Product p:ProductRepository.getProducts())
    	{
    		if(p.getCategory().equalsIgnoreCase(category))
    		{
    			categoryArr[i]=p;
    			i++;
    		}
    	}
    	return categoryArr;
    }
}
