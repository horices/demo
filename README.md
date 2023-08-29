### 后端启动配置
1. 修改数据连接信息 ruoyi-admin/src/main/java/resources/application-druid.yml
2. 执行数据库数据文件 sql/ry_20230223.sql
3. 修改 redis 连接信息 ruoyi-admin/src/main/java/resources/application.yml
4. 启动项目类： com.ruoyi.RuoYiApplication

### 前端启动
1. 进入前端项目目录 rouyi-ui
2. 启动项目 npm run dev

### 访问地址
1. 后台默认访问地址： http://localhost
2. 接口文档默认地址：http://localhost:8080/doc.html

### shell 脚本地址
1. bin/linux1.sh (在给定文件中搜索指定内容，并将搜索结果(含内容出现的行号)保存到新的文件中，同时结果输出到控制台)
2. bin/linux2.sh (显示当前硬盘使用情况，内存使用情况，CPU使用情况)
