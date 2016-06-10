package controllers;

import java.util.List;

import models.first.SampleTable1;
import models.second.SampleTable2;
import play.mvc.Controller;
import play.mvc.Result;

public class CheckFind extends Controller {

	public Result setS1(String str){

		SampleTable1 s = new SampleTable1();
		s.sampleTable1Value = str;
		s.save();

		return getS1(String.format("[Info] (%s) save success.\n\n", str));
	}

	public Result getS1(String message){
		List<SampleTable1> sList = SampleTable1.find.where().findList();

		StringBuffer sb = new StringBuffer(message);
		if(sList.size() == 0){
			sb.append("table is empty...");
		}

		for(SampleTable1 s : sList){
			sb.append(String.format("id: %3d (%s)\n", s.sampleTable1Id, s.sampleTable1Value));
		}

		return ok(sb.toString());
	}

	public Result setS2(String str){

		SampleTable2 s = new SampleTable2();
		s.sampleTable2Value = str;
		s.save();

		return getS2(String.format("[Info] (%s) save success.\n\n", str));
	}

	public Result getS2(String message){
		List<SampleTable2> sList = SampleTable2.find.where().findList();

		StringBuffer sb = new StringBuffer(message);
		if(sList.size() == 0){
			sb.append("table is empty...");
		}

		for(SampleTable2 s : sList){
			sb.append(String.format("id: %3d (%s)\n", s.sampleTable2Id, s.sampleTable2Value));
		}

		return ok(sb.toString());
	}}
