package org.adscale.groovyLochnesse;

public class Sleep {
    private int seconds;

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public void sleep()throws Exception{
        Thread.sleep(seconds * 1000);
    }

}
