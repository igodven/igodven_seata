## seata分布式事务控制管理
### 1.docker-cmopose的方式部署集群nacos/nginx/mysql/seata
#### 1.1 搭建nacos集群,配置文件存放目录nacos集群.

#### 1.2 搭建nginx,配置文件存放目录<nginx>.
#### 1.3 搭建mysql,配置文件存放目录<mysql>.
#### 1.4 搭建seata,配置文件存放目录<seata>.
#### 1.5 sql脚本存放目录在<sql脚本>,业务的脚本最好分库执行,数据库进行分库操作

## 代码
### 1.account属于账户代码
### 2.order,订单的代码
### 3.storage仓储代码

## 项目启动后,通过调用订单的控制层,去进行事务的验证,订单模块有一个save的方法,
## postman调用该方法,order的service层会通过open的方式调用其他服务的业务方法
## storage的业务方法会有一个报错,报错后,全局的事务会进行回滚


## 事务如何控制的
### 各个业务库有一张undo_log的表,该表会记录所有的sql数据操作前,和操作后的值的记录,报错会进行回滚,seata的表中会记录具体的锁表的信息,改过程可以通过debug观察




