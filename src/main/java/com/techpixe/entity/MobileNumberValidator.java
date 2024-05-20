package com.techpixe.entity;

//package com.techpixe.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MobileNumberValidator implements ConstraintValidator<ValidMobileNumber, Long> {

	@Override
	public void initialize(ValidMobileNumber constraintAnnotation) {
	}

	@Override
	public boolean isValid(Long mobileNumber, ConstraintValidatorContext context) {
		if (mobileNumber == null) {
			return false;
		}
		String mobileNumberStr = mobileNumber.toString();
		return mobileNumberStr.matches("\\d{10}");
	}
}
