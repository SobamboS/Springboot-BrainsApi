package io.javabrains.springbootquickstart.courseapi.TopicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class TopicController{
    @Autowired
    private TopicServices topicServices;
    @RequestMapping ("/topics")
    public List<Topic> getAllTopics(){
        return topicServices.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicServices.getTopic(id);
    }
    @RequestMapping(method=RequestMethod.POST, value="/post-topics")
    public void addTopics(@RequestBody Topic topic){
        topicServices.addTopics(topic);
    }
}
