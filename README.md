demo-mybatis
spring boot 集成 mybatis 多druid数据源

需要为两个数据源创建不同的 Mapper 包路径，将以前的*InfoDao，复制到包com.example.dao.one和com.example.dao.two路径下，并且分别重命名为：*OneInfoDao、*TwoInfoDao。

注意在多数据源的情况下，不需要在启动类添加：@MapperScan("com.xxx.mapper")的注解

