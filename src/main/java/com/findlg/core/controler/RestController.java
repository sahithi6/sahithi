package com.findlg.core.controler;


import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.findlg.core.model.Application;
import com.findlg.core.model.ChartContainer;
import com.findlg.core.model.Data;
import com.findlg.core.model.Title;
import com.findlg.core.model.datapoints;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/FINDLG")
public class RestController {

	@GetMapping(path = "/getJSON", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> doGetJson() {

		Application application = new Application();
		ChartContainer chartContainer = new ChartContainer();
		Title title = new Title();
		Data data = new Data();
		datapoints dataPoints01 = new datapoints();
		datapoints dataPoints02 = new datapoints();
		datapoints dataPoints03 = new datapoints();
		datapoints dataPoints04 = new datapoints();
		datapoints dataPoints05 = new datapoints();
		// Data datapoints[]=new Data();
		ArrayList<Data> al = new ArrayList<Data>();
		title.setText("Montly Expense");
		chartContainer.setTheme("light2");
		chartContainer.setAnimationEnabled(true);
		chartContainer.setExportEnabled(true);
		data.setType("pie");
		data.setShowInLegend(true);
		dataPoints01.setY(450);
		dataPoints01.setName("Food");
		dataPoints02.setY(120);
		dataPoints02.setName("Insurance");
		dataPoints03.setY(300);
		dataPoints03.setName("Traveling");
		dataPoints04.setY(800);
		dataPoints04.setName("Housing");
		dataPoints05.setY(150);
		dataPoints05.setName("Education");
		al.add(data);

		data.setDatapoints(new datapoints[] { dataPoints01, dataPoints02, dataPoints03, dataPoints04, dataPoints05 });
		chartContainer.setTitle(title);
		chartContainer.setData(al);
		application.setChartContainer(chartContainer);

		/*
		* ob.setAdd("Manjera trinity"); ob.setAge(28); ob.setName("Madhu");
		* ob.setPincode(500090);
		*/

		return new ResponseEntity<>(application, HttpStatus.OK);

	}
}