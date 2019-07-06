package com.obor.aircp.aspect;


import com.obor.aircp.exception.ServiceException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Aspect
 * 作用是把当前类标识为一个切面供容器读取
 *
 * @Before
 * 标识一个前置增强方法，相当于BeforeAdvice的功能
 *
 * @AfterReturning
 * 后置增强，相当于AfterReturningAdvice，方法退出时执行
 *
 * @AfterThrowing
 * 异常抛出增强，相当于ThrowsAdvice
 *
 * @After
 * final增强，不管是抛出异常或者正常退出都会执行
 *
 * @Around
 * 环绕增强，相当于MethodIntercepto
 */

/**
 * 日志切面类
 */
@Aspect
@Component
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.obor.aircp.controller.*.*(..)) && (@annotation(org.springframework.web.bind.annotation.RequestMapping))")
    public void webLog(){}

    //环绕通知,环绕增强，相当于MethodInterceptor
    @Around("webLog()")
    public Object arround(ProceedingJoinPoint pjp) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpServletResponse response = attributes.getResponse();
        System.out.println("jjjjjj");
        try {
            long start = new Date().getTime();
            logger.info("|-------------------------------请求拦截："+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.ms").format(start)+"-------------------------------|");
            logger.info("请求地址(URL) : " + request.getRequestURL().toString());
            logger.info("请求方法(HTTP_METHOD) : " + request.getMethod());
            logger.info("访问地址(IP) : " + request.getRemoteAddr());
            logger.info("CLASS_METHOD : " + pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());
            logger.info("参数(ARGS) : " + Arrays.toString(pjp.getArgs()));
            Object o =  pjp.proceed();
            long end = new Date().getTime();
            logger.info("成功,耗时:" + (end - start) + "毫秒");
            return o;
        } catch (Throwable e) {
            logger.error("错误，信息：" + e.getMessage());
            throw new ServiceException(e.getMessage());
        }
    }

    /*@Before("webLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {}

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        System.out.println("方法的返回值 : " + ret);
    }

    //后置异常通知
    @AfterThrowing("webLog()")
    public void throwss(JoinPoint jp){
        System.out.println("方法异常时执行.....");
    }

    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
    @After("webLog()")
    public void after(JoinPoint jp){
        System.out.println("方法最后执行.....");
    }*/

}
