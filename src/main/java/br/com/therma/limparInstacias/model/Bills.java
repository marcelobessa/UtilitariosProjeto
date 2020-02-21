package br.com.therma.limparInstacias.model;

public class Bills {
	private String BillNo;
	private String BillCurrency;
	private String BillDue;
	private String BillPosted;
	private String BillReversed;
	private float BillAmount;
	private String BillAccount;
	private String BillCreationReason;
	private float BillConsumptionTotal;
	private boolean BillIsPaid;
	private String BillConsumptionType;
	private String BillMeterReadDate;
	private String BillMeterReadType;
	private float BillAverageTemperature;


	// Getter Methods 

	public String getBillNo() {
		return BillNo;
	}

	public String getBillCurrency() {
		return BillCurrency;
	}

	public String getBillDue() {
		return BillDue;
	}

	public String getBillPosted() {
		return BillPosted;
	}

	public String getBillReversed() {
		return BillReversed;
	}

	public float getBillAmount() {
		return BillAmount;
	}

	public String getBillAccount() {
		return BillAccount;
	}

	public String getBillCreationReason() {
		return BillCreationReason;
	}

	public float getBillConsumptionTotal() {
		return BillConsumptionTotal;
	}

	public boolean getBillIsPaid() {
		return BillIsPaid;
	}

	public String getBillConsumptionType() {
		return BillConsumptionType;
	}

	public String getBillMeterReadDate() {
		return BillMeterReadDate;
	}

	public String getBillMeterReadType() {
		return BillMeterReadType;
	}

	public float getBillAverageTemperature() {
		return BillAverageTemperature;
	}

	// Setter Methods 

	public void setBillNo(String BillNo) {
		this.BillNo = BillNo;
	}

	public void setBillCurrency(String BillCurrency) {
		this.BillCurrency = BillCurrency;
	}

	public void setBillDue(String BillDue) {
		this.BillDue = BillDue;
	}

	public void setBillPosted(String BillPosted) {
		this.BillPosted = BillPosted;
	}

	public void setBillReversed(String BillReversed) {
		this.BillReversed = BillReversed;
	}

	public void setBillAmount(float BillAmount) {
		this.BillAmount = BillAmount;
	}

	public void setBillAccount(String BillAccount) {
		this.BillAccount = BillAccount;
	}

	public void setBillCreationReason(String BillCreationReason) {
		this.BillCreationReason = BillCreationReason;
	}

	public void setBillConsumptionTotal(float BillConsumptionTotal) {
		this.BillConsumptionTotal = BillConsumptionTotal;
	}

	public void setBillIsPaid(boolean BillIsPaid) {
		this.BillIsPaid = BillIsPaid;
	}

	public void setBillConsumptionType(String BillConsumptionType) {
		this.BillConsumptionType = BillConsumptionType;
	}

	public void setBillMeterReadDate(String BillMeterReadDate) {
		this.BillMeterReadDate = BillMeterReadDate;
	}

	public void setBillMeterReadType(String BillMeterReadType) {
		this.BillMeterReadType = BillMeterReadType;
	}

	public void setBillAverageTemperature(float BillAverageTemperature) {
		this.BillAverageTemperature = BillAverageTemperature;
	}
}
