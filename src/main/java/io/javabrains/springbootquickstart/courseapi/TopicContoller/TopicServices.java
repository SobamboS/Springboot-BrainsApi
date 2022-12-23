package io.javabrains.springbootquickstart.courseapi.TopicContoller;


import io.javabrains.springbootquickstart.courseapi.TopicContoller.Topic;
import io.javabrains.springbootquickstart.courseapi.TopicContoller.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicServices{

    @Autowired
    private TopicRepository topicRepository;

   public List<Topic> getAllTopics(){
       List<Topic> topics = new ArrayList<>();
       topicRepository.findAll()
               .forEach(topics::add);
       return topics;
   }

   public Optional<Topic> getTopic(String id){
       return topicRepository.findById(id);
   }

    public void addTopic(Topic topic){
topicRepository.save(topic);
   }

    public void updateTopic(String id,Topic topic){
       topicRepository.save(topic);
    }

    public void deleteTopic(String id, Topic topic){
       topicRepository.delete(topic);

    }
}
