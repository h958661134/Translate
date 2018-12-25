package com.project.trans.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.trans.Bean.Feedback;
import com.project.trans.Mapper.*;
import com.project.trans.Service.feedbackService;

import javax.annotation.Resource;

@Service
public class feedbackServiceImpl implements feedbackService {

	@Resource
	private feedbackmapper feedbackmapper;
	
	@Override
	public List<Feedback> selectAllFeedback() {
		// TODO Auto-generated method stub
		return feedbackmapper.selectAllFeedback();
	}

	@Override
	public List<Feedback> selectFeedbackByUsernameAndContent(String userName,String feedbackContent) {
		// TODO Auto-generated method stub
		return feedbackmapper.selectFeedbackByUsernameAndContent(userName,feedbackContent);
	}

	@Override
	public Feedback selectFeedbackById(int id) {
		// TODO Auto-generated method stub
		return feedbackmapper.selectFeedbackById(id);
	}

}
