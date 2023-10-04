package com.ossez.discourse.client.test;

import com.google.inject.Inject;
import com.ossez.discourse.client.service.PostsService;
import com.ossez.discourse.common.exception.DiscourseErrorException;
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
    public void testCreate() throws DiscourseErrorException {
        log.debug("Create WeChat Offical Account Menun Test");
        log.debug("{}", postsService.getPost(Long.valueOf("1245")).get().getRaw());


    }

}
