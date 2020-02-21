package br.com.therma.limparInstacias.model;

import java.util.ArrayList;

public class Services {
	private String ServiceID;
	private String ServiceClass;
	private String ServiceCategory;
	private String ServiceType;
	private String ServiceProvider;
	private String ServiceLevel;
	private String ServiceRate;
	private String ServiceStatus;
	private String ServiceSupplyGuarantee;
	private String ServiceNotes;
	private String OrgUnit;
	private String AuthorizationGroup;
	private String ReleaseConsent;
	private String BillingClass;
	private String MRU;
	private String BillingCycle;
	private String LastBillDate;
	private String MRBlockReason;
	private String Division;
	private String DisconnectionStatus;
	private String DisconnectionReason;
	private String DiconnectionDateValidFrom;
	private String ValidFrom;
	private String ValidTo;
	private String CreatedBy;
	private String CreatedOn;
	private String ChangdBy;
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
	ServiceAgreement ServiceAgreementObject;
	ArrayList < ServiceFactss > serviceFactss = new ArrayList < ServiceFactss > ();


	// Getter Methods 

	public ServiceAgreement getServiceAgreementObject() {
		return ServiceAgreementObject;
	}

	public void setServiceAgreementObject(ServiceAgreement serviceAgreementObject) {
		ServiceAgreementObject = serviceAgreementObject;
	}

	public ArrayList<ServiceFactss> getServiceFactss() {
		return serviceFactss;
	}

	public void setServiceFactss(ArrayList<ServiceFactss> serviceFactss) {
		this.serviceFactss = serviceFactss;
	}

	public String getServiceID() {
		return ServiceID;
	}

	public String getServiceClass() {
		return ServiceClass;
	}

	public String getServiceCategory() {
		return ServiceCategory;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public String getServiceProvider() {
		return ServiceProvider;
	}

	public String getServiceLevel() {
		return ServiceLevel;
	}

	public String getServiceRate() {
		return ServiceRate;
	}

	public String getServiceStatus() {
		return ServiceStatus;
	}

	public String getServiceSupplyGuarantee() {
		return ServiceSupplyGuarantee;
	}

	public String getServiceNotes() {
		return ServiceNotes;
	}

	public String getOrgUnit() {
		return OrgUnit;
	}

	public String getAuthorizationGroup() {
		return AuthorizationGroup;
	}

	public String getReleaseConsent() {
		return ReleaseConsent;
	}

	public String getBillingClass() {
		return BillingClass;
	}

	public String getMRU() {
		return MRU;
	}

	public String getBillingCycle() {
		return BillingCycle;
	}

	public String getLastBillDate() {
		return LastBillDate;
	}

	public String getMRBlockReason() {
		return MRBlockReason;
	}

	public String getDivision() {
		return Division;
	}

	public String getDisconnectionStatus() {
		return DisconnectionStatus;
	}

	public String getDisconnectionReason() {
		return DisconnectionReason;
	}

	public String getDiconnectionDateValidFrom() {
		return DiconnectionDateValidFrom;
	}

	public String getValidFrom() {
		return ValidFrom;
	}

	public String getValidTo() {
		return ValidTo;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public String getCreatedOn() {
		return CreatedOn;
	}

	public String getChangdBy() {
		return ChangdBy;
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

	public ServiceAgreement getServiceAgreement() {
		return ServiceAgreementObject;
	}

	// Setter Methods 

	public void setServiceID(String ServiceID) {
		this.ServiceID = ServiceID;
	}

	public void setServiceClass(String ServiceClass) {
		this.ServiceClass = ServiceClass;
	}

	public void setServiceCategory(String ServiceCategory) {
		this.ServiceCategory = ServiceCategory;
	}

	public void setServiceType(String ServiceType) {
		this.ServiceType = ServiceType;
	}

	public void setServiceProvider(String ServiceProvider) {
		this.ServiceProvider = ServiceProvider;
	}

	public void setServiceLevel(String ServiceLevel) {
		this.ServiceLevel = ServiceLevel;
	}

	public void setServiceRate(String ServiceRate) {
		this.ServiceRate = ServiceRate;
	}

	public void setServiceStatus(String ServiceStatus) {
		this.ServiceStatus = ServiceStatus;
	}

	public void setServiceSupplyGuarantee(String ServiceSupplyGuarantee) {
		this.ServiceSupplyGuarantee = ServiceSupplyGuarantee;
	}

	public void setServiceNotes(String ServiceNotes) {
		this.ServiceNotes = ServiceNotes;
	}

	public void setOrgUnit(String OrgUnit) {
		this.OrgUnit = OrgUnit;
	}

	public void setAuthorizationGroup(String AuthorizationGroup) {
		this.AuthorizationGroup = AuthorizationGroup;
	}

	public void setReleaseConsent(String ReleaseConsent) {
		this.ReleaseConsent = ReleaseConsent;
	}

	public void setBillingClass(String BillingClass) {
		this.BillingClass = BillingClass;
	}

	public void setMRU(String MRU) {
		this.MRU = MRU;
	}

	public void setBillingCycle(String BillingCycle) {
		this.BillingCycle = BillingCycle;
	}

	public void setLastBillDate(String LastBillDate) {
		this.LastBillDate = LastBillDate;
	}

	public void setMRBlockReason(String MRBlockReason) {
		this.MRBlockReason = MRBlockReason;
	}

	public void setDivision(String Division) {
		this.Division = Division;
	}

	public void setDisconnectionStatus(String DisconnectionStatus) {
		this.DisconnectionStatus = DisconnectionStatus;
	}

	public void setDisconnectionReason(String DisconnectionReason) {
		this.DisconnectionReason = DisconnectionReason;
	}

	public void setDiconnectionDateValidFrom(String DiconnectionDateValidFrom) {
		this.DiconnectionDateValidFrom = DiconnectionDateValidFrom;
	}

	public void setValidFrom(String ValidFrom) {
		this.ValidFrom = ValidFrom;
	}

	public void setValidTo(String ValidTo) {
		this.ValidTo = ValidTo;
	}

	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}

	public void setCreatedOn(String CreatedOn) {
		this.CreatedOn = CreatedOn;
	}

	public void setChangdBy(String ChangdBy) {
		this.ChangdBy = ChangdBy;
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

	public void setServiceAgreement(ServiceAgreement ServiceAgreementObject) {
		this.ServiceAgreementObject = ServiceAgreementObject;
	}

}
