package com.hyji.tablemanager.common;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description api response
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@Data
public class ApiResult implements Serializable {
    /** 响应码: 状态码为200才算请求成功 */
    private int code;

    /** 响应消息 */
    private String msg;

    /** 是否成功 */
    private boolean success;

    /** 响应数据 */
    private Object data;
    public ApiResult() {
        this.success = true;
        this.msg = ApiCode.SUCCESS.getMsg();
        this.code = ApiCode.SUCCESS.getCode();
    }

    public static ApiResult of() {
        return new ApiResult();
    }

    public static ApiResult of(final boolean result) {
        ApiResult commonResponse = ApiResult.of();
        commonResponse.setSuccess(result);
        commonResponse.setData(null);
        return commonResponse;
    }

    public static ApiResult of(final String msg) {
        ApiResult commonResponse = ApiResult.of();
        commonResponse.setSuccess(false);
        commonResponse.setCode(ApiCode.FAIL.getCode());
        commonResponse.setMsg(msg);
        return commonResponse;
    }

    public static ApiResult of(final Object data) {
        ApiResult commonResponse = ApiResult.of();
        commonResponse.setData(data);
        return commonResponse;
    }

    public static ApiResult of(final ApiCode resultCode) {
        return of(false, resultCode);
    }

    public static ApiResult of(final ApiCode resultCode, final Object data) {
        ApiResult commonResponse = of(false, resultCode);
        commonResponse.setData(data);
        return commonResponse;
    }

    public static ApiResult of(final boolean result, final ApiCode resultCode) {
        ApiResult commonResponse = ApiResult.of();
        commonResponse.setSuccess(result);
        commonResponse.setMsg(resultCode.getMsg());
        commonResponse.setCode(resultCode.getCode());
        return commonResponse;
    }

    public static ApiResult of(final boolean result, final Object data) {
        ApiResult commonResponse = ApiResult.of();
        commonResponse.setSuccess(result);
        commonResponse.setData(data);
        return commonResponse;
    }

    public static ApiResult of(final boolean result, final Object data, final ApiCode resultCode) {
        ApiResult commonResponse = of(result, resultCode);
        commonResponse.setData(data);
        return commonResponse;
    }

    public static ApiResult ok() {
        return of(true);
    }

    public static ApiResult ok(final Object data) {
        return of(data);
    }

    public static ApiResult ok(final ApiCode data) {
        return of(data);
    }

    public static ApiResult ok(final Object data, final ApiCode resultCode) {
        return of(true, data, resultCode);
    }

    public static ApiResult fail() {
        return of(false, ApiCode.FAIL);
    }

    public static ApiResult fail(final ApiCode data) {
        return of(false, data);
    }

    public static ApiResult fail(final String msg) {
        return of(msg);
    }

    public static ApiResult fail(ApiCode apiCode, Object data) {
        if (ApiCode.SUCCESS == apiCode) {
            throw new RuntimeException("失败结果状态码不能为" + ApiCode.SUCCESS.getCode());
        }
        return of(apiCode, data);
    }

    public static ApiResult okMap(String key, Object value) {
        Map<String, Object> map = new HashMap<>(16);
        map.put(key, value);
        return ok(map);
    }
}
