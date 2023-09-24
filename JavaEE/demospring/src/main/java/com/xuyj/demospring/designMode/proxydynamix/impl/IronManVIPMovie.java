package com.xuyj.demospring.designMode.proxydynamix.impl;

import com.xuyj.demospring.designMode.proxydynamix.VIPMovie;

/**
 * 钢铁侠电影
 */
public class IronManVIPMovie  implements VIPMovie {
    @Override
    public void vipPlay() {
        System.out.println("VI影厅正在播放的电影是《钢铁侠》");
    }
}
