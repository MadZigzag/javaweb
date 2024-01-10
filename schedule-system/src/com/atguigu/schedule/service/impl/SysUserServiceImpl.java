package com.atguigu.schedule.service.impl;

import com.atguigu.schedule.dao.SysUserDao;
import com.atguigu.schedule.dao.impl.SysUserDaoImpl;
import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.service.SysUserService;
import com.atguigu.schedule.util.MD5Util;

/**
 * ClassName: SysUserServiceImpl
 * Package: com.atguigu.schedule.service.impl
 * Description:
 *
 * @author sichen
 * @version 1.0
 * @create 1/5/24 5:01 PM
 */
public class SysUserServiceImpl implements SysUserService {

    private SysUserDao userDao = new SysUserDaoImpl();

    @Override
    public int regist(SysUser sysUser) {

        // 将用户的明文密码转换为密文密码
        String userPwd = sysUser.getUserPwd();
        String encrypt = MD5Util.encrypt(userPwd);
        sysUser.setUserPwd(encrypt);
        // 调用DAO层的方法，将SysUser信息存入数据库
        int rows = userDao.addSysUser(sysUser);
        return rows;
    }

    @Override
    public SysUser findByUsername(String username) {
        SysUser sysUser = userDao.findByUsername(username);
        return sysUser;
    }
}
