package com.project.trans.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.trans.Bean.Feedback;
import com.project.trans.Service.feedbackService;;

@RestController
public class feedbackController {
	
	@Autowired 
	private feedbackService feedbackService;
	
	@RequestMapping("/feedback/selectAllFeedback")
	public List<Feedback> selectAllFeedback(){
		return feedbackService.selectAllFeedback();
	}
	
	@RequestMapping("/feedback/search")
	public List<Feedback> selectFeedbackByUsernameAndContent(String userName,String feedbackContent){
		if (userName == null){
			userName=" ";
		}
		if (feedbackContent == null){
			feedbackContent=" ";
		}
		return feedbackService.selectFeedbackByUsernameAndContent(userName,feedbackContent);
	}
	
	@RequestMapping("/feedback/selectFeedbackById")
	@ModelAttribute("model")
	public Feedback selectFeedbackById(@RequestParam("id") int id,HttpServletRequest request) {
		return  feedbackService.selectFeedbackById(id);
	}
}
