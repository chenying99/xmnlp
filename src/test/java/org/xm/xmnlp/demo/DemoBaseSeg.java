package org.xm.xmnlp.demo;

import org.xm.xmnlp.seg.TokenizerConfig;
import org.xm.xmnlp.seg.domain.Result;
import org.xm.xmnlp.tokenizer.StandardTokenizer;

/**
 * Created by mingzai on 2016/7/23.
 */
public class DemoBaseSeg {
    public static void main(String[] args) {
        TokenizerConfig tokenizerConfig = new TokenizerConfig();
        tokenizerConfig.useCustomDictionary = true;
        Result termList = StandardTokenizer.segment("我觉得物理学起来费劲。，物理课程学起来费劲" +
                "目标是普及自然语言处理在生产环境中的应用。你知道这个答案为什么类型吗？手机如何设计呼入限制" +
                "特殊符号￥％，ｘｉ大写转小写：F字母区别FFDr，進行在線轉換，中国人名共和国万岁,著名胡同在刘家湾？");
        System.out.println(termList);

    }
}
