package com.example.demoApps.component;


import com.example.demoApps.model.ApplyFormModel;
import com.example.demoApps.model.ErrorModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


@Controller
@Component
public class Emailcomponent {

	public List<ErrorModel> ValidateApplyForm(ApplyFormModel applyFormModel)
	{
		ApplyFormModel a= new ApplyFormModel();
		List<ErrorModel> error = new ArrayList<>();

		if(StringUtils.isEmpty(applyFormModel.getFirstName()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid first name");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getLastName()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid last name");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getEmail()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid Email ");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getPhone()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid phone");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getPosition()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid position");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getLevelOfEduction()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid level of eduction");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getSchool()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid school name");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getCourse()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid course");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getCompletedEducation()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid completed eduction");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getCompanyName1()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid company1 name");
			error.add(e);
		}
		if(StringUtils.isEmpty(applyFormModel.getWorkTime1()))
		{
			ErrorModel e= new ErrorModel();
			e.setCode("001");
			e.setDescription("invalid company1 work time1");
			error.add(e);
		}


		return error;
	}
}
