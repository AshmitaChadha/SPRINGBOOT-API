package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
 
	public List<Course> getCourses();
	
	public Course getCourse(long CourseId);
	
	public Course addCourse(Course Course);
	
	public Course updateCourse(Course Course);
	
	public void deleteCourse(long parseLong);
}
