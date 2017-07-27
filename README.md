### 腾讯云 **云通信** 和 **直播** 服务端JAVA SDK

版本要求：Java1.8+

使用之前：本SDK非腾讯官方SDK，部分接口并未做测试，欢迎贡献issues

### 1、Spring配置：

```java
<bean name="qcloudClient" class="com.wakeup.qcloud.DefaultQCloudClient" >
	<constructor-arg name="imConfig" ref="imConfig"/>
	<constructor-arg name="liveConfig" ref="liveConfig"/>
</bean>

<bean id="imConfig" class="com.wakeup.qcloud.domain.IMConfigDO">
	<property name="sdkAppId" value="${qcloud.im.sdkAppId}"/>
	<property name="identifier" value="${qcloud.im.adminIdentifier}"/>
	<property name="privateKey" >
		<value><![CDATA[${qcloud.im.privateKey}]]></value>
	</property>
	<property name="publicKey" >
		<value><![CDATA[${qcloud.im.publicKey}]]></value>
	</property>
</bean>

<bean id="liveConfig" class="com.wakeup.qcloud.domain.LiveConfigDO">
	<property name="sdkAppId" value="${qcloud.live.sdkAppId}"/>
	<property name="key" value="${qcloud.live.key}"/>
</bean>
```

注意点：

公钥和私钥写在配置文件中，不是读文件方式，所以换行需要\n替换之，同时注意spring配置文件中CDATA前后不留空格。

### 2、接口请求示例：


- 示例1：获取sig
```java
String sig = qcloudClient.getUserSig(userId+"", SIG_EXPIRE);
```

- 示例2：创建一个聊天室
```java
CreateGroupRequest request = new CreateGroupRequest();
request.setGroupId("1000000");
request.setName("聊天室-测试");
request.setType(GroupType.AV_CHAT_ROOM);
request.setApplyJoinOption(ApplyJoinOption.FreeAccess);
CreateGroupResponse response = qcloudClient.execute(request);
System.out.println(response);
```

- 示例3：接受回调消息
```java
@RequestMapping(value = { "/im_callback" },produces="application/json;charset=utf-8")
public @ResponseBody String im_callback(HttpServletRequest request) {
	try {
		Map<String,Object>  urlParams = getUrlParams(request);
		String msgBody = IOUtils.toString(request.getInputStream(),Charset.forName("utf-8"));
		QCloudMsgResponse response = qcloudClient.doMsgProcess(qcloudImMsgListener, msgBody, urlParams);
		return response.toString();
	} catch (Exception e) {
		log.error("",e);
	}
	return "{}";
}
```

### 3、done！！！





#### 下面广告长期有效：

杭州享贞教育科技有限公司，长期招聘如下技术岗位：

Java开发工程师，前端开发工程师，Android开发过程，iOS开发工程师

坐标：文一西路1326号利尔达物联网科技园

我们期望打造一个学习的入口，如果你感兴趣，欢迎简历发送至：jingxiang@51wakeup.com



### License

wakup-qcloud-sdk is released under the [Apache 2.0 license](https://github.com/51wakeup/wakeup-qcloud-sdk/blob/master/LICENSE).

```
Copyright 2017 HangZhou XiangZhen Education & Technology Co.,Ltd.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```