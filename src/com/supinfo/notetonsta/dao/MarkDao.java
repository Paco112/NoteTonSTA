package com.supinfo.notetonsta.dao;

import java.util.List;

import com.supinfo.notetonsta.entity.Mark;

public interface MarkDao {
	
	Mark addMark(Mark mark);
	Mark getMarkById(Long markId);
	List<Mark> getAllMarks();


}
