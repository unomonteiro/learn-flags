package io.monteirodev.learnflags.model;

import io.monteirodev.learnflags.R;

public class Flag {
    private String mName;
    private String mNationality;

    private String mColorOne;
    private String mColorTwo;
    private String mColorThree;
    private int mSrcLines;
    private int mSrcOne;
    private int mSrcTwo;
    private int mSrcThree;
    private int mSrcFlag;

    public Flag(String countryCode, String countryName) {
        mName = countryName;
        switch (countryCode){
            case "ao": {
                initializeAO();
                break;
            } case "br": {
                initializeBR();
                break;
            }  case "jp": {
                initializeJP();
                break;
            }  case "uk": {
                initializeUK();
                break;
            } default: {
                initializePT();
                break;
            }
        }
    }

    private void initializeAO(){
        mNationality = "Angolan";
        mColorOne = "red";
        mColorTwo = "black";
        mColorThree = "yellow";
        mSrcLines = R.drawable.ao_lines;
        mSrcOne = R.drawable.ao_red;
        mSrcTwo = R.drawable.ao_black;
        mSrcThree = R.drawable.ao_yellow;
        mSrcFlag = R.drawable.ao_angola;
    }

    private void initializeBR() {
        mNationality = "Brazilian";
        mColorOne = "green";
        mColorTwo = "blue";
        mColorThree = "yellow";
        mSrcLines = R.drawable.br_lines;
        mSrcOne = R.drawable.br_green;
        mSrcTwo = R.drawable.br_blue;
        mSrcThree = R.drawable.br_yellow;
        mSrcFlag = R.drawable.br_brazil;
    }

    private void initializeJP() {
        mNationality = "Japanese";
        mColorOne = "red";
        mColorTwo = "blue";
        mColorThree = "black";
        mSrcLines = R.drawable.jp_lines;
        mSrcOne = R.drawable.jp_red;
        mSrcTwo = R.drawable.jp_blue;
        mSrcThree = R.drawable.jp_black;
        mSrcFlag = R.drawable.jp_japan;
    }

    private void initializePT() {
        mNationality = "Portuguese";
        mColorOne = "green";
        mColorTwo = "red";
        mColorThree = "yellow";
        mSrcLines = R.drawable.pt_lines;
        mSrcOne = R.drawable.pt_green;
        mSrcTwo = R.drawable.pt_red;
        mSrcThree = R.drawable.pt_yellow;
        mSrcFlag = R.drawable.pt_portugal;
    }

    private void initializeUK() {
        mNationality = "English";
        mColorOne = "blue";
        mColorTwo = "red";
        mColorThree = "white";
        mSrcLines = R.drawable.uk_lines;
        mSrcOne = R.drawable.uk_blue;
        mSrcTwo = R.drawable.uk_red;
        mSrcThree = R.drawable.uk_white;
        mSrcFlag = R.drawable.uk_united_kindom;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNationality() {
        return mNationality;
    }

    public void setNationality(String nationality) {
        mNationality = nationality;
    }

    public String getColorOne() {
        return mColorOne;
    }

    public void setColorOne(String colorOne) {
        mColorOne = colorOne;
    }

    public String getColorTwo() {
        return mColorTwo;
    }

    public void setColorTwo(String colorTwo) {
        mColorTwo = colorTwo;
    }

    public String getColorThree() {
        return mColorThree;
    }

    public void setColorThree(String colorThree) {
        mColorThree = colorThree;
    }

    public int getSrcLines() {
        return mSrcLines;
    }

    public void setSrcLines(int srcLines) {
        mSrcLines = srcLines;
    }
    public int getSrcOne() {
        return mSrcOne;
    }

    public void setSrcOne(int srcOne) {
        mSrcOne = srcOne;
    }

    public int getSrcTwo() {
        return mSrcTwo;
    }

    public void setSrcTwo(int srcTwo) {
        mSrcTwo = srcTwo;
    }

    public int getSrcThree() {
        return mSrcThree;
    }

    public void setSrcThree(int srcThree) {
        mSrcThree = srcThree;
    }

    public int getSrcFlag() {
        return mSrcFlag;
    }

    public void setSrcFlag(int srcFlag) {
        mSrcFlag = srcFlag;
    }
}
