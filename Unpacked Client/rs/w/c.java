/*
 * Decompiled with CFR 0.152.
 */
package rs.w;

import java.io.File;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Mixer;

public class c {
    String a;
    String b;
    Sequence c;
    Sequencer d;
    Synthesizer e;
    double f = 0.0;

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public void a(String string) {
        this.a = string;
    }

    public void b(String string) {
        this.b = string;
    }

    public boolean a(double d2) {
        return this.a(d2, true);
    }

    public boolean a(double d2, boolean bl) {
        block6: {
            int n2;
            block4: {
                block5: {
                    if (bl) {
                        this.f = d2;
                    }
                    int n3 = 7;
                    n2 = (int)(d2 * 127.0);
                    if (this.e == null) break block4;
                    if (!(this.e instanceof Mixer)) break block5;
                    Mixer mixer = (Mixer)((Object)this.e);
                    if (!mixer.isControlSupported(FloatControl.Type.MASTER_GAIN)) break block6;
                    FloatControl floatControl = (FloatControl)mixer.getControl(FloatControl.Type.MASTER_GAIN);
                    float f2 = floatControl.getMaximum() - floatControl.getMinimum();
                    floatControl.setValue((float)((double)floatControl.getMinimum() + (double)f2 * d2));
                    break block6;
                }
                MidiChannel[] midiChannelArray = this.e.getChannels();
                for (int i2 = 0; midiChannelArray != null && i2 < midiChannelArray.length; ++i2) {
                    midiChannelArray[i2].controlChange(7, n2);
                }
                break block6;
            }
            if (this.d != null && this.d instanceof Synthesizer) {
                this.e = (Synthesizer)((Object)this.d);
                MidiChannel[] midiChannelArray = this.e.getChannels();
                for (int i3 = 0; midiChannelArray != null && i3 < midiChannelArray.length; ++i3) {
                    midiChannelArray[i3].controlChange(7, n2);
                }
            }
        }
        return true;
    }

    private boolean a(Receiver receiver, double d2) {
        try {
            ShortMessage shortMessage = new ShortMessage();
            for (int i2 = 0; i2 < 16; ++i2) {
                shortMessage.setMessage(176, i2, 7, (int)(d2 * 127.0));
                receiver.send(shortMessage, -1L);
            }
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public void c() {
    }

    public void d() {
        String string = this.a() + this.b();
        try {
            if (this.d != null) {
                this.d.stop();
                this.d.close();
            }
            this.d = null;
            this.c = null;
            File file = new File(string);
            if (file.exists()) {
                this.c = MidiSystem.getSequence(file);
            }
            this.d = MidiSystem.getSequencer(false);
            this.d.setSequence(this.c);
            this.e = MidiSystem.getSynthesizer();
            this.e.open();
            if (this.e.getDefaultSoundbank() == null) {
                this.d.getTransmitter().setReceiver(MidiSystem.getReceiver());
            } else {
                this.d.getTransmitter().setReceiver(this.e.getReceiver());
            }
            this.d.open();
            this.d.addMetaEventListener(metaMessage -> {
                if (metaMessage.getType() == 3) {
                    this.a(this.f, false);
                }
            });
            this.a(this.f, false);
            this.d.start();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

