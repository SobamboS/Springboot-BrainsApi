package io.javabrains.springbootquickstart.courseapi.TopicController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController{

    @RequestMapping ("/topics")
    public List<Topics> getAllTopics(){
        return Arrays.asList(
                new Topics("Java", "Spring Framework", "Spring Framework Description"),
                new Topics("Python", "Django Framework", "Django Framework Description"),
                new Topics("Javascript", "React Framework", "React Framework Description")
        );
    }

}
