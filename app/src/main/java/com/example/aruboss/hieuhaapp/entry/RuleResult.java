package com.example.aruboss.hieuhaapp.entry;

import java.util.ArrayList;

/**
 * Created by Admin on 7/5/2017.
 */

public class RuleResult {
    private String section;

    private String content;

    private int line;

    private ArrayList<String> words = new ArrayList<>();

    private String rule;

    public RuleResult() {
    }

    public String getSection() {

        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
    public void addWord(String word) {
        words.add(word);
    }
}
