package com.example.a1234;


public class database {
    String name, id, password, title, platform, peoplenum, leastmoney, exo, link, year, month, day, hour, minute;

    public database(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    //getter, setter 설정

    public String getTitle() { return title; }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(String peoplenum){
        this.peoplenum = peoplenum;
    }

    public String getLeastmoney() {
        return leastmoney;
    }

    public void setLeastmoney(String leastmoney){
        this.leastmoney = leastmoney;
    }

    public String getExo() {
        return exo;
    }

    public void setExo(String exo){
        this.exo = exo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link1){
        this.link = link;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day){
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour){
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute){
        this.minute = minute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }




    //값을 추가할때 쓰는 함수, MainActivity에서 addanimal함수에서 사용할 것임.
    public database(String title, String platform, String peoplenum, String leastmoney, String exo, String link, String year, String month, String day, String hour, String minute){
        this.title = title;
        this.platform = platform;
        this.peoplenum = peoplenum;
        this.leastmoney = leastmoney;
        this.exo = exo;
        this.link = link;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }
}