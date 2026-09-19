/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import rs.d.x;
import rs.v.a;

public class z {
    private static int[] a(ArrayList<Integer> arrayList) {
        int[] nArray = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            nArray[i2] = arrayList.get(i2);
        }
        return nArray;
    }

    public static x[] a(x[] xArray) {
        try {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(a.f() + "/configs/old_g.dat"));
            int n2 = -1;
            while ((string = bufferedReader.readLine()) != null) {
                String string2;
                ArrayList<Integer> arrayList;
                String[] stringArray = string.split(" ");
                if (string.toLowerCase().contains("graphic ")) {
                    n2 = Integer.parseInt(stringArray[1]);
                    continue;
                }
                if (n2 == -1) continue;
                if (string.contains("data:")) {
                    arrayList = new ArrayList<Integer>();
                    string2 = stringArray[1];
                    for (String string3 : string2.split(",")) {
                        arrayList.add(Integer.parseInt(string3));
                    }
                    int[] nArray = z.a(arrayList);
                    xArray[n2].e = nArray[0];
                    xArray[n2].f = nArray[1];
                    xArray[n2].j = nArray[2];
                    xArray[n2].k = nArray[3];
                    xArray[n2].l = nArray[4];
                    xArray[n2].m = nArray[5];
                    xArray[n2].n = nArray[6];
                    xArray[n2].g = rs.d.a.a[xArray[n2].f];
                    continue;
                }
                if (!string.contains("arr1:") && !string.contains("arr2:")) continue;
                arrayList = new ArrayList();
                string2 = stringArray[1];
                for (String string3 : string2.split(",")) {
                    arrayList.add(Integer.parseInt(string3));
                }
                if (string.contains("arr2:")) {
                    xArray[n2].i = z.a(arrayList);
                    continue;
                }
                xArray[n2].h = z.a(arrayList);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return xArray;
    }
}

