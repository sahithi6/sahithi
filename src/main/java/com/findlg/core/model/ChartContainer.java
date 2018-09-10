package com.findlg.core.model;

import java.util.ArrayList;

public class ChartContainer {
	private String theme;
	private boolean animationEnabled;
	private boolean exportEnabled;
//	Title TitleObject;
	private Title title;
	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	ArrayList<Data> data = new ArrayList<Data>();

	// Getter Methods

	public String getTheme() {
		return theme;
	}

	public boolean getAnimationEnabled() {
		return animationEnabled;
	}

//	public Title getTitleObject() {
//		return TitleObject;
//	}
//
//	public void setTitleObject(Title titleObject) {
//		TitleObject = titleObject;
//	}

	public ArrayList<Data> getData() {
		return data;
	}

	public void setData(ArrayList<Data> data) {
		this.data = data;
	}

	public boolean getExportEnabled() {
		return exportEnabled;
	}

//	public Title getTitle() {
//		return TitleObject;
//	}

	// Setter Methods

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setAnimationEnabled(boolean animationEnabled) {
		this.animationEnabled = animationEnabled;
	}

	public void setExportEnabled(boolean exportEnabled) {
		this.exportEnabled = exportEnabled;
	}

//	public void setTitle(Title titleObject) {
//		this.TitleObject = titleObject;
//	}
}