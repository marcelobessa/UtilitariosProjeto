package br.com.therma.limparInstacias.model;

import java.util.ArrayList;

public class Units {
	private String UnitID;
	private String UnitCategory;
	private String UnitType;
	private String UnitDoorNumber;
	private String UnitFloorNumber;
	private String UnitSpecialNotes;
	private String AuthorizationGroup;
	private float MaxOccupancy;
	private float CurrentOccupancy;
	private String CreatedBy;
	private String CreatedOn;
	private String ChangedByUser;
	private String ChangedOn;
	private boolean IsDeleted;
	private String Tags;
	private boolean IsSessionActive;
	private boolean IsBusinessActive;
	private boolean IsNew;
	private boolean IsChanged;
	private boolean IsVisible;
	private boolean IsReady;
	private boolean IsDone;
	private boolean IsTemp;
	private boolean IsFailed;
	private boolean IsEditable;
	private boolean IsRemoved;
	private boolean ValidateMe;
	private String EntityInfo_1;
	private String EntityInfo_2;
	private boolean Refresh;
	private boolean KeepScrollPosition;
	private String GridSearch;
	private String XPath;
	private String changedDate;
	private String createdDate;
	ArrayList < Installs > installs = new ArrayList < Installs > ();
	ArrayList < NotificationHeaders > notificationHeaders = new ArrayList < NotificationHeaders > ();


	public ArrayList<Installs> getInstalls() {
		return installs;
	}

	public void setInstalls(ArrayList<Installs> installs) {
		this.installs = installs;
	}

	public ArrayList<NotificationHeaders> getNotificationHeaders() {
		return notificationHeaders;
	}

	public void setNotificationHeaders(ArrayList<NotificationHeaders> notificationHeaders) {
		this.notificationHeaders = notificationHeaders;
	}

	public Units() {
		this.UnitID = UnitID;
		this.UnitCategory = UnitCategory;
	}
	// Getter Methods 

	public String getUnitID() {
		return UnitID;
	}

	public String getUnitCategory() {
		return UnitCategory;
	}

	public String getUnitType() {
		return UnitType;
	}

	public String getUnitDoorNumber() {
		return UnitDoorNumber;
	}

	public String getUnitFloorNumber() {
		return UnitFloorNumber;
	}

	public String getUnitSpecialNotes() {
		return UnitSpecialNotes;
	}

	public String getAuthorizationGroup() {
		return AuthorizationGroup;
	}

	public float getMaxOccupancy() {
		return MaxOccupancy;
	}

	public float getCurrentOccupancy() {
		return CurrentOccupancy;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public String getCreatedOn() {
		return CreatedOn;
	}

	public String getChangedByUser() {
		return ChangedByUser;
	}

	public String getChangedOn() {
		return ChangedOn;
	}

	public boolean getIsDeleted() {
		return IsDeleted;
	}

	public String getTags() {
		return Tags;
	}

	public boolean getIsSessionActive() {
		return IsSessionActive;
	}

	public boolean getIsBusinessActive() {
		return IsBusinessActive;
	}

	public boolean getIsNew() {
		return IsNew;
	}

	public boolean getIsChanged() {
		return IsChanged;
	}

	public boolean getIsVisible() {
		return IsVisible;
	}

	public boolean getIsReady() {
		return IsReady;
	}

	public boolean getIsDone() {
		return IsDone;
	}

	public boolean getIsTemp() {
		return IsTemp;
	}

	public boolean getIsFailed() {
		return IsFailed;
	}

	public boolean getIsEditable() {
		return IsEditable;
	}

	public boolean getIsRemoved() {
		return IsRemoved;
	}

	public boolean getValidateMe() {
		return ValidateMe;
	}

	public String getEntityInfo_1() {
		return EntityInfo_1;
	}

	public String getEntityInfo_2() {
		return EntityInfo_2;
	}

	public boolean getRefresh() {
		return Refresh;
	}

	public boolean getKeepScrollPosition() {
		return KeepScrollPosition;
	}

	public String getGridSearch() {
		return GridSearch;
	}

	public String getXPath() {
		return XPath;
	}

	public String getChangedDate() {
		return changedDate;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	// Setter Methods 

	public void setUnitID(String UnitID) {
		this.UnitID = UnitID;
	}

	public void setUnitCategory(String UnitCategory) {
		this.UnitCategory = UnitCategory;
	}

	public void setUnitType(String UnitType) {
		this.UnitType = UnitType;
	}

	public void setUnitDoorNumber(String UnitDoorNumber) {
		this.UnitDoorNumber = UnitDoorNumber;
	}

	public void setUnitFloorNumber(String UnitFloorNumber) {
		this.UnitFloorNumber = UnitFloorNumber;
	}

	public void setUnitSpecialNotes(String UnitSpecialNotes) {
		this.UnitSpecialNotes = UnitSpecialNotes;
	}

	public void setAuthorizationGroup(String AuthorizationGroup) {
		this.AuthorizationGroup = AuthorizationGroup;
	}

	public void setMaxOccupancy(float MaxOccupancy) {
		this.MaxOccupancy = MaxOccupancy;
	}

	public void setCurrentOccupancy(float CurrentOccupancy) {
		this.CurrentOccupancy = CurrentOccupancy;
	}

	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}

	public void setCreatedOn(String CreatedOn) {
		this.CreatedOn = CreatedOn;
	}

	public void setChangedByUser(String ChangedByUser) {
		this.ChangedByUser = ChangedByUser;
	}

	public void setChangedOn(String ChangedOn) {
		this.ChangedOn = ChangedOn;
	}

	public void setIsDeleted(boolean IsDeleted) {
		this.IsDeleted = IsDeleted;
	}

	public void setTags(String Tags) {
		this.Tags = Tags;
	}

	public void setIsSessionActive(boolean IsSessionActive) {
		this.IsSessionActive = IsSessionActive;
	}

	public void setIsBusinessActive(boolean IsBusinessActive) {
		this.IsBusinessActive = IsBusinessActive;
	}

	public void setIsNew(boolean IsNew) {
		this.IsNew = IsNew;
	}

	public void setIsChanged(boolean IsChanged) {
		this.IsChanged = IsChanged;
	}

	public void setIsVisible(boolean IsVisible) {
		this.IsVisible = IsVisible;
	}

	public void setIsReady(boolean IsReady) {
		this.IsReady = IsReady;
	}

	public void setIsDone(boolean IsDone) {
		this.IsDone = IsDone;
	}

	public void setIsTemp(boolean IsTemp) {
		this.IsTemp = IsTemp;
	}

	public void setIsFailed(boolean IsFailed) {
		this.IsFailed = IsFailed;
	}

	public void setIsEditable(boolean IsEditable) {
		this.IsEditable = IsEditable;
	}

	public void setIsRemoved(boolean IsRemoved) {
		this.IsRemoved = IsRemoved;
	}

	public void setValidateMe(boolean ValidateMe) {
		this.ValidateMe = ValidateMe;
	}

	public void setEntityInfo_1(String EntityInfo_1) {
		this.EntityInfo_1 = EntityInfo_1;
	}

	public void setEntityInfo_2(String EntityInfo_2) {
		this.EntityInfo_2 = EntityInfo_2;
	}

	public void setRefresh(boolean Refresh) {
		this.Refresh = Refresh;
	}

	public void setKeepScrollPosition(boolean KeepScrollPosition) {
		this.KeepScrollPosition = KeepScrollPosition;
	}

	public void setGridSearch(String GridSearch) {
		this.GridSearch = GridSearch;
	}

	public void setXPath(String XPath) {
		this.XPath = XPath;
	}

	public void setChangedDate(String changedDate) {
		this.changedDate = changedDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
}
