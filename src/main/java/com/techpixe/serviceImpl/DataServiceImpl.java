package com.techpixe.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techpixe.entity.Data;
import com.techpixe.repository.DataRepository;
import com.techpixe.service.DataService;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private DataRepository dataRepository;

	@Override
	public Data saveData(String fullName, String email, Long mobileNumber) {
		Data data = new Data();
		data.setFullName(fullName);
		data.setEmail(email);
		data.setMobileNumber(mobileNumber);
		return dataRepository.save(data);
	}

}
