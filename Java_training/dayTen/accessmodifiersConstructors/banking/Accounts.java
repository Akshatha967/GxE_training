package banking;

import java.util.List;

public interface Accounts {

	public abstract float transfer(Long arc_act, Long targer_ac , float amount);
	public abstract List<Float> history(int ac_number) ;
	public abstract  float withdraw(float amount);
	public abstract float  deposit(float  amount);
	
}
