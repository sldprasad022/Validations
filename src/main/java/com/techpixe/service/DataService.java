package com.techpixe.service;

import com.techpixe.entity.Data;

public interface DataService {
	Data saveData(String fullName, String email, Long mobileNumber);
}
