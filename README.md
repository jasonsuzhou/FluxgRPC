#gRPC学习
学习gRPC并把目前流量运营平台的开放接口修改成gRPC的模式

- 如下命令可以根据定义的proto文件自动生成java代码

```
mvn clean compile 

```
###踩过的坑
- service的名称不能和message名称一样
- proto3 相比较proto2的版本，第一位标记required/optional 不需要了，default值也不允许定义了

###参考
<https://github.com/grpc/grpc-java/tree/master/examples>