package ie.ncirl.student.grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ie.ncirl.student.grocery.entity.GrocerySource;

public interface GrocerySourceRepo extends JpaRepository<GrocerySource, String>{

}
