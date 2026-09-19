/*
 * Decompiled with CFR 0.152.
 */
package rs.s.b;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import rs.e.q;

final class x
extends JFormattedTextField.AbstractFormatter {
    private final String a;

    x(q q2) {
        this.a = q2.a();
    }

    @Override
    public Object stringToValue(String string) {
        String string2 = string.endsWith(this.a) ? string.substring(0, string.length() - this.a.length()) : string;
        try {
            return Integer.valueOf(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new ParseException(string2 + " is not an integer.", 0);
        }
    }

    @Override
    public String valueToString(Object object) {
        return String.valueOf(object) + this.a;
    }
}

