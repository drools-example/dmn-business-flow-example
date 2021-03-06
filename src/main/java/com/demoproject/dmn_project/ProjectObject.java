package com.demoproject.dmn_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProjectObject implements java.io.Serializable {
    
    static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "forecast")
	private java.lang.String forecast;
	@org.kie.api.definition.type.Label(value = "stage")
	private java.lang.String stage;
	@org.kie.api.definition.type.Label(value = "startDate")
	private java.lang.String startDate;
	@org.kie.api.definition.type.Label(value = "endDate")
	private java.lang.String endDate;

	public ProjectObject() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getForecast() {
		return this.forecast;
	}

	public void setForecast(java.lang.String forecast) {
		this.forecast = forecast;
	}

	public java.lang.String getStage() {
		return this.stage;
	}

	public void setStage(java.lang.String stage) {
		this.stage = stage;
	}

	public java.lang.String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.lang.String startDate) {
		this.startDate = startDate;
	}

	public java.lang.String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(java.lang.String endDate) {
		this.endDate = endDate;
	}

	public ProjectObject(java.lang.String name, java.lang.String forecast,
			java.lang.String stage, java.lang.String startDate,
			java.lang.String endDate) {
		this.name = name;
		this.forecast = forecast;
		this.stage = stage;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	@Override
    public String toString() {
        return "ProjectObject{" +
                "name='" + name + '\'' +
                ", forecast=" + forecast +
                ", stage='" + stage + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

}