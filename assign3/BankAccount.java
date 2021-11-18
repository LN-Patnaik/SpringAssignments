package assign3;

public class BankAccount {

	private int accountId,accountBalance;
	private String accountHolderName,accountType;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountBalance=" + accountBalance + ", accountHolderName="
				+ accountHolderName + ", accountType=" + accountType + "]";
	}
	
}
