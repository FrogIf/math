package io.github.frogif.math.common;

/**
 * 字符串工具类
 */
public class StrUtils {

    public static boolean isNotBlank(String str){
        return str != null && !strBlank(str);
    }

    public static boolean isBlank(String str){
        return str == null || strBlank(str);
    }

    private static boolean strBlank(String str){
        for(int i = 0, len = str.length(); i < len; i++){
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch)){
                return false;
            }
        }
        return true;
    }

    public static String concat(char[] chars){
        if(chars == null){ return null; }
        StringBuilder builder = new StringBuilder();
        for(char c : chars){
            builder.append(c);
        }
        return builder.toString();
    }

    public static String leftFill(String str, char ch, int count){
        StringBuilder sb = new StringBuilder(count);
        for(int i = 0; i < count; i++){
            sb.append(ch);
        }
        return sb.toString() + str;
    }

    public static String rightFill(String str, char ch, int count){
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < count; i++){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String rightTrim(String str, char ch){
        int i = str.length() - 1;
        while(i >= 0 && str.charAt(i) == ch){
            i--;
        }
        str = str.substring(0, i + 1);
        return str;
    }

    public static boolean startWith(char[] chars, int startIndex, String prefix){
        int i = startIndex, j = 0;
        for(int lenA = chars.length, lenB = prefix.length(); i < lenA && j < lenB; i++, j++){
            if(chars[i] != prefix.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static String valueOf(Object obj, String valIfNull){
        return obj == null ? valIfNull : obj.toString();
    }

    public static String valueOf(Object obj){
        return valueOf(obj, "null");
    }

    // 一个字符串的两端全部填充
    public static String bothFill(char left, int leftRepeat, String center, char right, int rightRepeat) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < leftRepeat; i++){
            sb.append(left);
        }
        sb.append(center);
        for(int i = 0; i < rightRepeat; i++){
            sb.append(right);
        }
        return sb.toString();
    }

    public static String repeat(String element, int repeat){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < repeat; i++){
            sb.append(element);
        }
        return sb.toString();
    }
}
