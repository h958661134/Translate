package com.project.trans.Service;

import java.util.List;

import com.project.trans.Bean.Feedback;

public interface feedbackService {
	public List<Feedback> selectAllFeedback();
	public List<Feedback> selectFeedbackByUsernameAndContent(String userName, String feedbackContent);
	public Feedback selectFeedbackById(int id);
}
