package ProjectATM;

public class PayManager {
	CardManager _cardManager;
	public PayManager(CardManager cardManager) {
		_cardManager =cardManager;
	}
	
	public void Withdrawal(Card card, int amount) {
		_cardManager.UpdateForWithdrawal(card, amount);
	}
	public void Deposit(Card card, int amount) {
		_cardManager.UpdateForDeposit(card, amount);
	}
	
	public int BalanceInquiry(Card card) {
		return card.getBalance();
	}
	
	
}
