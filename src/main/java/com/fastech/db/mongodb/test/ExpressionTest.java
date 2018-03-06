package com.fastech.db.mongodb.test;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Created by mystoxlol on 2017/5/9, 14:11.
 * company: fastech
 * update record:
 */
public class ExpressionTest
{


    public static void main(String[] args)
    {

        ExpressionParser parser = new SpelExpressionParser();
        String expression1 = "true && (false || true)";
        boolean result1 = parser.parseExpression(expression1).getValue(boolean.class);
        System.out.println(result1);
    }
}
