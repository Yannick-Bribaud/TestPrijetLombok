package com.demo.Lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/*
 *  setting level of access to the getter out of this class, here it's private level access
	@Getter(AccessLevel.PUBLIC)
 * 
 * @ToString(includeFieldNames = false) here we hide fields names from this method
 * @ToString.Include(name = "color", rank = 3) // here we make decision to print this only one field of this class
 * @ToString.Exclude // we exclude this field out of our toString method
 * @ToString(onlyExplicitlyIncluded = true) to print only one fields of this class which is adding
   @ToString.Exclude on this fields
 * 
 * @ToString(includeFieldNames = false, callSuper = true) to call toString method of superclass
 * @SuperBuilder it's use for inheritance form in classes. 
 * 
 * 
 * */



@Data
@AllArgsConstructor
@Builder (builderClassName = "DogBuilder",
		   buildMethodName = "execute",
		   builderMethodName = "aDog",
		   access =AccessLevel.PUBLIC,
		   setterPrefix = "set")

@Accessors(chain = true, fluent=true)
@ToString(includeFieldNames = true)
//@RequiredArgsConstructor
@NoArgsConstructor
public class Dog {
	
	@Builder.Default // set this fields as default with string in a builder
	private String name="thanks";
	private int age;
	//@NonNull
	private String color;
	
	private double price;
}
