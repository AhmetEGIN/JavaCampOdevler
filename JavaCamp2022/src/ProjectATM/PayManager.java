package ProjectATM;

public class PayManager {
	CardManager _cardManager;
	public PayManager(CardManager cardManager) {
		_cardManager =cardManager;
	}
	
	public void withdrawal(Card card, int amount) {
		_cardManager.updateForWithdrawal(card, amount);
	}
	public void deposit(Card card, int amount) {
		_cardManager.updateForDeposit(card, amount);
	}
	
	public int balanceInquiry(Card card) {
		return card.getBalance();
	}
	
	
}
