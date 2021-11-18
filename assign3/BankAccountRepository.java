package assign3;

interface BankAccountRepository {

	public double getBalance(long accountId);
	public void updateBalance(long accountId,double newBalance);
}
