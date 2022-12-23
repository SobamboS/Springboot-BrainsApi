package io.javabrains.springbootquickstart.courseapi.TopicContoller;

import io.javabrains.springbootquickstart.courseapi.TopicContoller.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{


}
