package com.xuyj.demospring.designMode.state;

import java.util.Objects;

/**
 * 京东物流
 */
public class JdLogistics {
    private LogisticsState logisticsState;

    public void setLogisticsState(LogisticsState logisticsState) {
        this.logisticsState = logisticsState;
    }

    public LogisticsState getLogisticsState() {
        return logisticsState;
    }

    public void doAction(){
        Objects.requireNonNull(logisticsState);
        logisticsState.doAction(this);
    }
}