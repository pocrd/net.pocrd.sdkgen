// Auto Generated.  DO NOT EDIT!
    
using System;
using Newtonsoft.Json.Linq;

using PoCRD.Client.API.Response;
using PoCRD.Client.Util;
using PoCRD.Client;

namespace PoCRD.Client.API.Request
{
    /**
     * demo test多语言测试. 
en-us:multi-language test 
ja-jp:多言語テスト
     * 
     * @author demo
     *
     */
    public class Demo_SayHello : BaseRequest<Api_DEMO_DemoEntity> 
    {
        
        /**
         * 当前请求的构造函数，以下参数为该请求的必填参数
         * @param name say hello多语言测试. 
en-us:multi-language test 
ja-jp:多言語テスト
         */
        public Demo_SayHello(string name) 
                    : base("demo.sayHello", SecurityType.None)
        {
            try 
            {
                parameters.Put("name", name);
            }
            catch(Exception e)
            {
                throw new LocalException("SERIALIZE_ERROR", LocalException.SERIALIZE_ERROR, e);
            }
        }
        
        /**
         * 私有的默认构造函数，请勿使用
         */
        private Demo_SayHello() : base("demo.sayHello", SecurityType.None)
        {
        }
      
        
        /**
         * 当前请求有可能的异常返回值
         */
        public int HandleError()
        {
            switch (response.code) 
            {
                
                /* 用户找不到. 
 en-us:multi-language test 
ja-jp:多言語テスト */
                case ApiCode.DEMO_USER_NOT_FOUND_1000001: {
                    break;
                }
  
                default:
                    break;
            }
            return response.code;
        }

        /**
         * 不要直接调用这个方法，API使用者应该访问基类的getResponse()获取接口的返回值
         */
        protected override Api_DEMO_DemoEntity GetResult(JObject json) 
        {
            try
            {
                return Api_DEMO_DemoEntity.Deserialize(json);
            }
            catch (Exception e)
            {
                logger.Error("Api_DEMO_DemoEntity deserialize failed.", e);
            }
            return null;
        }
        
    }
}
  