/*
 * Decompiled with CFR 0.152.
 */
package rs.s.b;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JFormattedTextField;
import rs.e.q;
import rs.s.b.x;

final class y
extends JFormattedTextField.AbstractFormatterFactory {
    private final q a;
    private final Map<JFormattedTextField, JFormattedTextField.AbstractFormatter> b = new HashMap<JFormattedTextField, JFormattedTextField.AbstractFormatter>();

    @Override
    public JFormattedTextField.AbstractFormatter getFormatter(JFormattedTextField jFormattedTextField2) {
        return this.b.computeIfAbsent(jFormattedTextField2, jFormattedTextField -> new x(this.a));
    }

    public y(q q2) {
        this.a = q2;
    }
}

