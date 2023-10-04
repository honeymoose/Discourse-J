package com.ossez.discourse.client.test;

import org.apache.commons.io.StandardLineSeparator;
import com.google.inject.Inject;
import com.ossez.discourse.client.service.PostsService;
import com.ossez.discourse.common.exception.DiscourseErrorException;
import com.ossez.discourse.common.model.dto.PostUpdate;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * Test for datacube API
 *
 * @author YuCheng
 */
@TestInstance(Lifecycle.PER_CLASS)
public class PostsServiceTest extends TestBase {
    private static final Logger log = LoggerFactory.getLogger(PostsServiceTest.class);
    @Inject
    protected PostsService postsService;

    /**
     * Test Create Menu
     *
     * @throws DiscourseErrorException
     */
    @Test
    public void testCreatePost() throws DiscourseErrorException {
        log.debug("Create WeChat Offical Account Menun Test");
        log.debug("{}", postsService.getPost(Long.valueOf("1245")).get().getRaw());


    }

    @Test
    public void testUpdatePost() throws DiscourseErrorException {
        log.debug("Discourse Update Post Test");
        PostUpdate postUpdate = new PostUpdate();
        postUpdate.setId(DISCOURSE_POST_ID);

        StringBuilder rawBuilder = new StringBuilder().append(DISCOURSE_TOPIC_CONTENT);
        rawBuilder.append(StandardLineSeparator.CRLF.getString());
        rawBuilder.append(UUID.randomUUID().toString());
        postUpdate.setRaw(rawBuilder.toString());

        log.debug("{}", postsService.updatePost(postUpdate).get().getRaw());
    }
}
