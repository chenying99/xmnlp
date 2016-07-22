package Demo;

import org.xm.dic.WordDict;
import org.xm.segWord.SegMode;
import org.xm.segWord.Segmenter;

import java.nio.file.Paths;

/**
 * Created by xuming on 2016/5/26.
 */
public class BaseDemo {

    public static void main(String[] args) {



        WordDict.getInstance().init(Paths.get("conf"));
        Segmenter segmenter = new Segmenter();
        String[] sentences =
                new String[]{"不輸入簡體字,阿丁说你很好，黎明认识这个李明不輸入簡體字典,矿泉水瓶盖子下面有东西", "我不喜欢日本和服。", "雷猴回归人间。",
                        "李明不輸入簡體字", "我不喜欢日本和服。", "东海县迅捷贸易有限责任公司"};
        System.out.println("----------------------");
        for (String sentence : sentences) {
            System.out.println(segmenter.process(sentence, SegMode.SEARCH).toString());
        }
        System.out.println("----------------------");
        for (String sentence : sentences) {
            System.out.println(segmenter.process(sentence, SegMode.INDEX).toString());
        }
    }


}