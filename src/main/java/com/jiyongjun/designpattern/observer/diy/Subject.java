package com.jiyongjun.designpattern.observer.diy;


/**
 * description:主题
 *
 * @author yongjun.ji
 * @date 2018/4/25.
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
