package com.wesker.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理者，具体为Wesker的代理
 * @author MR.ZHANG
 * @create 2018-12-21 11:37
 */
public class WeskerInvocationHandler implements InvocationHandler {
    private Person person;

    WeskerInvocationHandler(Person person){
        this.person = person;
    }

    @Override
    public String invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if(methodName.equals("doSing")){
            System.out.println("doSing before");
            return (String) method.invoke(person, args);
        }else if(methodName.equals("doDance")){
            System.out.println("doDance before");
            return (String) method.invoke(person, args);
        }else{
            System.out.println("cloud not find this demand");
        }
        return null;
    }
}
