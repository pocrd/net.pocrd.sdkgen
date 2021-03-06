package net.pocrd.m.app.client;

import com.google.gson.JsonObject;

import java.io.InputStream;

/**
 * Created by rendong on 14-6-3.
 */
public class UploadRequest extends BaseRequest<String> {

    public InputStream input;

    /**
     * 文件上传的构造函数，以下参数为该请求的必填参数
     *
     * @param flag     文件标签, pub 公共资源如头像, pri 私有资源
     * @param filename 文件名
     * @param input    待上传的数据流
     */
    public UploadRequest(String flag, String filename, InputStream input) {
        super("util.uploadRequest", SecurityType.UserLogin);

        params.put("flag", flag);
        params.put("filename", filename);

        this.input = input;
    }

    /**
     * 当前请求有可能的异常返回值
     */
    public int handleError() {
        return response.code;
    }

    @Override
    protected String getResult(JsonObject json) {
        if (json != null && !json.isJsonNull()) {
            return json.get("value").getAsString();
        }
        return null;
    }
}
