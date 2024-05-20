package com.techpixe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Full name cannot be null")
	private String fullName;

	@NotNull(message = "Email cannot be null")
	@Email(message = "Email should be valid")
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.com$", message = "Email should be in the format 'example@example.com'")
	private String email;

	@NotNull(message = "Mobile number cannot be null")
	@ValidMobileNumber
	private Long mobileNumber;

	/*
	 * If you want to use Long as the data type for the mobile number, you'll need
	 * to handle the validation differently since @Pattern works on String fields.
	 * One approach is to add a custom validation annotation or to convert the Long
	 * to String for the purpose of validation within your setter or getter.
	 * 
	 * 
	 * Explanation: Custom Annotation: @ValidMobileNumber is a custom annotation
	 * that specifies the validation logic for mobile numbers. Validator Class:
	 * MobileNumberValidator implements ConstraintValidator and contains the logic
	 * to check if the mobile number is exactly 10 digits. Entity Class: Use the
	 * custom @ValidMobileNumber annotation on the mobileNumber field to apply the
	 * validation. This setup ensures that the mobileNumber field is validated
	 * correctly while allowing you to keep it as a Long type.
	 * 
	 * 
	 */

}
