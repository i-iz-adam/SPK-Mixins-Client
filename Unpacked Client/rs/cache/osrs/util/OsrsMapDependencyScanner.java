/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.yaml.snakeyaml.LoaderOptions
 *  org.yaml.snakeyaml.Yaml
 *  org.yaml.snakeyaml.constructor.BaseConstructor
 *  org.yaml.snakeyaml.constructor.SafeConstructor
 */
package rs.cache.osrs.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.zip.GZIPInputStream;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import org.yaml.snakeyaml.constructor.SafeConstructor;
import rs.d.r;
import rs.k;
import rs.k_0;
import rs.x.e;
import rs.x.f;

public final class OsrsMapDependencyScanner {
    private final Path a;
    private final c b;
    private final c c;
    private final Map<String, String> d = new HashMap<String, String>();
    private final Map<Integer, List<a>> e = new HashMap<Integer, List<a>>();
    private final Map<String, Set<Integer>> f = new HashMap<String, Set<Integer>>();
    private final Set<String> g = new TreeSet<String>();
    private final Set<Integer> h = new TreeSet<Integer>();
    private final List<String> i = new ArrayList<String>();
    private int j;
    private int k;
    private int l;
    private int m;

    OsrsMapDependencyScanner(Path path, c c2, c c3) {
        this.a = path;
        this.b = c2;
        this.c = c3;
    }

    public static void main(String[] stringArray) {
        if (stringArray.length > 3 || stringArray.length > 0 && stringArray[0].equals("--help")) {
            System.out.println("Usage: OsrsMapDependencyScanner [cache-directory] [maps.yaml] [report.txt]");
            System.out.println("Exit: 0 clean, 1 dependency findings, 2 incomplete scan/setup error.");
            return;
        }
        try {
            int n2;
            Path path = Paths.get(stringArray.length > 0 ? stringArray[0] : (Files.isDirectory(Paths.get("client/cache", new String[0]), new LinkOption[0]) ? "client/cache" : "cache"), new String[0]).toAbsolutePath().normalize();
            Path path2 = stringArray.length > 1 ? Paths.get(stringArray[1], new String[0]) : path.resolve("configs/maps.yaml");
            Path path3 = (stringArray.length > 2 ? Paths.get(stringArray[2], new String[0]) : path.getParent().resolve("dumps/osrs-map-dependencies.txt")).toAbsolutePath().normalize();
            if (path3.startsWith(path) || path3.equals(path2.toAbsolutePath().normalize())) {
                throw new IllegalArgumentException("Report must be outside the cache and must not overwrite maps.yaml");
            }
            try (c c2 = new c(path, "main_file_cache");
                 c c3 = new c(path, "main_file_osrs");){
                OsrsMapDependencyScanner osrsMapDependencyScanner = new OsrsMapDependencyScanner(path, c2, c3);
                osrsMapDependencyScanner.a();
                osrsMapDependencyScanner.a(OsrsMapDependencyScanner.c(path2));
                String string = osrsMapDependencyScanner.a(path2);
                Files.createDirectories(path3.getParent(), new FileAttribute[0]);
                Files.write(path3, string.getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
                System.out.println(string.substring(0, string.indexOf("\n\n")));
                System.out.println("Report: " + String.valueOf(path3));
                n2 = osrsMapDependencyScanner.l > 0 ? 2 : (osrsMapDependencyScanner.i.isEmpty() ? 0 : 1);
            }
            System.exit(n2);
        }
        catch (Exception exception) {
            System.err.println("Scan failed: " + String.valueOf(exception));
            exception.printStackTrace();
            System.exit(2);
        }
    }

    private void a() {
        Path path = this.a.resolve("configs/old_a.dat");
        if (!Files.isReadable(path)) {
            throw new IOException("Missing " + String.valueOf(path));
        }
        rs.cache.osrs.util.a a2 = new rs.cache.osrs.util.a(this);
        byte[] byArray = this.b.a(0, 2, false);
        if (byArray == null) {
            throw new IOException("Missing config archive main_file_cache.idx0:2");
        }
        rs.d.a.a(new f(byArray, "config"), path.toFile(), a2);
        byte[] byArray2 = Files.readAllBytes(this.a.resolve("osrs_config/loc.dat"));
        byte[] byArray3 = Files.readAllBytes(this.a.resolve("osrs_config/loc.idx"));
        byte[] byArray4 = Files.readAllBytes(this.a.resolve("loc.dat"));
        byte[] byArray5 = Files.readAllBytes(this.a.resolve("loc.idx"));
        r.z = new rs.cache.osrs.util.b(this, byArray2, byArray4, byArray3, byArray5);
        r.z.a();
        r.a(r.a.d, byArray2, byArray3);
    }

    void a(Map<Integer, Map<String, Object>> map) {
        for (Map.Entry<Integer, Map<String, Object>> entry : map.entrySet()) {
            Map<String, Object> map2 = entry.getValue();
            if (!"osrs".equalsIgnoreCase(String.valueOf(map2.get("type")))) continue;
            ++this.j;
            int n2 = -1;
            try {
                n2 = OsrsMapDependencyScanner.a(map2, "id");
                int n3 = OsrsMapDependencyScanner.a(map2, "land");
                if (n3 == -1) {
                    ++this.m;
                    continue;
                }
                byte[] byArray = this.c.a(4, n3, true);
                if (byArray == null) {
                    throw new IOException("Missing/unreadable packed landscape osrs.idx4:" + n3);
                }
                int n8 = n2;
                HashSet hashSet = new HashSet();
                OsrsMapDependencyScanner.a(byArray, (int n4, int n5, int n6, int n7) -> {
                    ++this.k;
                    for (a a2 : this.a(n4)) {
                        this.g.add(a2.b);
                        this.h.add(n8);
                        String string = "object=" + n4 + " dependencyObject=" + a2.a + " " + a2.b + " " + a2.c;
                        if (!hashSet.add(string)) continue;
                        int n8 = (n8 >> 8) * 64 + (n5 >> 6 & 0x3F);
                        int n9 = (n8 & 0xFF) * 64 + (n5 & 0x3F);
                        this.i.add("region=" + n8 + " yaml=" + String.valueOf(entry.getKey()) + " land=" + n3 + " group=" + String.valueOf(map2.getOrDefault("group", "")) + " " + string + " example=" + n8 + "," + n9 + "," + (n5 >> 12) + " type=" + n6 + " rotation=" + n7);
                    }
                });
            }
            catch (Exception exception) {
                ++this.l;
                this.i.add("INCOMPLETE region=" + n2 + " yaml=" + String.valueOf(entry.getKey()) + " " + String.valueOf(exception));
            }
        }
        if (this.j == 0) {
            ++this.l;
            this.i.add("INCOMPLETE: No entries with type: osrs were found.");
        }
    }

    private List<a> a(int n2) {
        if (this.e.containsKey(n2)) {
            return this.e.get(n2);
        }
        ArrayList<a> arrayList = new ArrayList<a>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        arrayDeque.add(n2);
        while (!arrayDeque.isEmpty()) {
            int n3 = (Integer)arrayDeque.removeFirst();
            if (n3 == -1 || !hashSet.add(n3)) continue;
            try {
                if (n3 < 0 || n3 >= r.A && !r.z.b(n3)) {
                    arrayList.add(new a(n3, "object:" + n3, "MISSING_DEFINITION"));
                    continue;
                }
                r r2 = r.c(n3);
                if (r2.an != null) {
                    for (int n4 : r2.an) {
                        this.a(arrayList, n3, r2.e(), 1, n4 & 0xFFFF, "model");
                    }
                }
                if (r2.au != -1) {
                    this.a(arrayList, n3, r2.au);
                }
                if (r2.ad == null) continue;
                for (int n4 : r2.ad) {
                    if (n4 == -1) continue;
                    arrayDeque.add(n4);
                }
            }
            catch (Exception exception) {
                ++this.l;
                arrayList.add(new a(n3, "object:" + n3, "DECODE_ERROR " + String.valueOf(exception)));
            }
        }
        this.e.put(n2, arrayList);
        return arrayList;
    }

    private void a(List<a> list, int n2, int n4) {
        String string = "animation:" + n4;
        if (n4 < 0 || n4 >= rs.d.a.a.length || rs.d.a.a[n4] == null) {
            list.add(new a(n2, string, "MISSING_SEQUENCE"));
            return;
        }
        rs.d.a a2 = rs.d.a.a[n4];
        if (a2.b()) {
            int n5 = a2.B >>> 16;
            if (n5 >= 5000) {
                list.add(new a(n2, string, "KEYFRAME_FILE_OUT_OF_CLIENT_BOUNDS " + n5));
            }
            this.a(list, n2, true, 2, n5, "keyframes animation=" + n4);
            if (this.a(true, 2, n5) == null) {
                try {
                    byte[] byArray = this.c.a(2, n5, true);
                    if (byArray.length < 6 || ((byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF) != 420) {
                        list.add(new a(n2, "osrs.idx2:" + n5, "EXPECTED_SKELETAL_KEYFRAMES animation=" + n4));
                    }
                }
                catch (IOException iOException) {
                    throw new UncheckedIOException(iOException);
                }
            }
            return;
        }
        if (a2.e == null || a2.d <= 0 || a2.e.length < a2.d || a2.g == null || a2.g.length < a2.d) {
            list.add(new a(n2, string, "INVALID_SEQUENCE"));
            return;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        HashSet<Object> hashSet = new HashSet<Object>();
        for (int i2 = 0; i2 < a2.d; ++i2) {
            if (a2.e[i2] == -1) continue;
            linkedHashSet.add(a2.e[i2]);
        }
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            Object object;
            int n6 = (Integer)iterator.next();
            int n7 = n6 >>> 16;
            Path path = null;
            if (!a2.w) {
                if (Arrays.stream(rs.k.c).anyMatch(n3 -> n3 == n4)) {
                    path = this.a.resolve("old_osrs_anims/" + n7 + ".dat");
                }
                if (path == null && Arrays.stream(new int[]{3502, 3353, 382, 55780, 13, 57784, 182}).anyMatch(n3 -> n3 == n7)) {
                    path = this.a.resolve("misc/" + n7 + ".dat");
                }
            }
            if (path != null) {
                object = this.a.relativize(path).toString();
                try {
                    if (!this.f.containsKey(object)) {
                        this.f.put((String)object, OsrsMapDependencyScanner.a(Files.readAllBytes(path), false));
                    }
                    if (this.f.get(object).contains(n6 & 0xFFF)) continue;
                    list.add(new a(n2, (String)object + "/" + (n6 & 0xFFF), "MISSING_FRAME animation=" + n4));
                }
                catch (Exception exception) {
                    if (!hashSet.add(object)) continue;
                    list.add(new a(n2, (String)object, "MISSING_OR_INVALID_LEGACY_FRAMES animation=" + n4 + " " + String.valueOf(exception)));
                }
                continue;
            }
            if (n7 >= (a2.w ? 15000 : 4000)) {
                if (!hashSet.add("bounds:" + n7)) continue;
                list.add(new a(n2, string, "FRAME_FILE_OUT_OF_CLIENT_BOUNDS " + n7));
                continue;
            }
            object = (a2.w ? "osrs" : "main") + ".idx2:" + n7;
            String string2 = this.a(a2.w, 2, n7);
            if (string2 != null) {
                if (!hashSet.add(object)) continue;
                list.add(new a(n2, (String)object, string2 + " animation=" + n4));
                continue;
            }
            try {
                if (!this.f.containsKey(object)) {
                    this.f.put((String)object, OsrsMapDependencyScanner.a((a2.w ? this.c : this.b).a(2, n7, true), a2.w));
                }
                if (this.f.get(object).contains(n6 & 0xFFF)) continue;
                list.add(new a(n2, (String)object + "/" + (n6 & 0xFFF), "MISSING_FRAME animation=" + n4));
            }
            catch (Exception exception) {
                String string3 = "FRAME_DECODE_ERROR " + String.valueOf(exception);
                this.d.put((String)object, string3);
                if (!hashSet.add(object)) continue;
                list.add(new a(n2, (String)object, string3 + " animation=" + n4));
            }
        }
    }

    private void a(List<a> list, int n2, boolean bl, int n3, int n4, String string) {
        String string2 = this.a(bl, n3, n4);
        if (string2 != null) {
            list.add(new a(n2, (bl ? "osrs" : "main") + ".idx" + n3 + ":" + n4, string2 + " " + string));
        }
    }

    private String a(boolean bl, int n2, int n3) {
        String string = (bl ? "osrs" : "main") + ".idx" + n2 + ":" + n3;
        if (!this.d.containsKey(string)) {
            Object object = null;
            try {
                byte[] byArray = (bl ? this.c : this.b).a(n2, n3, true);
                if (byArray == null || byArray.length == 0) {
                    object = "MISSING_OR_UNREADABLE";
                }
            }
            catch (IOException iOException) {
                object = "INVALID_GZIP " + iOException.getMessage();
            }
            this.d.put(string, (String)object);
        }
        return this.d.get(string);
    }

    String a(Path path) {
        return "OSRS map dependency scan: " + this.j + " regions, " + this.k + " spawns, " + this.e.size() + " distinct spawned objects\n" + this.h.size() + " affected regions, " + this.g.size() + " distinct problem assets, " + this.l + " incomplete checks\n\nCache: " + String.valueOf(this.a) + "\nMaps: " + String.valueOf(path.toAbsolutePath()) + "\nRegions with land: -1 (no object spawns): " + this.m + "\nChecks all models and morph alternatives, regardless of current varbits/spawn shape.\nUses client object/animation overrides and configs/*.yaml, not serialized production configs.\nAsset IDs: idx1=models; idx2=frame/keyframe files; animation=N is a sequence ID.\nLoose packing directories do not count as packed assets. Model geometry and skeletal content are not decoded.\n\nProblem assets:\n" + String.join((CharSequence)"\n", this.g) + "\n\nFindings (one example spawn per region/root object/dependency):\n" + (this.i.isEmpty() ? "No missing dependencies found." : String.join((CharSequence)"\n", this.i)) + "\n";
    }

    static Set<Integer> a(byte[] byArray, boolean bl) {
        if (byArray.length >= 2 && ((byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF) == 420) {
            throw new IOException("Sequence expects classic frames but file contains skeletal keyframes (magic 420)");
        }
        e e2 = new e(byArray);
        new k_0(e2, bl);
        if (bl) {
            e2.A();
        }
        int n2 = e2.A();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = e2.A();
            if (n3 >= n2 * 3) {
                throw new IOException("Frame index exceeds client allocation: " + n3);
            }
            hashSet.add(n3);
            int n4 = e2.y();
            for (int i3 = 0; i3 < n4; ++i3) {
                int n5 = e2.y();
                for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                    if ((n5 & i4) == 0) continue;
                    e2.x();
                }
            }
        }
        if (e2.h != byArray.length) {
            throw new IOException("Frame data length mismatch");
        }
        return hashSet;
    }

    static void a(byte[] byArray, b b2) {
        e e2 = new e(byArray);
        int n2 = -1;
        try {
            int n3;
            while ((n3 = e2.d()) != 0) {
                int n4;
                n2 = Math.addExact(n2, n3);
                int n5 = 0;
                while ((n4 = e2.e()) != 0) {
                    if ((n5 = Math.addExact(n5, n4 - 1)) >= 16384) {
                        throw new IOException("Landscape location out of bounds");
                    }
                    int n6 = e2.y();
                    b2.accept(n2, n5, n6 >> 2, n6 & 3);
                }
            }
            if (e2.h != byArray.length) {
                throw new IOException("Trailing landscape bytes");
            }
        }
        catch (ArithmeticException | IndexOutOfBoundsException runtimeException) {
            throw new IOException("Truncated/invalid landscape at byte " + e2.h, runtimeException);
        }
    }

    private static int a(Map<String, Object> map, String string) {
        Object object = map.get(string);
        if (!(object instanceof Number)) {
            throw new IllegalArgumentException("Missing/non-numeric " + string);
        }
        return ((Number)object).intValue();
    }

    private static Map<Integer, Map<String, Object>> c(Path path) {
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setMaxAliasesForCollections(200);
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
            Map map = (Map)new Yaml((BaseConstructor)new SafeConstructor(loaderOptions)).load(inputStream);
            if (map == null) {
                throw new IOException("Empty YAML: " + String.valueOf(path));
            }
            TreeMap<Integer, Map<String, Object>> treeMap = new TreeMap<Integer, Map<String, Object>>(map);
            return treeMap;
        }
    }

    static /* synthetic */ Path a(OsrsMapDependencyScanner osrsMapDependencyScanner) {
        return osrsMapDependencyScanner.a;
    }

    static /* synthetic */ Map b(Path path) {
        return OsrsMapDependencyScanner.c(path);
    }

    static final class c
    implements AutoCloseable {
        private final RandomAccessFile a;
        private final Path b;
        private final String c;
        private final Map<Integer, RandomAccessFile> d = new HashMap<Integer, RandomAccessFile>();

        c(Path path, String string) {
            this.b = path;
            this.c = string;
            this.a = new RandomAccessFile(path.resolve(string + ".dat").toFile(), "r");
        }

        byte[] a(int n2, int n3, boolean bl) {
            if (n3 < 0) {
                return null;
            }
            if (!this.d.containsKey(n2)) {
                this.d.put(n2, new RandomAccessFile(this.b.resolve(this.c + ".idx" + n2).toFile(), "r"));
            }
            byte[] byArray = new rs.cache.a(this.a, this.d.get(n2), n2 + 1).a(n3);
            if (!bl || byArray == null || byArray.length == 0) {
                return byArray;
            }
            try (GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(byArray));){
                byte[] byArray2 = gZIPInputStream.readAllBytes();
                return byArray2;
            }
        }

        @Override
        public void close() {
            try {
                for (RandomAccessFile randomAccessFile : this.d.values()) {
                    randomAccessFile.close();
                }
            }
            finally {
                this.a.close();
            }
        }
    }

    static interface b {
        public void accept(int var1, int var2, int var3, int var4);
    }

    private static final class a {
        final int a;
        final String b;
        final String c;

        a(int n2, String string, String string2) {
            this.a = n2;
            this.b = string;
            this.c = string2;
        }
    }
}

