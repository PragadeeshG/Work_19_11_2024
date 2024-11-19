package com.test1;

public class AugumentationLearningMapper {
	private Integer dataLearningCode;
	private Integer augumentationLearningId;
	private Integer skillsCount;
	private String values;
	private Integer attitudes;
	private boolean augumentationLearningMappedToReport;
	private boolean isActive;
	private String preferences;
	private String trialAndError;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AugumentationLearningMapper() {

	}

	public AugumentationLearningMapper(Integer dataLearningCode, Integer augumentationLearningId, Integer skillsCount,
			String values, Integer attitudes, boolean augumentationLearningMappedToReport, boolean isActive,
			String preferences, String trialAndError, String creationCr, String modifiedCr, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.dataLearningCode = dataLearningCode;
		this.augumentationLearningId = augumentationLearningId;
		this.skillsCount = skillsCount;
		this.values = values;
		this.attitudes = attitudes;
		this.augumentationLearningMappedToReport = augumentationLearningMappedToReport;
		this.isActive = isActive;
		this.preferences = preferences;
		this.trialAndError = trialAndError;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getDataLearningCode() {
		return dataLearningCode;
	}

	public void setDataLearningCode(Integer dataLearningCode) {
		this.dataLearningCode = dataLearningCode;
	}

	public Integer getAugumentationLearningId() {
		return augumentationLearningId;
	}

	public void setAugumentationLearningId(Integer augumentationLearningId) {
		this.augumentationLearningId = augumentationLearningId;
	}

	public Integer getSkillsCount() {
		return skillsCount;
	}

	public void setSkillsCount(Integer skillsCount) {
		this.skillsCount = skillsCount;
	}

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}

	public Integer getAttitudes() {
		return attitudes;
	}

	public void setAttitudes(Integer attitudes) {
		this.attitudes = attitudes;
	}

	public boolean isAugumentationLearningMappedToReport() {
		return augumentationLearningMappedToReport;
	}

	public void setAugumentationLearningMappedToReport(boolean augumentationLearningMappedToReport) {
		this.augumentationLearningMappedToReport = augumentationLearningMappedToReport;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getTrialAndError() {
		return trialAndError;
	}

	public void setTrialAndError(String trialAndError) {
		this.trialAndError = trialAndError;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
