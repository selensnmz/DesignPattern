package com.selen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args){

        //Arrays.asList("burak","kutbay","java").stream().forEach(System.out::println);

//        List<String> degerler=Arrays.asList("burak","kutbay","java");
//        List<String> sonuc=degerler.stream().filter(a->!"kutbay".equals(a)).collect(Collectors.toList());
//
//        sonuc.stream().forEach(System.out::println);

        //  burak java


//        List<String> degerler=Arrays.asList("burak","burak","selen","görkem");
//        List<String> sonuc=degerler.stream().distinct().collect(Collectors.toList());
//        sonuc.stream().forEach(System.out::println);
       // burak selen görkem

//        List<String> degerler=Arrays.asList("c","a","s","b","1","2","ç");
//        List<String> sonuc=degerler.stream().sorted().collect(Collectors.toList());
//        sonuc.stream().forEach(System.out::println);

//        List<String> degerler=Arrays.asList("c","a","s","b","1","2","ç");
//        List<String> sonuc=degerler.stream().skip(3).collect(Collectors.toList());
//        sonuc.stream().forEach(System.out::println);

        //Output
//        b
//        1
//        2
//        ç


//        List<String> degerler=Arrays.asList("c","a","s","b","1","2","ç");
//        List<String> sonuc=degerler.stream().map(a->a+"/").collect(Collectors.toList());
//        sonuc.stream().forEach(System.out::println);

//                c/
//                a/
//                s/
//                b/
//                1/
//                2/
//                ç/

 }

}
