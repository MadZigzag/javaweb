package com.atguigu.schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * ClassName: SysScheduleController
 * Package: com.atguigu.schedule.controller
 * Description:
 *
 * @author sichen
 * @version 1.0
 * @create 1/5/24 11:44 PM
 */

/*
* 增加日程的请求   /schedule/add
* 查询日程的请求   /schedule/find
* 修改日程的请求   /schedule/update
* 删除日程的请求   /schedule/remove
* ... ...
*
* */
@WebServlet("/schedule/*")
public class SysScheduleController extends BaseController {
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //判断此次请求是增，删，改，还是查
//        String requestURI = req.getRequestURI(); // /schedule/add
//        String[] split = requestURI.split("/");
//        String methodName = split[split.length - 1];
//
////        if (methodName.equals("add")) {
////            // 做增加处理
////            add(req, resp);
////        } else if (methodName.equals("find")) {
////            // 做查询处理
////            find(req, resp);
////        } else if (methodName.equals("update")) {
////            // 做修改处理
////            update(req, resp);
////        }else if (methodName.equals("remove")) {
////            // 做删除处理
////            remove(req, resp);
////        }
////    }
//
//        // 使用反射，通过方法名获取下面的方法 --> 又因为其他Controller也可以同样处理，所以单独提取出来放入BaseController
//        Class aClass = this.getClass();
//        // 获取方法
//        try {
//            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
//
//            // 暴力破解方法的访问修饰符的限制， 以防方法的修饰符不是public
//            declaredMethod.setAccessible(true);
//
//            // 执行方法
//            declaredMethod.invoke(this, req, resp);
//        } catch (Exception e) {
//            // throw new RuntimeException(e);
//            e.printStackTrace(); // 选择不抛出异常，而是打印异常日志
//        }
//    }
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("add");
    }

    protected void find(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("find");
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("update");
    }

    protected void remove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("remove");
    }

}
