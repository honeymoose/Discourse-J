package com.ossez.discourse.client.test;

import com.google.inject.Inject;
import com.ossez.discourse.client.service.TopicService;
import com.ossez.discourse.common.exception.WxErrorException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test for datacube API
 *
 * @author YuCheng
 */
@TestInstance(Lifecycle.PER_CLASS)
public class TopicsServiceTest extends TestBase {
    private static final Logger log = LoggerFactory.getLogger(TopicsServiceTest.class);
    @Inject
    protected TopicService topicService;

    /**
     * Test Create Menu
     *
     * @throws WxErrorException
     */
    @Test
    public void testCreate() throws WxErrorException {
        log.debug("Create WeChat Offical Account Menun Test");
        log.debug("{}", topicService.getTopic(Long.valueOf("1245")).get().getTitle());


    }

}
