package com.cn.demo;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo {
    //用户自定义字典
    private static String[] userDictionary;

    //是否为额外字典
    private static boolean isExtraUse;

    public TestDemo(){

    }

    public TestDemo(String[] dictionary,boolean bothUseFlag){
        userDictionary = dictionary;
        isExtraUse = bothUseFlag;
    }

    private static String result = "";



    private static boolean isEquals(String str){
        String[] demo = {"i", "like", "sam", "sung", "samsung", "mobile", "ice",
                "cream", "icecream", "man", "go", "mango", "and"}; ;
        if (isExtraUse && userDictionary != null && userDictionary.length > 0){
           List list= Stream.concat(Arrays.asList(demo).stream(),Arrays.asList(userDictionary).stream()).distinct()
                    .collect(Collectors.toList());
           demo = (String[]) list.toArray(new String[]{});
        }else {
            if (userDictionary!=null && userDictionary.length>0){
                demo = userDictionary;
            }
        }

       if(Arrays.asList(demo).stream().filter(x -> x.equals(str)).count() > 0){
           return true;
       }
       return false;
    }

    public void getResult(String str){
        mainProgram(str,"");
    }

    private static String mainProgram(String str, String result){
        int n = str.length();
        for (int i = 1; i <= n; i++){
            String word = str.substring(0,i);
            if (isEquals(word)){
                if (i == n){
                    result += word;
                    System.out.println(result);
                    return result;
                }
                mainProgram(str.substring(i,n),result+word+" ");
            }
        }
        return null;
    }

   /* public static void main(String[] args) {
        String str = "ilikeicecreamandmango";
        getResult(str);
    }*/
}
