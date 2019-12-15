package com.frace.thinking.thirdTeenChapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.frace.thinking.utils.Print.print;

/**
 * Created by frace on 2019/12/7 21:18
 */
public class MultiLinesFlags {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        // 这个正则表达式中有一个「$」行尾的匹配
        // \S: 匹配任意不是空白符的字符
        // \s: 匹配任意的空白符
//        Matcher m =
//                Pattern.compile("(\\S+)\\s+((\\S+)\\s+(\\S+))")
//                        .matcher(POEM);
//        while (m.find()) {
//            for (int j = 0; j <= m.groupCount(); j++)
//                System.out.print("[" + m.group(j) + "]");
//            print();
//        }
        String date = "20192020 8 12";
        Matcher matcher = Pattern.compile("(\\d{4})\\s+(\\d{1,2})\\s+(\\d{2})").matcher(date);
        while (matcher.find()){
            System.out.println(matcher.groupCount());
            System.out.print(matcher.group());
        }
    }
}
