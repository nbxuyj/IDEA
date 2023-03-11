package com.xuyj.plateform.common.entity;

import lombok.Data;

@Data
public class BaseRequest {
    String partnerID;
    String signType;
    String msgID;
    String signData;
}
