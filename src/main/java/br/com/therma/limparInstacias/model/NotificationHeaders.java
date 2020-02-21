package br.com.therma.limparInstacias.model;

public class NotificationHeaders {
	private String NotificationNo;
	private String StartDate;
	private String CompletionDate;
	private String SystemStatus;
	private String Description;
	private boolean Refresh;
	private boolean KeepScrollPosition;
	private String XPath;
	private String GridSearchOne;
	private String GridSearchTwo;
	private String GridSearchThree;
	private String LastGUID;
	private String FromDate;
	private String ToDate;
	private boolean boolEnable;
	private String changedDate;
	private String createdDate;


	// Getter Methods 

	public String getNotificationNo() {
		return NotificationNo;
	}

	public String getStartDate() {
		return StartDate;
	}

	public String getCompletionDate() {
		return CompletionDate;
	}

	public String getSystemStatus() {
		return SystemStatus;
	}

	public String getDescription() {
		return Description;
	}

	public boolean getRefresh() {
		return Refresh;
	}

	public boolean getKeepScrollPosition() {
		return KeepScrollPosition;
	}

	public String getXPath() {
		return XPath;
	}

	public String getGridSearchOne() {
		return GridSearchOne;
	}

	public String getGridSearchTwo() {
		return GridSearchTwo;
	}

	public String getGridSearchThree() {
		return GridSearchThree;
	}

	public String getLastGUID() {
		return LastGUID;
	}

	public String getFromDate() {
		return FromDate;
	}

	public String getToDate() {
		return ToDate;
	}

	public boolean getBoolEnable() {
		return boolEnable;
	}

	public String getChangedDate() {
		return changedDate;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	// Setter Methods 

	public void setNotificationNo(String NotificationNo) {
		this.NotificationNo = NotificationNo;
	}

	public void setStartDate(String StartDate) {
		this.StartDate = StartDate;
	}

	public void setCompletionDate(String CompletionDate) {
		this.CompletionDate = CompletionDate;
	}

	public void setSystemStatus(String SystemStatus) {
		this.SystemStatus = SystemStatus;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public void setRefresh(boolean Refresh) {
		this.Refresh = Refresh;
	}

	public void setKeepScrollPosition(boolean KeepScrollPosition) {
		this.KeepScrollPosition = KeepScrollPosition;
	}

	public void setXPath(String XPath) {
		this.XPath = XPath;
	}

	public void setGridSearchOne(String GridSearchOne) {
		this.GridSearchOne = GridSearchOne;
	}

	public void setGridSearchTwo(String GridSearchTwo) {
		this.GridSearchTwo = GridSearchTwo;
	}

	public void setGridSearchThree(String GridSearchThree) {
		this.GridSearchThree = GridSearchThree;
	}

	public void setLastGUID(String LastGUID) {
		this.LastGUID = LastGUID;
	}

	public void setFromDate(String FromDate) {
		this.FromDate = FromDate;
	}

	public void setToDate(String ToDate) {
		this.ToDate = ToDate;
	}

	public void setBoolEnable(boolean boolEnable) {
		this.boolEnable = boolEnable;
	}

	public void setChangedDate(String changedDate) {
		this.changedDate = changedDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
}
