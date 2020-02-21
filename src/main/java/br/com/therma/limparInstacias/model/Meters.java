package br.com.therma.limparInstacias.model;

import java.util.ArrayList;

public class Meters {
	private String MeterID;
	 private String MeterCategory;
	 private String MeterType;
	 private String NextMeterReadDate;
	 private String MeterMake;
	 private String MeterModel;
	 private String MeterSerialNumber;
	 private String CertificationDate;
	 private String NextReplacementDate;
	 private String PrimaryVoltage;
	 private String SecondaryVoltage;
	 private String WaterPressure;
	 private String GasPressure;
	 private String Tempurature;
	 private String CalibrationControl;
	 private String UnitOfMeasureControl;
	 private String ReadMultiplierControl;
	 private String ReadValidationControl;
	 private String BillingRateControl;
	 private String DialGroup;
	 private boolean Deleted;
	 private String Tags;
	 private float MeterNumberOfRegisters;
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
	 ArrayList < MeterReadings > meterReadings = new ArrayList < MeterReadings > ();
	 Installs InstallObject;


	 // Getter Methods 

	 public ArrayList<MeterReadings> getMeterReadings() {
		return meterReadings;
	}

	public void setMeterReadings(ArrayList<MeterReadings> meterReadings) {
		this.meterReadings = meterReadings;
	}

	public Installs getInstallObject() {
		return InstallObject;
	}

	public void setInstallObject(Installs installObject) {
		InstallObject = installObject;
	}

	public String getMeterID() {
	  return MeterID;
	 }

	 public String getMeterCategory() {
	  return MeterCategory;
	 }

	 public String getMeterType() {
	  return MeterType;
	 }

	 public String getNextMeterReadDate() {
	  return NextMeterReadDate;
	 }

	 public String getMeterMake() {
	  return MeterMake;
	 }

	 public String getMeterModel() {
	  return MeterModel;
	 }

	 public String getMeterSerialNumber() {
	  return MeterSerialNumber;
	 }

	 public String getCertificationDate() {
	  return CertificationDate;
	 }

	 public String getNextReplacementDate() {
	  return NextReplacementDate;
	 }

	 public String getPrimaryVoltage() {
	  return PrimaryVoltage;
	 }

	 public String getSecondaryVoltage() {
	  return SecondaryVoltage;
	 }

	 public String getWaterPressure() {
	  return WaterPressure;
	 }

	 public String getGasPressure() {
	  return GasPressure;
	 }

	 public String getTempurature() {
	  return Tempurature;
	 }

	 public String getCalibrationControl() {
	  return CalibrationControl;
	 }

	 public String getUnitOfMeasureControl() {
	  return UnitOfMeasureControl;
	 }

	 public String getReadMultiplierControl() {
	  return ReadMultiplierControl;
	 }

	 public String getReadValidationControl() {
	  return ReadValidationControl;
	 }

	 public String getBillingRateControl() {
	  return BillingRateControl;
	 }

	 public String getDialGroup() {
	  return DialGroup;
	 }

	 public boolean getDeleted() {
	  return Deleted;
	 }

	 public String getTags() {
	  return Tags;
	 }

	 public float getMeterNumberOfRegisters() {
	  return MeterNumberOfRegisters;
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

	 public Installs getInstall() {
	  return InstallObject;
	 }

	 // Setter Methods 

	 public void setMeterID(String MeterID) {
	  this.MeterID = MeterID;
	 }

	 public void setMeterCategory(String MeterCategory) {
	  this.MeterCategory = MeterCategory;
	 }

	 public void setMeterType(String MeterType) {
	  this.MeterType = MeterType;
	 }

	 public void setNextMeterReadDate(String NextMeterReadDate) {
	  this.NextMeterReadDate = NextMeterReadDate;
	 }

	 public void setMeterMake(String MeterMake) {
	  this.MeterMake = MeterMake;
	 }

	 public void setMeterModel(String MeterModel) {
	  this.MeterModel = MeterModel;
	 }

	 public void setMeterSerialNumber(String MeterSerialNumber) {
	  this.MeterSerialNumber = MeterSerialNumber;
	 }

	 public void setCertificationDate(String CertificationDate) {
	  this.CertificationDate = CertificationDate;
	 }

	 public void setNextReplacementDate(String NextReplacementDate) {
	  this.NextReplacementDate = NextReplacementDate;
	 }

	 public void setPrimaryVoltage(String PrimaryVoltage) {
	  this.PrimaryVoltage = PrimaryVoltage;
	 }

	 public void setSecondaryVoltage(String SecondaryVoltage) {
	  this.SecondaryVoltage = SecondaryVoltage;
	 }

	 public void setWaterPressure(String WaterPressure) {
	  this.WaterPressure = WaterPressure;
	 }

	 public void setGasPressure(String GasPressure) {
	  this.GasPressure = GasPressure;
	 }

	 public void setTempurature(String Tempurature) {
	  this.Tempurature = Tempurature;
	 }

	 public void setCalibrationControl(String CalibrationControl) {
	  this.CalibrationControl = CalibrationControl;
	 }

	 public void setUnitOfMeasureControl(String UnitOfMeasureControl) {
	  this.UnitOfMeasureControl = UnitOfMeasureControl;
	 }

	 public void setReadMultiplierControl(String ReadMultiplierControl) {
	  this.ReadMultiplierControl = ReadMultiplierControl;
	 }

	 public void setReadValidationControl(String ReadValidationControl) {
	  this.ReadValidationControl = ReadValidationControl;
	 }

	 public void setBillingRateControl(String BillingRateControl) {
	  this.BillingRateControl = BillingRateControl;
	 }

	 public void setDialGroup(String DialGroup) {
	  this.DialGroup = DialGroup;
	 }

	 public void setDeleted(boolean Deleted) {
	  this.Deleted = Deleted;
	 }

	 public void setTags(String Tags) {
	  this.Tags = Tags;
	 }

	 public void setMeterNumberOfRegisters(float MeterNumberOfRegisters) {
	  this.MeterNumberOfRegisters = MeterNumberOfRegisters;
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

	 public void setInstall(Installs InstallObject) {
	  this.InstallObject = InstallObject;
	 }

}
