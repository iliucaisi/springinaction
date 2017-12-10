package com.lucas.springinaction.idolaop.performer;

/**
 * @file: DefaultFooImpl.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class DefaultFooImpl implements Foo {
    public DefaultFooImpl() {
    }

    @Override
    public void doSomething() {
        System.out.println("DEFAULT FOO IMPL: DOING SOMETHING!!!");
    }
}
