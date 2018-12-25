package com.project.trans.Mapper;

import java.util.List;

import com.project.trans.Bean.Feedback;
import org.apache.ibatis.annotations.Param;

public interface feedbackmapper {
	public List<Feedback> selectAllFeedback();
	public List<Feedback> selectFeedbackByUsernameAndContent(@Param("userName") String userName,@Param("feedbackContent") String feedbackContent);
	public Feedback selectFeedbackById(int id);
}
