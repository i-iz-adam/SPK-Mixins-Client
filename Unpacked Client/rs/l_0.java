/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs;

import gnu.trove.f.b.cc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import rs.n.a;

/*
 * Renamed from rs.L
 */
public class l_0
implements Runnable {
    public static cc a = new cc();
    public static int b;
    private byte[] c;
    private InputStream d;
    private Thread e;
    private int f;
    private int g;

    public l_0(InputStream inputStream, int n2, int n3) {
        if (b == 4) {
            return;
        }
        if (n2 <= 4) {
            return;
        }
        this.d = inputStream;
        this.g = n2;
        this.f = n3;
        this.e = new Thread(this);
        this.e.start();
    }

    private static void a(Clip clip, int n2) {
        try {
            FloatControl floatControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
            float f2 = (float)n2 / 10.0f;
            float f3 = (4.0f - (float)l_0.a() + 1.0f) / 4.0f;
            float f4 = f2 * f3;
            if (n2 < 10) {
                f4 *= Math.max(0.25f, (float)n2 / 10.0f - 0.35f);
            }
            if (f4 < 0.01f) {
                f4 = 0.01f;
            } else if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            float f5 = (float)(20.0 * Math.log10(f4));
            if (f5 < floatControl.getMinimum()) {
                f5 = floatControl.getMinimum();
            } else if (f5 > floatControl.getMaximum()) {
                f5 = floatControl.getMaximum();
            }
            floatControl.setValue(f5);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        DataLine dataLine = null;
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = this.c != null ? AudioSystem.getAudioInputStream(new ByteArrayInputStream(this.c)) : AudioSystem.getAudioInputStream(this.d);
            AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, audioInputStream.getFormat().getSampleRate(), 16, audioInputStream.getFormat().getChannels(), audioInputStream.getFormat().getChannels() * 2, audioInputStream.getFormat().getSampleRate(), false);
            audioInputStream = AudioSystem.getAudioInputStream(audioFormat, audioInputStream);
            DataLine.Info info = new DataLine.Info(Clip.class, audioInputStream.getFormat());
            dataLine = (Clip)AudioSystem.getLine(info);
            dataLine.open(audioInputStream);
            l_0.a((Clip)dataLine, this.g);
            if (this.f > 0) {
                Thread.sleep(this.f);
            }
            dataLine.start();
            long l2 = System.currentTimeMillis();
            while (!dataLine.isActive()) {
                Thread.sleep(20L);
                if (System.currentTimeMillis() - l2 < 10000L) continue;
            }
            float f2 = l_0.a();
            while (dataLine.isActive()) {
                if ((float)l_0.a() != f2) {
                    l_0.a((Clip)dataLine, this.g);
                    f2 = l_0.a();
                }
                Thread.sleep(50L);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            if (dataLine != null) {
                while (dataLine.isRunning()) {
                    try {
                        Thread.sleep(10L);
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                dataLine.flush();
                dataLine.close();
            }
            try {
                if (audioInputStream != null) {
                    audioInputStream.close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public static int a() {
        return b;
    }

    public static void a(int n2) {
        if (n2 == 4) {
            rs.n.a.a("::soundoff");
        } else {
            rs.n.a.a("::soundon");
        }
        b = n2;
    }

    public void a(byte[] byArray) {
        this.c = byArray;
    }
}

