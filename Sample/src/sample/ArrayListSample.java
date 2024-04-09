package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");
        
        String firstItem = places.get(0);
        System.out.println("1番目の要素 （置換前） ： " + firstItem);
        
        places.set(0, "スウェーデン");
        System.out.println("１番目の要素 （置換後） ： " + places.get(0));
                
        System.out.println("２番目の要素 （削除前） ： " + places.get(1));
        places.remove(1);
        System.out.println("２番目の要素 （削除後） ： " + places.get(1));
        
        System.out.println("拡張forループによる取得 ： ");
        for (String place : places) {
            System.out.println(place);
        }
        
        System.out.println("forEachとラムダ式による取得 ： ");
        places.forEach((place) -> System.out.println(place));
        
        int size = places.size();
        System.out.println("リストのサイズ （クリア前） ： " + size);
        places.clear();
        System.out.println("リストのサイズ （クリア後） ： " + places.size());
        
        

    }

}
