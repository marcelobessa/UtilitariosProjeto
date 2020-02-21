package br.com.therma.limparInstacias.model;

import java.util.ArrayList;

public class StartAutoMainCall {
	 private String CASENR;
	 private String CCAT;
	 private String CURRPROC;
	 private float COUNT;
	 private float TotalPages;
	 private boolean RelatedCase;
	 private String AccountNo;
	 private String PremiseNo;
	 private boolean Paginated;
	 private boolean CaseHistory;
	 private String Search_CreatedDate_Start;
	 private String Search_CreatedDate_End;
	 private String Search_DueDate_Start;
	 private String Search_DueDate_End;
	 private boolean Search_Status_New;
	 private boolean Search_Status_InProcess;
	 private boolean Search_Status_Completed;
	 private boolean Search_Status_Canceled;
	 private boolean Search_Status_Confirmed;
	 private boolean Search_Priority_VeryLow;
	 private boolean Search_Priority_Low;
	 private boolean Search_Priority_Average;
	 private boolean Search_Priority_High;
	 private boolean Search_Priority_VeryHigh;
	 private String Tab;
	 private String MassProcessing_Processor;
	 private String MassProcessing_ForwardReason;
	 private String MassProcessing_Status;
	 private float ProgressBarIndicator;
	 private float PageNumber;
	 private boolean IsSortable;
	 private String SortAttribute;
	 private boolean SortAscending;
	 private boolean HasMoreData;
	 ArrayList < Search_CaseCats > search_CaseCats = new ArrayList < Search_CaseCats > ();
	 
	public String getCASENR() {
		return CASENR;
	}
	public void setCASENR(String cASENR) {
		CASENR = cASENR;
	}
	public String getCCAT() {
		return CCAT;
	}
	public void setCCAT(String cCAT) {
		CCAT = cCAT;
	}
	public String getCURRPROC() {
		return CURRPROC;
	}
	public void setCURRPROC(String cURRPROC) {
		CURRPROC = cURRPROC;
	}
	public float getCOUNT() {
		return COUNT;
	}
	public void setCOUNT(float cOUNT) {
		COUNT = cOUNT;
	}
	public float getTotalPages() {
		return TotalPages;
	}
	public void setTotalPages(float totalPages) {
		TotalPages = totalPages;
	}
	public boolean isRelatedCase() {
		return RelatedCase;
	}
	public void setRelatedCase(boolean relatedCase) {
		RelatedCase = relatedCase;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public String getPremiseNo() {
		return PremiseNo;
	}
	public void setPremiseNo(String premiseNo) {
		PremiseNo = premiseNo;
	}
	public boolean isPaginated() {
		return Paginated;
	}
	public void setPaginated(boolean paginated) {
		Paginated = paginated;
	}
	public boolean isCaseHistory() {
		return CaseHistory;
	}
	public void setCaseHistory(boolean caseHistory) {
		CaseHistory = caseHistory;
	}
	public String getSearch_CreatedDate_Start() {
		return Search_CreatedDate_Start;
	}
	public void setSearch_CreatedDate_Start(String search_CreatedDate_Start) {
		Search_CreatedDate_Start = search_CreatedDate_Start;
	}
	public String getSearch_CreatedDate_End() {
		return Search_CreatedDate_End;
	}
	public void setSearch_CreatedDate_End(String search_CreatedDate_End) {
		Search_CreatedDate_End = search_CreatedDate_End;
	}
	public String getSearch_DueDate_Start() {
		return Search_DueDate_Start;
	}
	public void setSearch_DueDate_Start(String search_DueDate_Start) {
		Search_DueDate_Start = search_DueDate_Start;
	}
	public String getSearch_DueDate_End() {
		return Search_DueDate_End;
	}
	public void setSearch_DueDate_End(String search_DueDate_End) {
		Search_DueDate_End = search_DueDate_End;
	}
	public boolean isSearch_Status_New() {
		return Search_Status_New;
	}
	public void setSearch_Status_New(boolean search_Status_New) {
		Search_Status_New = search_Status_New;
	}
	public boolean isSearch_Status_InProcess() {
		return Search_Status_InProcess;
	}
	public void setSearch_Status_InProcess(boolean search_Status_InProcess) {
		Search_Status_InProcess = search_Status_InProcess;
	}
	public boolean isSearch_Status_Completed() {
		return Search_Status_Completed;
	}
	public void setSearch_Status_Completed(boolean search_Status_Completed) {
		Search_Status_Completed = search_Status_Completed;
	}
	public boolean isSearch_Status_Canceled() {
		return Search_Status_Canceled;
	}
	public void setSearch_Status_Canceled(boolean search_Status_Canceled) {
		Search_Status_Canceled = search_Status_Canceled;
	}
	public boolean isSearch_Status_Confirmed() {
		return Search_Status_Confirmed;
	}
	public void setSearch_Status_Confirmed(boolean search_Status_Confirmed) {
		Search_Status_Confirmed = search_Status_Confirmed;
	}
	public boolean isSearch_Priority_VeryLow() {
		return Search_Priority_VeryLow;
	}
	public void setSearch_Priority_VeryLow(boolean search_Priority_VeryLow) {
		Search_Priority_VeryLow = search_Priority_VeryLow;
	}
	public boolean isSearch_Priority_Low() {
		return Search_Priority_Low;
	}
	public void setSearch_Priority_Low(boolean search_Priority_Low) {
		Search_Priority_Low = search_Priority_Low;
	}
	public boolean isSearch_Priority_Average() {
		return Search_Priority_Average;
	}
	public void setSearch_Priority_Average(boolean search_Priority_Average) {
		Search_Priority_Average = search_Priority_Average;
	}
	public boolean isSearch_Priority_High() {
		return Search_Priority_High;
	}
	public void setSearch_Priority_High(boolean search_Priority_High) {
		Search_Priority_High = search_Priority_High;
	}
	public boolean isSearch_Priority_VeryHigh() {
		return Search_Priority_VeryHigh;
	}
	public void setSearch_Priority_VeryHigh(boolean search_Priority_VeryHigh) {
		Search_Priority_VeryHigh = search_Priority_VeryHigh;
	}
	public String getTab() {
		return Tab;
	}
	public void setTab(String tab) {
		Tab = tab;
	}
	public String getMassProcessing_Processor() {
		return MassProcessing_Processor;
	}
	public void setMassProcessing_Processor(String massProcessing_Processor) {
		MassProcessing_Processor = massProcessing_Processor;
	}
	public String getMassProcessing_ForwardReason() {
		return MassProcessing_ForwardReason;
	}
	public void setMassProcessing_ForwardReason(String massProcessing_ForwardReason) {
		MassProcessing_ForwardReason = massProcessing_ForwardReason;
	}
	public String getMassProcessing_Status() {
		return MassProcessing_Status;
	}
	public void setMassProcessing_Status(String massProcessing_Status) {
		MassProcessing_Status = massProcessing_Status;
	}
	public float getProgressBarIndicator() {
		return ProgressBarIndicator;
	}
	public void setProgressBarIndicator(float progressBarIndicator) {
		ProgressBarIndicator = progressBarIndicator;
	}
	public float getPageNumber() {
		return PageNumber;
	}
	public void setPageNumber(float pageNumber) {
		PageNumber = pageNumber;
	}
	public boolean isIsSortable() {
		return IsSortable;
	}
	public void setIsSortable(boolean isSortable) {
		IsSortable = isSortable;
	}
	public String getSortAttribute() {
		return SortAttribute;
	}
	public void setSortAttribute(String sortAttribute) {
		SortAttribute = sortAttribute;
	}
	public boolean isSortAscending() {
		return SortAscending;
	}
	public void setSortAscending(boolean sortAscending) {
		SortAscending = sortAscending;
	}
	public boolean isHasMoreData() {
		return HasMoreData;
	}
	public void setHasMoreData(boolean hasMoreData) {
		HasMoreData = hasMoreData;
	}
	public ArrayList<Search_CaseCats> getSearch_CaseCats() {
		return search_CaseCats;
	}
	public void setSearch_CaseCats(ArrayList<Search_CaseCats> search_CaseCats) {
		this.search_CaseCats = search_CaseCats;
	}
	 
	 
}
