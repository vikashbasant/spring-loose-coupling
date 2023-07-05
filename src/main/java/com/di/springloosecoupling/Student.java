package com.di.springloosecoupling;

public class Student {

    private Cheat cheat;

    // =>> It Run-Time Polymorphism:
    public void setCheat (Cheat cheat) {
        this.cheat = cheat;
    }

    public void cheating(){
        this.cheat.cheat();
    }


}

