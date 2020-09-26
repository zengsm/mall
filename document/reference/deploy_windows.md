# single-mall 在Windows环境下的部署

## 开发环境搭建


## 环境搭建
工具 | 版本号 | 下载
----|----|----
JDK | 1.8 | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Mysql | 5.7 | https://www.mysql.com/
Redis | 3.2 | https://redis.io/download
Elasticsearch | 6.2.2 | https://www.elastic.co/downloads
MongoDb | 3.2 | https://www.mongodb.com/download-center
RabbitMq | 3.7.14 | http://www.rabbitmq.com/download.html
nginx | 1.10 | http://nginx.org/en/download.html


简易环境搭建流程：

- 安装IDEA并导入项目源码；
- 安装MySql，创建一个`mall`数据库，并导入`/document/sql/mall.sql`文件；
- 安装Redis、Elasticsearch、MongoDB、RabbitMQ等环境。

## 项目部署

> `single-mall`项目启动有先后顺序，大家要按照以下顺序启动。

### 启动后台管理服务`mall-admin`

- 直接运行com.luban.mall.MallAdminApplication的main函数即可；
- 访问接口文档：http://localhost:8081/swagger-ui.html

- 登录接口地址：http://localhost:8081/admin/login
- 访问登录接口获取到token后放入认证的头信息即可正常访问其他需要登录的接口：

### 启动前台服务`mall-core`

- 直接运行com.luban.mall.CoreApplication的main函数即可；
- 访问接口文档：http://localhost:8888/swagger-ui.html

- 登录接口地址：http://localhost:8888/sso/login
- 调用需要登录的接口方式同`mall-admin`。

### 启动搜索服务`mall-search`

- 直接运行com.luban.mall.search.SearchApplication的main函数即可；
- 访问接口文档：http://localhost:8085/swagger-ui.html