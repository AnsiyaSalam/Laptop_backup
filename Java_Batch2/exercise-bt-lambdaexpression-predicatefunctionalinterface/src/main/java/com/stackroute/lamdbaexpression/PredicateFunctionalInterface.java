package com.stackroute.lamdbaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public List<String> findPattern(List<String> list) {
    	
    	Stream<String> startI=list.stream();
    	List<String> n1=new ArrayList<>();
        startI.filter(e -> e.charAt(0) == 'I').distinct().forEach(e -> n1.add(e));
        return n1;
    }
}
