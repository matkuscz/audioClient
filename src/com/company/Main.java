package com.company;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;

/*
 * CD Audio -> 16 bit little endian, 44100 hz, stereo
 * Signed - zatim true
 */

public class Main {

    public static void main(String[] args) {

        // Audio format
//        AudioFormat.Encoding audioEncoding = AudioFormat.Encoding.PCM_SIGNED;
        float sampling_rate = 44100.0f;
        int channels = 2;
        int sampleSize = 16;
        boolean bigEndian = false;
//
//        AudioFormat audioFormat = new AudioFormat(audioEncoding, sampling_rate, sampleSize, channels, 4, sampling_rate, bigEndian);

        AudioFormat audioFormat = new AudioFormat(sampling_rate, sampleSize, channels,  true, bigEndian);

        DataLine.Info info = new DataLine.Info(TargetDataLine.class, audioFormat);

        if(!AudioSystem.isLineSupported(info)) {
            System.out.println("Line not supported");
            return;
        }

        
    }
}
