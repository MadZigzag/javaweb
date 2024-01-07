package com.atguigu.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: SysUser
 * Package: com.atguigu.schedule.pojo
 * Description:
 *
 * @author sichen
 * @create 1/4/24 4:09
 * @version 1.0
 */

/*
* 1. 实体类的类名和表格名应该对应（不是一致）
* 2. 实体类的属性名和表格的列名应该对应
* 3. 每个属性都必须是私有的
* 4. 每个属性都应该具备getter setter
* 5. 必须具备无参构造器
* 6. 应该实现序列化接口（缓存，分布式项目数据传递 可能会将对象序列化）
* 7. 应该重写累的hashcode和equals方法
* 8. toString是否重写都可以
*
* 可使用Lombok生成：安装插件，enable annotation processing, 倒入Lombok的依赖，在实体类上添加注解
* */

@AllArgsConstructor // 添加了全参构造
@NoArgsConstructor // 添加了无参构造
@Data // 合并了@Getter, @Setter, @Equals, @HashCode, @ToString

public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

}

