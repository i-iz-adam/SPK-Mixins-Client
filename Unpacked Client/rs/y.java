/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import rs.v.a;

public class y {
    private static int[] a(ArrayList<Integer> arrayList) {
        int[] nArray = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            nArray[i2] = arrayList.get(i2);
        }
        return nArray;
    }

    public static rs.d.a[] a(rs.d.a[] aArray) {
        return y.a(aArray, new File(a.f(), "configs/old_a.dat"));
    }

    public static rs.d.a[] a(rs.d.a[] aArray, File file) {
        rs.d.a[] aArray2 = new rs.d.a[aArray.length];
        for (int i2 = 0; i2 < aArray2.length; ++i2) {
            if (aArray[i2] == null) continue;
            aArray2[i2] = new rs.d.a(aArray[i2]);
        }
        try {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            int n2 = -1;
            while ((string = bufferedReader.readLine()) != null) {
                String string2;
                ArrayList<Integer> arrayList;
                String[] stringArray = string.split(" ");
                if (string.toLowerCase().contains("anim ")) {
                    n2 = Integer.parseInt(stringArray[1]);
                    continue;
                }
                if (n2 == -1) continue;
                if (string.contains("arr1:")) {
                    arrayList = new ArrayList<Integer>();
                    string2 = stringArray[1];
                    for (String string3 : string2.split(",")) {
                        arrayList.add(Integer.parseInt(string3));
                    }
                    aArray2[n2].g = y.a(arrayList);
                    continue;
                }
                if (string.contains("arr2:")) {
                    arrayList = new ArrayList();
                    string2 = stringArray[1];
                    for (String string3 : string2.split(",")) {
                        arrayList.add(Integer.parseInt(string3));
                    }
                    aArray2[n2].e = y.a(arrayList);
                    continue;
                }
                if (!string.contains("other:")) continue;
                aArray2[n2].o = Integer.parseInt(stringArray[1]);
                aArray2[n2].p = Integer.parseInt(stringArray[2]);
                aArray2[n2].k = Integer.parseInt(stringArray[3]);
                aArray2[n2].d = Integer.parseInt(stringArray[4]);
                n2 = -1;
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return aArray2;
    }
}

