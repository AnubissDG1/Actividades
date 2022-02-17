package com.example.Carro.repositories;






import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.Carro.models.CarroModel;

@Repository
public interface CarroRepository extends CrudRepository<CarroModel,Long> {

  
    @Query(value = "select * from carros c where c.color like %:keyword% or c.marca like %:keyword%", nativeQuery = true)
    List<CarroModel> findByKeyword(@Param("keyword") String keyword);
    

    
    

}
