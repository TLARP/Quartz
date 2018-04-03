package com.netease.kaola;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by hzwangqiqing
 * on 2018/4/3.
 */
public class SpringServiceTest extends BaseTest {
    @Resource
    private SpringTestService springTestService;

    @Test
    public void test() {
        springTestService.soutHelloworld();
    }
}
