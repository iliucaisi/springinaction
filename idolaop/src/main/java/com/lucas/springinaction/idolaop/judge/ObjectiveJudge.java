package com.lucas.springinaction.idolaop.judge;

import org.aspectj.lang.annotation.*;

/**
 * @file: ObjectiveJudge.java
 * @author: caisil
 * @date: 2017/12/3
 */
@Aspect
public class ObjectiveJudge {
  public ObjectiveJudge() {}

  @Pointcut("execution(* *.perform(..))")
  public void performance() {}

  @Before("performance()")
  public void greetPerformer() {
    System.out.println("WHAZZUP DAWG!");
  }

  @AfterReturning("performance()")
  public void judgePerformance() {
    System.out.println("IT WAS ROUGH AT FIRST, BUT YOU REALLY WORKED IT OUT DAWG!");
  }

  @AfterThrowing("performance()")
  public void commentOnBadPerformance() {
    System.out.println("DAWG! THAT WASN'T GOOD!");
  }
}
