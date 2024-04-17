package ie.ncirl.student.grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ie.ncirl.student.grocery.entity.GroceryInfo;

public interface GroceryInfoRepo extends JpaRepository<GroceryInfo, String>{

}
