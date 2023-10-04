package com.ossez.discourse.client.test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ossez.discourse.client.DiscourseClient;
import com.ossez.discourse.client.service.PostsService;
import com.ossez.discourse.client.service.TopicsService;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Init Guice DI
 *
 * @author YuCheng
 */
public class TestBase {
    private static final Logger log = LoggerFactory.getLogger(TestBase.class);
    private static final String TEST_CONFIG_PROPERTIES = "test-config.properties";
    public static final Long DISCOURSE_POST_ID = 594L;
    public static final Long DISCOURSE_TOPIC_ID = 570L;
    public static final String DISCOURSE_TOPIC_TITLE = "ZCHub Discourse API Test";
    public static final String DISCOURSE_TOPIC_CONTENT = "ZCHub Discourse API Test";
    public static final String DISCOURSE_TOPIC_TITLE_CREATE = "ZCHub Discourse API Test - CREATE";

    @BeforeAll
    public void setup() {
        injector.injectMembers(this);
    }

    private static final Injector injector = Guice.createInjector(new AbstractModule() {
        @Override
        public void configure() {
            try (InputStream inputStream = ClassLoader.getSystemResourceAsStream(TEST_CONFIG_PROPERTIES)) {

                if (ObjectUtils.isEmpty(inputStream)) {
//                    throw new WxRuntimeException("测试配置文件【" + TEST_CONFIG_XML + "】未找到，请参照test-config-sample.xml文件生成");
                }

                Properties prop = new Properties();
                prop.load(inputStream);

                DiscourseClient.site_url = prop.getProperty("api.site.url");
                DiscourseClient.api_username = prop.getProperty("api.username");
                DiscourseClient.api_key = prop.getProperty("api.key");

                // TopicsService
                TopicsService topicsService = new TopicsService(DiscourseClient.site_url, DiscourseClient.api_username, DiscourseClient.api_key);
                bind(TopicsService.class).toInstance(topicsService);

                // TopicsService
                PostsService postsService = new PostsService(DiscourseClient.site_url, DiscourseClient.api_username, DiscourseClient.api_key);
                bind(PostsService.class).toInstance(postsService);

                // Init WeChat config for testing
//                Document document = new SAXReader().read(inputStream);
//                TestConfigStorage config = new TestConfigStorage();
//                config.setAppId(document.getRootElement().element("appId").getText());
//                config.setSecret(document.getRootElement().element("secret").getText());
//                config.setToken(document.getRootElement().element("token").getText());
//                config.setOpenid(document.getRootElement().element("openid").getText());
//                config.setAccessTokenLock(new ReentrantLock());

                // Init WeChat Service
//                WeChatOfficialAccountService weChatOfficialAccountService = new WeChatOfficialAccountServiceOkHttp();
//                weChatOfficialAccountService.setWxMpConfigStorage(config);
//                weChatOfficialAccountService.addConfigStorage("another", config);

                // Init WeChatMsgService
//                WeChatMsgService weChatMsgService = new WeChatMsgService(weChatOfficialAccountService);
//                WeChatDataCubeService weChatDataCubeService = new WeChatDataCubeService(weChatOfficialAccountService);
//                WeChatMenuService weChatMenuService = new WeChatMenuService(weChatOfficialAccountService);

//                bind(TestConfigStorage.class).toInstance(config);
//                bind(WeChatOfficialAccountService.class).toInstance(weChatOfficialAccountService);
//                bind(WeChatMsgService.class).toInstance(weChatMsgService);
//                bind(WeChatDataCubeService.class).toInstance(weChatDataCubeService);
//                bind(WeChatMenuService.class).toInstance(weChatMenuService);
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }
        }

    });


}
