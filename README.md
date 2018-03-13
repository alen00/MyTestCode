# MyTestCode
学习代码

工程简介：
1、alen-common 统一父工程
2、common-cloud springboot cloud pom module
3、alen-eureka-server eurake注册中心服务
4、alen-geteway-api zuul geteway-api 网关
5、alen-test1-server 测试服务 test1

访问 eureka：
http://172.19.36.109:7777/

访问 服务：
http://172.19.36.109:7111/test1/getOk?param=okla
返回 okla

访问 zuul：
http://172.19.36.109:7776/test1/test1/getOk?param=okla
返回 okla
