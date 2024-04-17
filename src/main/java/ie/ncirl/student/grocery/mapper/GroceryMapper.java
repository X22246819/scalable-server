package ie.ncirl.student.grocery.mapper;

import ie.ncirl.student.grocery.dto.GroceryDto;
import ie.ncirl.student.grocery.dto.GrocerySourceDto;
import ie.ncirl.student.grocery.entity.GroceryAmounts;
import ie.ncirl.student.grocery.entity.GroceryInfo;
import ie.ncirl.student.grocery.entity.GrocerySource;

public class GroceryMapper {

	/*
	 * Conversions - DTO to Info and source to amounts
	 */
	public static GroceryDto mapToGroceryDto(GroceryInfo groceryInfo, GroceryAmounts groceryAmounts) {
		return new GroceryDto(
			groceryInfo.getId(),
			groceryInfo.getName(),
			groceryInfo.getType(),
			groceryInfo.getCostPerItem(),
			groceryInfo.getSource(),
			groceryAmounts.getItemsAvailable()
		);
	}
	
	public static GroceryInfo mapToGroceryInfo(GroceryDto groceryDto) {
		return new GroceryInfo(
			groceryDto.getId(),
			groceryDto.getName(),
			groceryDto.getType(),
			groceryDto.getSource(),
			groceryDto.getCostPerItem()
		);
	}
	
	public static GroceryAmounts mapToGroceryAmounts(GroceryDto groceryDto) {
		return new GroceryAmounts(
			groceryDto.getId(),
			groceryDto.getItemsAvailable(),
			groceryDto.getItemsAvailable()*groceryDto.getCostPerItem()
		);
	}
	
	public static GrocerySourceDto mapToGrocerySourceDto(GrocerySource grocerySource) {
		return new GrocerySourceDto(
			grocerySource.getId(),
			grocerySource.getSource()
		);
	}
}
