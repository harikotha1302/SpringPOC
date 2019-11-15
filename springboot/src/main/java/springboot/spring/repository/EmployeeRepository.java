package springboot.spring.repository;

import org.springframework.data.repository.CrudRepository;

import springboot.spring.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

}
