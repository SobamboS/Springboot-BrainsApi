package io.javabrains.springbootquickstart.courseapi.TopicContoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class TopicController{
    @Autowired
    private TopicServices topicServices;
    @RequestMapping ("/topics")
    public List<Topic> getAllTopics(){
        return topicServices.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicServices.getTopic(id);
    }
    @RequestMapping(method=RequestMethod.POST, value="/post-topics")
    public void addTopic(@RequestBody Topic topic){
        topicServices.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/post-topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicServices.updateTopic(id, topic);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/post-topics/{id}")
    public void deleteTopic(@PathVariable String id, @RequestBody Topic topic){
         topicServices.deleteTopic(id, topic);
    }
}
