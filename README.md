# Matomo-AI

> 这是我的一个SpringBoot练手项目

&emsp;Matomo-AI是一款基于开源网站数据统计和分析系统Matomo和各类GPT生成式大语言模型实现网站数据的AI分析系统，目的是让AI分析网站数据，并根据网站数据让AI提供未来网站的运营方案。

#### 开源项目参考

- [matomo-org/matomo](https://github.com/matomo-org/matomo)
- [songquanpeng/one-api](https://github.com/songquanpeng/one-api)

#### 本项目架构

![](/doc/1.png)

&emsp;首先用户向Matomo-AI系统发送Matomo相关接口数据的参数请求，Matomo-AI会利用用户提供的参数向Matomo发起请求获取对应API的网站数据，在获取网站数据后，Matomo-AI会向One API发起AI请求，将获取到的网站数据发送给AI，在AI进行分析并回复结果后，Matomo-AI就会将回复结果返回给用户或直接将回复结果展示出来。

#### 内部提供的Demo

![](/doc/3.png)

![](/doc/2.png)

![](/doc/4.png)

#### 接口

参考：[http://localhost:端口号/swagger-ui.html](http://localhost:8888/swagger-ui.html)


