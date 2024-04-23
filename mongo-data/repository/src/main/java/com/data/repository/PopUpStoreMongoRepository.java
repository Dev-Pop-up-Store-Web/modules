package com.data.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopUpStoreMongoRepository extends MongoRepository<Object, String> {
	List<Object> findByModifiedDate(LocalDate yourDateField);
}
