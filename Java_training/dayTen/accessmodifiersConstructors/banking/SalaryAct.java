package banking;

import java.util.List;

public class SalaryAct extends Accounting {

	
	@Override
	public float withdraw(float amount) {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public float deposit(float amount) {
		// TODO Auto-generated method stub
		return amount;
	}

	
	// transfer and history in salAct
	@Override
	public float transfer(Long arc_act, Long targer_ac, float amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Float> history(int ac_number) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

