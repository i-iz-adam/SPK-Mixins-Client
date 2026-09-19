/*
 * Decompiled with CFR 0.152.
 */
package rs.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.function.Function;

public class j
extends GridLayout {
    public j() {
        this(1, 0, 0, 0);
    }

    public j(int n2, int n3) {
        this(n2, n3, 0, 0);
    }

    public j(int n2, int n3, int n4, int n5) {
        super(n2, n3, n4, n5);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Dimension preferredLayoutSize(Container container) {
        Object object = container.getTreeLock();
        synchronized (object) {
            return this.a(container, Component::getPreferredSize);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Dimension minimumLayoutSize(Container container) {
        Object object = container.getTreeLock();
        synchronized (object) {
            return this.a(container, Component::getMinimumSize);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void layoutContainer(Container container) {
        Object object = container.getTreeLock();
        synchronized (object) {
            int n2;
            int n3;
            int n4;
            Insets insets = container.getInsets();
            int n5 = container.getComponentCount();
            int n6 = this.getRows();
            int n7 = this.getColumns();
            if (n5 == 0) {
                return;
            }
            if (n6 > 0) {
                n7 = (n5 + n6 - 1) / n6;
            } else {
                n6 = (n5 + n7 - 1) / n7;
            }
            int n8 = this.getHgap();
            int n9 = this.getVgap();
            Dimension dimension = this.preferredLayoutSize(container);
            Insets insets2 = container.getInsets();
            int n10 = insets2.left + insets2.right;
            int n11 = insets2.top + insets2.bottom;
            double d2 = (1.0 * (double)container.getWidth() - (double)n10) / (double)(dimension.width - n10);
            double d3 = (1.0 * (double)container.getHeight() - (double)n11) / (double)(dimension.height - n11);
            int[] nArray = new int[n7];
            int[] nArray2 = new int[n6];
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = n4 / n7;
                n2 = n4 % n7;
                Component component = container.getComponent(n4);
                Dimension dimension2 = component.getPreferredSize();
                dimension2.width = (int)(d2 * (double)dimension2.width);
                dimension2.height = (int)(d3 * (double)dimension2.height);
                if (nArray[n2] < dimension2.width) {
                    nArray[n2] = dimension2.width;
                }
                if (nArray2[n3] >= dimension2.height) continue;
                nArray2[n3] = dimension2.height;
            }
            n3 = insets.left;
            for (n4 = 0; n4 < n7; ++n4) {
                int n12 = insets.top;
                for (n2 = 0; n2 < n6; ++n2) {
                    int n13 = n2 * n7 + n4;
                    if (n13 < n5) {
                        container.getComponent(n13).setBounds(n3, n12, nArray[n4], nArray2[n2]);
                    }
                    n12 += nArray2[n2] + n9;
                }
                n3 += nArray[n4] + n8;
            }
        }
    }

    private Dimension a(Container container, Function<Component, Dimension> function) {
        int n2;
        int n3;
        int n4;
        int n5 = container.getComponentCount();
        int n6 = this.getRows();
        int n7 = this.getColumns();
        if (n6 > 0) {
            n7 = (n5 + n6 - 1) / n6;
        } else {
            n6 = (n5 + n7 - 1) / n7;
        }
        int[] nArray = new int[n7];
        int[] nArray2 = new int[n6];
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = n4 / n7;
            n2 = n4 % n7;
            Component component = container.getComponent(n4);
            Dimension dimension = function.apply(component);
            if (nArray[n2] < dimension.width) {
                nArray[n2] = dimension.width;
            }
            if (nArray2[n3] >= dimension.height) continue;
            nArray2[n3] = dimension.height;
        }
        n4 = 0;
        for (n3 = 0; n3 < n7; ++n3) {
            n4 += nArray[n3];
        }
        n3 = 0;
        for (n2 = 0; n2 < n6; ++n2) {
            n3 += nArray2[n2];
        }
        Insets insets = container.getInsets();
        return new Dimension(insets.left + insets.right + n4 + (n7 - 1) * this.getHgap(), insets.top + insets.bottom + n3 + (n6 - 1) * this.getVgap());
    }
}

