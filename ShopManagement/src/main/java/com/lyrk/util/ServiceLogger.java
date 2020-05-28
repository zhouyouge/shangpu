package com.lyrk.util;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 *
 */
@Aspect
public class ServiceLogger {
    private static Logger logger= Logger.getLogger(ServiceLogger.class);

   /* *//**
     * 前置增强
     * @param joinpoint
     *//*
    *//*@Before("execution( * com.lyrk.service..*.*(..)))")*//*
    *//*可以用*代替*//*
    @Before("execution( * *.*.*..*.*(..)))")
    public void before(JoinPoint joinpoint){
    logger.info("前置调用1："+joinpoint.getTarget()+"的"+
            joinpoint.getSignature().getName()+"方法，方法入参："+
            Arrays.toString(joinpoint.getArgs()));
}

    *//**
     * 后置增强
     * @param jp
     * @param result
     *//*
    @AfterReturning(value="execution( * com.lyrk.service..*.*(..)))",returning="result")
    public void afterReturning(JoinPoint jp,Object result) {
        logger.info("后置调用1：" + jp.getTarget() + "的" +
                jp.getSignature().getName() + "方法，方法返回值：" +
                result);
    }

    *//**
     * 异常抛出增强
     * @param jp
     * @param e
     *//*
    @AfterThrowing(pointcut="execution( * com.lyrk.service..*.*(..)))",throwing = "e")
    public void afterThrowing(JoinPoint jp,RuntimeException e){
            logger.info("异常抛出增强调用1："+jp.getTarget()+"的"+
                    jp.getSignature().getName()+"方法，方法抛出异常："+
                    e);
        }

    *//**
     * 最终增强
     * @param jp
     *//*
    @After("execution( * com.lyrk.service..*.*(..)))")
    public void afterFinally(JoinPoint jp){
            logger.info("最终增强调用："+jp.getTarget()+"的"+
                    jp.getSignature().getName()+"方法");
        }

*/
/**
 * 环能增强
 * @param joinPoint @return
 */
@Around("execution( * com.lyrk.service..*.*(..)))")
        public Object round(ProceedingJoinPoint joinPoint){
            logger.info("r:前置增强调用2: " + joinPoint.getTarget() +"的"+joinPoint.getSignature().getName () + "方法,方法入参: "+Arrays.toString(joinPoint.getArgs()));

            try {
                Object result = joinPoint.proceed();
                logger. info ("r:后置增强调用2: " + joinPoint.getTarget() +"的"+
                        joinPoint.getSignature().getName () +"方法,方法返回值: "+
                        result);
                return result;
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                logger. info("r:异常抛出增强调用2: " + joinPoint.getTarget() +"的"+
                        joinPoint.getSignature() .getName () +"方法,方法抛出的异常:"+
                        throwable);
                throw new RuntimeException();
            }finally{
                    logger.info("r:最终增强调用完: " + joinPoint.getTarget() + "的"+
                            joinPoint.getSignature().getName() + "方法");
                }

        }


}

