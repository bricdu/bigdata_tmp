# bigdata_tmp

![image-20210807173606756](pic/image-20210807173606756.png)

![image-20210807173630934](pic/image-20210807173630934.png)

![image-20210807173728851](pic/image-20210807173728851.png)

![image-20210807194134762](pic/image-20210807194134762.png)

![image-20210807194813457](pic/image-20210807194813457.png)

![image-20210807194832368](pic/image-20210807194832368.png)

![image-20210807195041285](pic/image-20210807195041285.png)

![image-20210807195356606](pic/image-20210807195356606.png)

![image-20210807203117051](pic/image-20210807203117051.png)

![image-20210807203124210](pic/image-20210807203124210.png)

# 工厂

![image-20210807222748935](pic/image-20210807222748935.png)

# 利用unapply模式提取

![image-20210807224409578](pic/image-20210807224409578.png)

![image-20210807224339057](pic/image-20210807224339057.png)

# case class 自动封装apply

# option

![image-20210807225503259](pic/image-20210807225503259.png)

![image-20210807233610564](pic/image-20210807233610564.png)![image-20210807225627524](pic/image-20210807233650521.png)

# zeppelin导入外部依赖

　一、我们都知道，很多类库都是可以通过Maven仓库下载到的，所以我们可以指定依赖库的group ID、artifact ID以及version来指定具体的依赖。在Zeppelin中，我们可以通过%dep Interpreter来加载依赖，如下：

```
%``dep``z.load(``"mysql:mysql-connector-java:5.1.35"``)
```

%dep默认就可以使用，z代表的是Zeppelin context。

如果我们觉得Maven中央仓库下载的速度比较慢，我们可以自定义Maven仓库，如下：

```
%dep
z.addRepo("RepoName").url("RepoURL")
```

　　二、通过指定jar的本地路径来加载外部依赖，具体如下：

```
%dep
z.load("/path/to.jar")
```

如果需要导入自己的 jar 包:

- 点击 File -> Project Structure -> Project Settings -> Libraries
  ![img](https://img2018.cnblogs.com/blog/1846851/201911/1846851-20191128104253040-1249516660.png)
- 点击左上加号选择 java
- 选择 jar 包所在目录
- 点击 ok 完成设置