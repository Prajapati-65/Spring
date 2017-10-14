package com.bridgeit.SpringAutoDetection.service;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;


@Service("dateService")
public class DateServiceImpl implements DateService {

	 public LocalDate getNextAssessmentDate() {
	        return new LocalDate(2017,10,15);
	    }
}
