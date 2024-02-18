package com.trainer.trainermanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trainer.trainermanagement.model.Trainer;

 @Repository
	public interface TrainerRepository extends JpaRepository<Trainer, Long> {

}



