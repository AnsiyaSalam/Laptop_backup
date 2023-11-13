package com.stackroute.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {
    //write here logic to get sorted Array List which is a global class variable
	
	List<String> sortedCatalog = new ArrayList<>();
    public String catalogListSorter(List<String> unSortedCatalogList) 
    {
    	
    	String out="";
    	boolean flag=false;
    	if(unSortedCatalogList==null)
    	{
    		out="The catalog list is null";
    	}
    	else if(unSortedCatalogList.isEmpty())
    	{
    		out="The catalog List is empty";
    	}
    	else
    	{
    		for(String str:unSortedCatalogList)
    		{
    			if(str == null || str.isEmpty() || str.isBlank())
    			{
    				out="The catalog List contains empty or null or blank space as a value";
    				flag=true;
    			}
    		}
    		if(flag==false)
    		{
    			Collections.sort(unSortedCatalogList);
    			out+=unSortedCatalogList;
    		}
    		sortedCatalog.addAll(unSortedCatalogList);
    	}
    	return out;
    }
    			
    	
    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {

    	if (value==null || value.isEmpty() || value.isBlank()) 
    	{
    		return"Input is not accepted";
        }
        else 
        {
    		for(String str:sortedCatalog) 
    		{
    		     if(str.equalsIgnoreCase(value)) 
    		     {
    		        return "Found: "+str;
    		     }
    		}
          }
    	return "Not Found";
    }
}

