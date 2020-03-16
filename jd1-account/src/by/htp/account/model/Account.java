package by.htp.account.model;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/ 
public class Account implements Comparable<Account> {
	
	private int id;
	
	private int balance;
	
	private boolean blocked;
	
	private boolean isOpen;
	
	public Account( int balance) {
		this.balance = balance;
		this.blocked = false;
		this.isOpen = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	@Override
	public int compareTo(Account o) {
		return this.id - o.getId();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + (isOpen ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (balance != other.balance)
			return false;
		if (blocked != other.blocked)
			return false;
		if (id != other.id)
			return false;
		if (isOpen != other.isOpen)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", blocked=" + blocked + ", isOpen=" + isOpen + "]";
	}
	
	
}
