package com.data.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.data.domain.PopUpStoreInfo;

@Repository
public interface PopUpStoreMongoRepository extends MongoRepository<PopUpStoreInfo, String> {
	List<PopUpStoreInfo> findByModifiedDate(LocalDate yourDateField);
}
