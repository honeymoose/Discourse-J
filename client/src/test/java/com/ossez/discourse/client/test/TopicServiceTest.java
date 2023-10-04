package com.ossez.discourse.client.test;

import com.google.inject.Inject;
import com.ossez.discourse.client.service.TopicsService;
import com.ossez.discourse.common.exception.WxErrorException;
import com.ossez.discourse.common.model.dto.Topic;
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
     * @throws WxErrorException
     */
    @Test
    public void testCreate() throws WxErrorException {
        log.debug("Create WeChat Offical Account Menun Test");
        Optional<Topic> topic = topicsService.getTopic(DISCOURSE_TOPIC_ID);
        assertThat(topic).isNotEmpty();

        assertThat(topic.get().getId()).isEqualTo(DISCOURSE_TOPIC_ID);
        assertThat(topic.get().getTitle()).isNotEmpty();
        log.debug("{}", topic.get().getTitle());


    }

}
