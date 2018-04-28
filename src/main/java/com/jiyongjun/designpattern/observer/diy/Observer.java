package com.jiyongjun.designpattern.observer.diy;

/**
 * description:
 *
 * @author yongjun.ji
 * @date 2018/4/25.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
