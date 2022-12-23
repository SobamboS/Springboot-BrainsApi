package io.javabrains.springbootquickstart.courseapi.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServices{

    @Autowired
    private CourseRepository courseRepository;

   public List<Course> getAllCourse(){
       List<Course> topics = new ArrayList<>();
       courseRepository.findAll()
               .forEach(topics::add);
       return topics;
   }

   public Optional<Course> getCourse(String id){
       return courseRepository.findById(id);
   }

    public void addCourse(Course topic){
courseRepository.save(topic);
   }

    public void updateCourse(String id,Course topic){
       courseRepository.save(topic);
    }

    public void deleteCourse(String id, Course topic){
       courseRepository.delete(topic);

    }
}
