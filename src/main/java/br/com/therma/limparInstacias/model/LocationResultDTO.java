package br.com.therma.limparInstacias.model;

import java.util.ArrayList;
import java.util.List;

public class LocationResultDTO {

	private String LocationID;
	private String LocationCategory;
	private String LocationType;
	private String LocationArea;
	private String LocalGroup;
	private String RegionalGroup;
	private String FullServiceAddress;
	private String ValidFrom;
	private String ValidTo;
	private String Name1;
	private String Name2;
	private String Name3;
	private String Name4;
	private String HouseNo;
	private String POBox;
	private String Street;
	private String City;
	private String State;
	private String PostalCode;
	private String Country;
	private String Latitude;
	private String Longitude;
	private String Language;
	private String AddressNumber;
	private String TapID;
	private boolean Deleted;
	private String Tags;
	private String Extension;
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
	List < Units > Units = new ArrayList < Units > ();
	List < Meters > Meters = new ArrayList < Meters > ();
	List < WorkOrders > WorkOrders = new ArrayList < WorkOrders > ();
	List < Bills > Bills = new ArrayList < Bills > ();
	
	


	// Getter Methods 

	public List<Units> getUnits() {
		return Units;
	}

	public void setUnits(List<Units> units) {
		Units = units;
	}

	public List<Meters> getMeters() {
		return Meters;
	}

	public void setMeters(List<Meters> meters) {
		Meters = meters;
	}

	public List<WorkOrders> getWorkOrders() {
		return WorkOrders;
	}

	public void setWorkOrders(List<WorkOrders> workOrders) {
		WorkOrders = workOrders;
	}

	public List<Bills> getBills() {
		return Bills;
	}

	public void setBills(List<Bills> bills) {
		Bills = bills;
	}

	public String getLocationID() {
		return LocationID;
	}

	public String getLocationCategory() {
		return LocationCategory;
	}

	public String getLocationType() {
		return LocationType;
	}

	public String getLocationArea() {
		return LocationArea;
	}

	public String getLocalGroup() {
		return LocalGroup;
	}

	public String getRegionalGroup() {
		return RegionalGroup;
	}

	public String getFullServiceAddress() {
		return FullServiceAddress;
	}

	public String getValidFrom() {
		return ValidFrom;
	}

	public String getValidTo() {
		return ValidTo;
	}

	public String getName1() {
		return Name1;
	}

	public String getName2() {
		return Name2;
	}

	public String getName3() {
		return Name3;
	}

	public String getName4() {
		return Name4;
	}

	public String getHouseNo() {
		return HouseNo;
	}

	public String getPOBox() {
		return POBox;
	}

	public String getStreet() {
		return Street;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public String getCountry() {
		return Country;
	}

	public String getLatitude() {
		return Latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public String getLanguage() {
		return Language;
	}

	public String getAddressNumber() {
		return AddressNumber;
	}

	public String getTapID() {
		return TapID;
	}

	public boolean getDeleted() {
		return Deleted;
	}

	public String getTags() {
		return Tags;
	}

	public String getExtension() {
		return Extension;
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

	public void setLocationID(String LocationID) {
		this.LocationID = LocationID;
	}

	public void setLocationCategory(String LocationCategory) {
		this.LocationCategory = LocationCategory;
	}

	public void setLocationType(String LocationType) {
		this.LocationType = LocationType;
	}

	public void setLocationArea(String LocationArea) {
		this.LocationArea = LocationArea;
	}

	public void setLocalGroup(String LocalGroup) {
		this.LocalGroup = LocalGroup;
	}

	public void setRegionalGroup(String RegionalGroup) {
		this.RegionalGroup = RegionalGroup;
	}

	public void setFullServiceAddress(String FullServiceAddress) {
		this.FullServiceAddress = FullServiceAddress;
	}

	public void setValidFrom(String ValidFrom) {
		this.ValidFrom = ValidFrom;
	}

	public void setValidTo(String ValidTo) {
		this.ValidTo = ValidTo;
	}

	public void setName1(String Name1) {
		this.Name1 = Name1;
	}

	public void setName2(String Name2) {
		this.Name2 = Name2;
	}

	public void setName3(String Name3) {
		this.Name3 = Name3;
	}

	public void setName4(String Name4) {
		this.Name4 = Name4;
	}

	public void setHouseNo(String HouseNo) {
		this.HouseNo = HouseNo;
	}

	public void setPOBox(String POBox) {
		this.POBox = POBox;
	}

	public void setStreet(String Street) {
		this.Street = Street;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setLatitude(String Latitude) {
		this.Latitude = Latitude;
	}

	public void setLongitude(String Longitude) {
		this.Longitude = Longitude;
	}

	public void setLanguage(String Language) {
		this.Language = Language;
	}

	public void setAddressNumber(String AddressNumber) {
		this.AddressNumber = AddressNumber;
	}

	public void setTapID(String TapID) {
		this.TapID = TapID;
	}

	public void setDeleted(boolean Deleted) {
		this.Deleted = Deleted;
	}

	public void setTags(String Tags) {
		this.Tags = Tags;
	}

	public void setExtension(String Extension) {
		this.Extension = Extension;
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