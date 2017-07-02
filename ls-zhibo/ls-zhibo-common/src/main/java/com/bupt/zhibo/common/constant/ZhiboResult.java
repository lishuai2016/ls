package com.bupt.zhibo.common.constant;

import com.ls.common.base.BaseResult;

/**
 * 系统常量枚举类
 */
public class ZhiboResult extends BaseResult {

    public ZhiboResult(ZhiboResultConstant cmsResultConstant, Object data) {
        super(cmsResultConstant.getCode(), cmsResultConstant.getMessage(), data);
    }

}
