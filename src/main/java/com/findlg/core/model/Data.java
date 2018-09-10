package com.findlg.core.model;

public class Data {

	private String type;
	private boolean showInLegend;
	private datapoints[] datapoints;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isShowInLegend() {
		return showInLegend;
	}
	public void setShowInLegend(boolean showInLegend) {
		this.showInLegend = showInLegend;
	}
	public datapoints[] getDatapoints() {
		return datapoints;
	}
	public void setDatapoints(datapoints[] datapoints) {
		this.datapoints = datapoints;
	}
	
	
	
}