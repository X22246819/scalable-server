package ie.ncirl.student.grocery.service;

import java.util.List;

import ie.ncirl.student.grocery.dto.GroceryDto;
import ie.ncirl.student.grocery.dto.GrocerySourceDto;

public interface GroceryService {
	List<GrocerySourceDto> getSource();
	List<GroceryDto> getGrocery();
	GroceryDto createGrocery(GroceryDto groceryDto);
	GroceryDto updateGrocery(String id, GroceryDto updatedGrocery);
	void deleteGrocery(String id);
}
