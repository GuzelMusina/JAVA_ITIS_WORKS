package ru.itis.channels;

public class Channel {

    private int number;
    private String channelName;
    private String programName;

    public Channel(int number, String channelName, String programName) {
        this.number = number;
        this.channelName = channelName;
        this.programName = programName;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Override
    public String toString() {
        return this.number + " "
                + this.channelName + " "
                + this.programName;

    }
}
