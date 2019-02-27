package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    private String word = "";
    public WuTangConcatenator(Integer input) {
        this.word = wuTangCreator(input);
    }

    public Boolean isWu() {
        if(getWord().equals("wu")) {
            return true;
        }
        return false;
    }

    public Boolean isTang() {
        if(getWord().equals("tang")) {
            return true;
        }
        return false;
    }

    public Boolean isWuTang() {
        if(getWord().equals("wutang")) {
            return true;
        }
        return false;
    }

    String wuTangCreator(Integer input) {
        String wutangConcat = "";
        if(input % 3 == 0) {
            wutangConcat = "wu";
        } else if(input % 5 == 0) {
            wutangConcat = "tang";
        } else if ((input % 3 == 0) && (input % 5 == 0)) {
            wutangConcat = "wutang";
        }
        return wutangConcat;
    }


    public String getWord() {
        return word;
    }
}
