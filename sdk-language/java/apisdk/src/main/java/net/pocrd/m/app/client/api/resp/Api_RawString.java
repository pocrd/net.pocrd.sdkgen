// Auto Generated.  DO NOT EDIT!
package net.pocrd.m.app.client.api.resp;
    
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Api_RawString {

    /**
     * 要返回的字符串
     */
    public String value;
      
    /**
     * 反序列化函数，用于从json字符串反序列化本类型实例
     */
    public static Api_RawString deserialize(String json) {
        if (json != null && !json.isEmpty()) {
            return deserialize(new JsonParser().parse(json).getAsJsonObject());
        }
        return null;
    }
    
    /**
     * 反序列化函数，用于从json节点对象反序列化本类型实例
     */
    public static Api_RawString deserialize(JsonObject json) {
        if (json != null && !json.isJsonNull()) {
            Api_RawString result = new Api_RawString();
            JsonElement element = null;
            result.value = json.toString();
                
            return result;
        }
        return null;
    }
    
    /**
     * 序列化函数，用于从对象生成数据字典
     */
    public JsonObject serialize() {
        JsonObject json = new JsonObject();
        
        /* 要返回的字符串 */
        if(this.value != null) { json.addProperty("value", this.value); }
          
        return json;
    }
}
  