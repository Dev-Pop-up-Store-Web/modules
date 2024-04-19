package com.mongo.data.domain;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "infos")
public class PopUpStoreInfo {

	@Id
	private String id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<String> openTimes;
	private String region;
	private String address;
	private int ticketPrice;
	private String snsUrl;
	private String webUrl;
	private boolean parkingAvailability;
	private List<String> urls;

	@CreatedDate
	private LocalDate createdDate;
	@LastModifiedDate
	private LocalDate modifiedDate;
}

