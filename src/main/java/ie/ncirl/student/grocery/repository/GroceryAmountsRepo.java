package ie.ncirl.student.grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ie.ncirl.student.grocery.entity.GroceryAmounts;

public interface GroceryAmountsRepo extends JpaRepository<GroceryAmounts, String>{

}
