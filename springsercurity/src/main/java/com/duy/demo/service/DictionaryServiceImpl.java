package com.duy.demo.service;


import com.duy.demo.models.Word;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class DictionaryServiceImpl implements DictionaryService{
    static List<Word> listWord = new ArrayList<>();
    static{
        listWord.add(new Word("car","oto"));
        listWord.add(new Word("hello","xin chao"));
    }
    @Override
    public String seachInVietnamese(String english) {
        Iterator itr = listWord.iterator();
        String vietnamese = "";
        while (itr.hasNext()){
            Word handler = (Word) itr.next();
            if (handler.getEnglish().equals(english)){
                vietnamese = handler.getVietnamese();
            }
        }
        return vietnamese;
    }

    public static void main(String[] args) {
        DictionaryServiceImpl dictionaryServiceImpl = new DictionaryServiceImpl();
        String result = dictionaryServiceImpl.seachInVietnamese("car");
        System.out.println(result);

    }
}
