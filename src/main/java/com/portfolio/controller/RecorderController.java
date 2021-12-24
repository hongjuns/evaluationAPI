package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.config.BaseController;
import com.portfolio.model.RecorderModel;
import com.portfolio.service.RecorderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "RecorderController", description = "Recorder-Controller")
public class RecorderController extends BaseController {

	@Autowired
	private RecorderService recorderService;
	
	@RequestMapping(value="/check/recorder", method=RequestMethod.GET)
	public int recorderList (HttpServletRequest request, HttpServletResponse response,RecorderModel recorderModel) {
		/*
		if (logger.isDebugEnabled()) {
			logger.debug("recorderList");
		}
		*/
		logger.info("recorderList");
		return recorderService.checkRecorder(recorderModel);
	}
}
