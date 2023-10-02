package com.ossez.discourse.common.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test for Access Token
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WeChatAccessTokenTest {
    final Logger log = LoggerFactory.getLogger(WeChatAccessTokenTest.class);
    private String accessTokenResponse;

    @BeforeEach
    protected void setUp() throws Exception {
        accessTokenResponse = "{\"access_token\":\"ACCESS_TOKEN\",\"expires_in\":7200}";
    }

    @AfterEach
    protected void tearDown() throws Exception {
    }


}
