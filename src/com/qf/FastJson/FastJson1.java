package com.qf.FastJson;

import com.alibaba.fastjson.JSON;
import com.qf.JSON.Score;
import org.junit.Test;

public class FastJson1 {

    @Test
    public void demo(){

        String str="{name:'wanwan',age:88}";

        Score score = JSON.parseObject(str, Score.class);

        System.out.println(score);



    }

    public void demo2(){

    }

}
