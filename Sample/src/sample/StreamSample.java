package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.LayoutStyle.ComponentPlacement;

public class StreamSample {

    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");
        
        System.out.println("■Stream forEachによる取得 ： ");
        places.stream().forEach(place -> System.out.println(place));
        
        System.out.println("■「ン」で終わる場所のみ抽出 ： ");
        places.stream()
              .filter(place -> place.endsWith("ン"))
              .forEach(place -> System.out.println(place));
        
        System.out.println("■各場所名の長さを表示 ： ");
        places.stream()
              .map(place -> place + " の長さ ： " + place.length())
              .forEach(place -> System.out.println(place));
        
        System.out.println("■ソート ： ");
        places.stream()
              .sorted()
              .forEach(place -> System.out.println(place));
        
        List<String> filteredPlaces = places.stream()
                .filter(place -> places.contains("ス"))
                .collect(Collectors.toList());
        System.out.println(" 「ス」 を含む場所 ： " + filteredPlaces);
                        

    }

}
