package com.xuyj.demospring.designMode.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义发布者：
 */
@Data
public abstract class Publisher {
    List<ISubstriber> substribers = new ArrayList<>();
    public String Message;


    public Publisher(String msg) {
        Message = msg;
    }

    /// <summary>
    /// 发布消息
    /// </summary>
    public void Publish() {

        for (ISubstriber item : substribers) {
            item.Recivier(this);
        }

    }

    public void AddSubscriber(ISubstriber sub) {
        substribers.add(sub);
    }

    public void RemoveSubsctiber(ISubstriber sub) {
        substribers.remove(sub);
    }


}
