package io.javabrains.springbootquickstart.courseapi.TopicController;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicServices{


   private List<Topic> topics=  new ArrayList<>(Arrays.asList(
                new Topic("Java", "Spring Framework", "Spring Framework Description"),
                new Topic("Python", "Django Framework", "Django Framework Description"),
                new Topic("Javascript", "React Framework", "React Framework Description")
        ));

   public List<Topic> getAllTopics(){
       return topics;
   }

   public Topic getTopic(String id){
     return topics.stream().filter(t->t.getId
             ().equals(id)).findFirst().get();
   }

    public void addTopic(Topic topic){
       topics.add(topic);
    }

    public void updateTopic(String id,Topic topic){
       for(int i =0; i <topics.size(); i++){
           Topic t = topics.get(i);
           if(t.getId().equals(id)){
               topics.set(i, topic);
               return;
           }
       }
    }

    public void deleteTopic(String id){
     topics.removeIf(t -> t.getId().equals(id));
    }
}
