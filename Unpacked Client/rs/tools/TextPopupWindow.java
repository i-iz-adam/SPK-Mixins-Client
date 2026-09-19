/*
 * Decompiled with CFR 0.152.
 */
package rs.tools;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import rs.tools.c;
import rs.tools.d;
import rs.tools.e;
import rs.tools.f;
import rs.tools.g;

public class TextPopupWindow
extends JFrame {
    public static final rs.tools.a a = new rs.tools.b();
    public static List<String> b = new ArrayList<String>();
    public static rs.tools.a c = a;
    private SimpleAttributeSet d = new SimpleAttributeSet();
    private b e = new b();
    private rs.tools.a f;
    private a g;

    public static void main(String[] stringArray) {
        c c2 = new c();
    }

    public TextPopupWindow(String string, rs.tools.a a2) {
        this.f = a2;
        this.setTitle(string);
        this.setDefaultCloseOperation(3);
        SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(simpleAttributeSet, true);
        TextPopupWindow textPopupWindow = this;
        this.e.getInputMap().put(KeyStroke.getKeyStroke(70, 2), new d(this, textPopupWindow));
        this.e.setCharacterAttributes(simpleAttributeSet, true);
        this.e.setEditable(false);
        this.e.getCaret().setVisible(true);
        this.e.getCaret().setSelectionVisible(true);
        this.e.addFocusListener(new e(this));
        JScrollPane jScrollPane = new JScrollPane(this.e);
        this.getContentPane().add((Component)jScrollPane, "Center");
        this.setSize(989, 571);
        this.setVisible(true);
    }

    public void a(String string) {
        try {
            this.f.a(this.e.getStyledDocument(), this.d, string);
        }
        catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
    }

    public JTextPane a() {
        return this.e;
    }

    static /* synthetic */ a a(TextPopupWindow textPopupWindow) {
        return textPopupWindow.g;
    }

    static /* synthetic */ a a(TextPopupWindow textPopupWindow, a a2) {
        textPopupWindow.g = a2;
        return textPopupWindow.g;
    }

    static /* synthetic */ b b(TextPopupWindow textPopupWindow) {
        return textPopupWindow.e;
    }

    protected class b
    extends JTextPane {
        protected b() {
        }

        @Override
        public boolean getScrollableTracksViewportWidth() {
            return this.getUI().getPreferredSize((JComponent)this).width <= this.getParent().getSize().width;
        }

        @Override
        public Dimension getPreferredSize() {
            return this.getUI().getPreferredSize(this);
        }
    }

    protected final class a
    extends JFrame {
        private TextPopupWindow b;
        private JTextField c;
        private JButton d;
        private int e;

        public a(TextPopupWindow textPopupWindow2) {
            this.b = textPopupWindow2;
        }

        public void a() {
            this.setLocationRelativeTo(this.b);
            this.requestFocus();
        }

        public void b() {
            if (this.isVisible()) {
                return;
            }
            this.d = new JButton("Search");
            this.c = new JTextField("", 15);
            this.setTitle("Search for text");
            this.setLayout(new FlowLayout());
            this.setSize(300, 75);
            this.setLocationRelativeTo(this.b);
            this.getRootPane().setDefaultButton(this.d);
            this.getContentPane().add((Component)this.c, 0);
            this.getContentPane().add((Component)this.d, 1);
            this.setVisible(true);
            this.e = this.b.a().getCaretPosition();
            this.getRootPane().getInputMap(2).put(KeyStroke.getKeyStroke(27, 0), "Cancel");
            this.getRootPane().getActionMap().put("Cancel", new f(this));
            this.d.addActionListener(new g(this));
        }

        static /* synthetic */ JTextField a(a a2) {
            return a2.c;
        }

        static /* synthetic */ TextPopupWindow b(a a2) {
            return a2.b;
        }

        static /* synthetic */ int c(a a2) {
            return a2.e;
        }

        static /* synthetic */ int a(a a2, int n2) {
            a2.e = n2;
            return a2.e;
        }

        static /* synthetic */ int d(a a2) {
            return a2.e++;
        }

        static /* synthetic */ int b(a a2, int n2) {
            return a2.e += n2;
        }
    }
}

