package com.b301.moeum.arrange.converter;

import lombok.Getter;

@Getter
public class Note {

    public int timeStampByTicks;
    public int durationTicks;
    public int midiNote;
    public double velocity;

    public Note(int timeStampByTicks, int durationTicks, int midiNote, double velocity) {
        this.timeStampByTicks = timeStampByTicks;
        this.durationTicks = durationTicks;
        this.midiNote = midiNote;
        this.velocity = velocity;
    }
}
