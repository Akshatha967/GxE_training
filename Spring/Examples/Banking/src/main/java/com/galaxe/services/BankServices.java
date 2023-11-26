package com.galaxe.services;

import com.galaxe.model.LoanDetails;
import com.galaxe.model.PersonalDetails;

public interface BankServices {

	double processLoan(PersonalDetails personaldetals,LoanDetails loandetails);
}
