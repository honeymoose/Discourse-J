package com.ossez.discourse.client.test;

import com.google.inject.Inject;
import com.ossez.discourse.client.service.TopicsService;
import com.ossez.discourse.common.exception.DiscourseErrorException;
import com.ossez.discourse.common.model.dto.Topic;
import com.ossez.discourse.common.model.dto.TopicCreation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test for datacube API
 *
 * @author YuCheng
 */
@TestInstance(Lifecycle.PER_CLASS)
public class TopicServiceTest extends TestBase {
    private static final Logger log = LoggerFactory.getLogger(TopicServiceTest.class);
    @Inject
    protected TopicsService topicsService;

    /**
     * Test Create Menu
     *
     * @throws DiscourseErrorException
     */
    @Test
    public void testGetTopic() throws DiscourseErrorException {
        log.debug("Create WeChat Offical Account Menun Test");
        Optional<Topic> topic = topicsService.getTopic(DISCOURSE_TOPIC_ID);
        assertThat(topic).isNotEmpty();

        assertThat(topic.get().getPostStream().getPosts().size()).isGreaterThan(0);
        assertThat(topic.get().getPostStream().getPosts().get(0).getId()).isEqualTo(DISCOURSE_POST_ID);
        assertThat(topic.get().getId()).isEqualTo(DISCOURSE_TOPIC_ID);
        assertThat(topic.get().getTitle()).isNotEmpty();
        log.debug("{}", topic.get().getTitle());


    }

    @Test
    public void testCreateTopic() throws DiscourseErrorException {
//        log.debug("Create Discourse Topic for Testing");
//        TopicCreation topicCreation = new TopicCreation();
//        topicCreation.setTitle(DISCOURSE_TOPIC_TITLE_CREATE);
//        topicCreation.setCategory(3);
//        topicCreation.setRaw(DISCOURSE_TOPIC_TITLE_CREATE);
//
//        Optional<Topic> topic = topicsService.createTopic(topicCreation);
//        assertThat(topic).isNotEmpty();
//
//        log.debug("Created Topic Id - [{}]", topic.get().getId());
//
//        assertThat(topic.get().getId()).isGreaterThan(0);
//        assertThat(topic.get().getPostStream().getPosts().get(0).getId()).isGreaterThan(0);
//        assertThat(topic.get().getTitle()).isEqualTo(DISCOURSE_TOPIC_TITLE_CREATE);
//        log.debug("{}", topic.get().getTitle());
    }

}
