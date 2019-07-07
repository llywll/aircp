package com.obor.aircp.advice;


import com.obor.aircp.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomExceptionResolve extends BaseController implements HandlerExceptionResolver {

    private static Logger logger = LoggerFactory.getLogger(CustomExceptionResolve.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        response.setStatus(HttpStatus.SERVICE_UNAVAILABLE.value()); //设置状态码
        response.setContentType(MediaType.APPLICATION_JSON_VALUE); //设置ContentType
        response.setCharacterEncoding("UTF-8"); //避免乱码
        response.setHeader("Cache-Control", "no-cache, must-revalidate");
        try {
            response.getWriter().write(String.valueOf(result(ERROR,e.getMessage())));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        long start = new Date().getTime();
        logger.info("-------------------------------："+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.ms").format(start)+"-------------------------------");
        logger.info("请求地址(URL) : " + request.getRequestURL().toString());
        logger.info("异常拦截:" + e.getMessage());
        e.printStackTrace();
        return mv;
    }
}
