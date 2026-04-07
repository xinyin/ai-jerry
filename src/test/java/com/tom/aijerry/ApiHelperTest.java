package com.tom.aijerry;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiHelperTest {
    @Resource
    private ApiHelper apiHelper;

    @Test
    void chat() {
        apiHelper.chat("你是什么模型，介绍下你自己");
    }
}