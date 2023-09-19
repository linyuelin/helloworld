package com.example.day19_filter_listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;

@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /**
     * servletContextオブジェクトの創立を傍受する
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext servletContext = sce.getServletContext();
        String initParameter = servletContext.getInitParameter("contextConfigLocation");
        String realPath = servletContext.getRealPath(initParameter);
        try {
            FileInputStream fis = new FileInputStream(realPath) ;
            System.out.println(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("servletContextオブジェクトが創立された");
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servletContextオブジェクト消えた");
    }
}
