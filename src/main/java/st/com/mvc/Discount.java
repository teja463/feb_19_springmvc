package st.com.mvc;

import org.hibernate.validator.constraints.Range;

public class Discount {
	double amount, rate, discount;

	@Range(min=1000, message ="Invalid Amount. Must be more than 1000")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Range(min=5, max=50, message ="Invalid Discount Rate. Must be between 5 and 50")
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
