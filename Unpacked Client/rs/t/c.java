/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.t;

import gnu.trove.f.b.cc;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.t.a;

public abstract class c<T>
extends a {
    protected final cc<T> h = new cc();
    protected Map<Integer, Map<String, Object>> i = new HashMap<Integer, Map<String, Object>>();
    protected boolean j = !this.e();

    public c(String string, String string2) {
        super(string, string2);
    }

    public abstract T a(int var1, Map<String, Object> var2);

    public void a() {
        try {
            this.h.clear();
            this.i.clear();
            this.i = this.a(this.j);
            if (this.i == null || this.i.keySet() == null) {
                this.i = new HashMap<Integer, Map<String, Object>>();
                return;
            }
            for (int n2 : this.i.keySet()) {
                if (this.h.w_(n2)) continue;
                this.h.a(n2, this.a(n2, this.i.get(n2)));
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public T a(int n2) {
        return (T)this.h.b(n2);
    }

    public boolean b(int n2) {
        return this.h.w_(n2) && this.h.b(n2) != null;
    }

    protected boolean e() {
        return rs.f.a.c();
    }

    protected byte b(Object object) {
        return (byte)((Integer)object).intValue();
    }

    @Override
    protected int[] a(Object object) {
        if (object == null || ((List)object).size() == 0) {
            return null;
        }
        return ((List)object).stream().mapToInt(Integer::intValue).toArray();
    }

    protected int[][] c(Object object) {
        if (object == null || ((List)object).size() == 0) {
            return null;
        }
        List list = (List)object;
        int[][] nArrayArray = new int[list.size()][];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            nArrayArray[i2] = new int[((List)list.get(i2)).size()];
            for (int i3 = 0; i3 < ((List)list.get(i2)).size(); ++i3) {
                nArrayArray[i2][i3] = (Integer)((List)list.get(i2)).get(i3);
            }
        }
        return nArrayArray;
    }

    protected int[][][] d(Object object) {
        List list = (List)object;
        int[][][] nArrayArray = new int[list.size()][][];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            List list2 = (List)list.get(i2);
            int[][] nArrayArray2 = new int[list2.size()][];
            for (int i3 = 0; i3 < list2.size(); ++i3) {
                List list3 = (List)list2.get(i3);
                int[] nArray = new int[list3.size()];
                for (int i4 = 0; i4 < list3.size(); ++i4) {
                    nArray[i4] = (Integer)list3.get(i4);
                }
                nArrayArray2[i3] = nArray;
            }
            nArrayArray[i2] = nArrayArray2;
        }
        return nArrayArray;
    }

    protected String[] e(Object object) {
        return ((List)object).toArray(new String[((List)object).size()]);
    }

    public cc<T> f() {
        return this.h;
    }
}

