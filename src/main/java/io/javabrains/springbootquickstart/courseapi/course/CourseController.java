package io.javabrains.springbootquickstart.courseapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController{
    @Autowired
    private CourseServices courseService;
    @RequestMapping ("/topics/{id}/courses")
    public List<Course> getAllCourse(@PathVariable String id){
        return courseService.getAllCourse();
    }
    @RequestMapping("/topics/{topicId}/course/{Id}")
    public Optional<Course> getCourse(@PathVariable String id){

        return courseService.getCourse(id);
    }
    @RequestMapping(method=RequestMethod.POST, value="/post-topics")
    public void addCourse(@RequestBody Course topic){

        courseService.addCourse(topic);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/post-topics/{id}")
    public void updateCourse(@RequestBody Course topic,@PathVariable String id){
        courseService.updateCourse(id, topic);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/post-topics/{id}")
    public void deleteCourse(@PathVariable String id, @RequestBody Course topic){
         courseService.deleteCourse(id, topic);
    }
}
