/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.rlawt.AWTContext
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.opencl.APPLEGLSharing
 *  org.lwjgl.opencl.CL
 *  org.lwjgl.opencl.CL10
 *  org.lwjgl.opencl.CL10GL
 *  org.lwjgl.opencl.CL11
 *  org.lwjgl.opencl.CL12
 *  org.lwjgl.opencl.CLCapabilities
 *  org.lwjgl.opencl.CLContextCallback
 *  org.lwjgl.opencl.CLContextCallbackI
 *  org.lwjgl.system.Configuration
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.k;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import javax.inject.Singleton;
import net.runelite.rlawt.AWTContext;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opencl.APPLEGLSharing;
import org.lwjgl.opencl.CL;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL10GL;
import org.lwjgl.opencl.CL11;
import org.lwjgl.opencl.CL12;
import org.lwjgl.opencl.CLCapabilities;
import org.lwjgl.opencl.CLContextCallback;
import org.lwjgl.opencl.CLContextCallbackI;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.k.a;
import rs.k.j;

@Singleton
class k {
    private static final Logger b = LoggerFactory.getLogger(k.class);
    private static final String c = "computeUnordered";
    private static final String d = "computeLarge";
    private static final int e = 256;
    private static final int f = 512;
    private static final int g = 6144;
    private static final int h = 43;
    private boolean i;
    private int j;
    private int k;
    private long l = -1L;
    long a;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;

    k() {
    }

    void a(AWTContext aWTContext) {
        CL.create();
        this.i = true;
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            if (rs.k.j.a() == rs.k.j.b) {
                this.b(aWTContext, memoryStack);
            } else {
                this.a(aWTContext, memoryStack);
            }
            this.c();
            this.d();
            this.a(memoryStack);
        }
    }

    void a() {
        if (!this.i) {
            return;
        }
        try {
            CL12.clReleaseKernel((long)this.q);
            CL12.clReleaseKernel((long)this.r);
            CL12.clReleaseKernel((long)this.s);
            CL12.clReleaseProgram((long)this.n);
            CL12.clReleaseProgram((long)this.o);
            CL12.clReleaseProgram((long)this.p);
            CL12.clReleaseCommandQueue((long)this.m);
            CL12.clReleaseContext((long)this.a);
            CL12.clReleaseDevice((long)this.l);
        }
        finally {
            CL.destroy();
            this.i = false;
        }
    }

    private void a(AWTContext aWTContext, MemoryStack memoryStack) {
        IntBuffer intBuffer = memoryStack.mallocInt(1);
        rs.k.k.a(CL11.clGetPlatformIDs(null, (IntBuffer)intBuffer));
        if (intBuffer.get(0) == 0) {
            throw new RuntimeException("No OpenCL platforms found.");
        }
        PointerBuffer pointerBuffer = memoryStack.mallocPointer(intBuffer.get(0));
        rs.k.k.a(CL11.clGetPlatformIDs((PointerBuffer)pointerBuffer, (IntBuffer)null));
        PointerBuffer pointerBuffer2 = memoryStack.mallocPointer(7);
        if (rs.k.j.a() == rs.k.j.a) {
            pointerBuffer2.put(4228L).put(0L).put(8200L).put(aWTContext.getGLContext()).put(8203L).put(aWTContext.getWGLHDC()).put(0L).flip();
        } else if (rs.k.j.a() == rs.k.j.c) {
            pointerBuffer2.put(4228L).put(0L).put(8200L).put(aWTContext.getGLContext()).put(8202L).put(aWTContext.getGLXDisplay()).put(0L).flip();
        } else {
            throw new RuntimeException("unsupported platform");
        }
        for (int i2 = 0; i2 < pointerBuffer.capacity(); ++i2) {
            long l6 = pointerBuffer.get(i2);
            pointerBuffer2.put(1, l6);
            try {
                CLCapabilities cLCapabilities = CL.createPlatformCapabilities((long)l6);
                b.debug("Platform profile: {}", (Object)rs.k.k.a(l6, 2304));
                b.debug("Platform version: {}", (Object)rs.k.k.a(l6, 2305));
                b.debug("Platform name: {}", (Object)rs.k.k.a(l6, 2306));
                b.debug("Platform vendor: {}", (Object)rs.k.k.a(l6, 2307));
                b.debug("Platform extensions: {}", (Object)rs.k.k.a(l6, 2308));
                rs.k.k.a(CL11.clGetDeviceIDs((long)l6, (long)4L, null, (IntBuffer)intBuffer));
                PointerBuffer pointerBuffer3 = memoryStack.mallocPointer(intBuffer.get(0));
                rs.k.k.a(CL11.clGetDeviceIDs((long)l6, (long)4L, (PointerBuffer)pointerBuffer3, (IntBuffer)null));
                for (int i3 = 0; i3 < pointerBuffer3.capacity(); ++i3) {
                    long l7 = pointerBuffer3.get(i3);
                    try {
                        CLCapabilities cLCapabilities2 = CL.createDeviceCapabilities((long)l7, (CLCapabilities)cLCapabilities);
                        b.debug("Device id {}", (Object)l7);
                        b.debug("\tCL_DEVICE_NAME: {}", (Object)rs.k.k.e(l7, 4139));
                        b.debug("\tCL_DEVICE_VENDOR: {}", (Object)rs.k.k.e(l7, 4140));
                        b.debug("\tCL_DRIVER_VERSION: {}", (Object)rs.k.k.e(l7, 4141));
                        b.debug("\tCL_DEVICE_PROFILE: {}", (Object)rs.k.k.e(l7, 4142));
                        b.debug("\tCL_DEVICE_VERSION: {}", (Object)rs.k.k.e(l7, 4143));
                        b.debug("\tCL_DEVICE_EXTENSIONS: {}", (Object)rs.k.k.e(l7, 4144));
                        b.debug("\tCL_DEVICE_TYPE: {}", (Object)rs.k.k.b(l7, 4096));
                        b.debug("\tCL_DEVICE_VENDOR_ID: {}", (Object)rs.k.k.c(l7, 4097));
                        b.debug("\tCL_DEVICE_MAX_COMPUTE_UNITS: {}", (Object)rs.k.k.c(l7, 4098));
                        b.debug("\tCL_DEVICE_MAX_WORK_ITEM_DIMENSIONS: {}", (Object)rs.k.k.c(l7, 4099));
                        b.debug("\tCL_DEVICE_MAX_WORK_GROUP_SIZE: {}", (Object)rs.k.k.d(l7, 4100));
                        b.debug("\tCL_DEVICE_MAX_CLOCK_FREQUENCY: {}", (Object)rs.k.k.c(l7, 4108));
                        b.debug("\tCL_DEVICE_ADDRESS_BITS: {}", (Object)rs.k.k.c(l7, 4109));
                        b.debug("\tCL_DEVICE_AVAILABLE: {}", (Object)(rs.k.k.c(l7, 4135) != 0 ? 1 : 0));
                        b.debug("\tCL_DEVICE_COMPILER_AVAILABLE: {}", (Object)(rs.k.k.c(l7, 4136) != 0 ? 1 : 0));
                        if (!cLCapabilities2.cl_khr_gl_sharing && !cLCapabilities2.cl_APPLE_gl_sharing) continue;
                        IntBuffer intBuffer2 = memoryStack.callocInt(1);
                        long l8 = CL11.clCreateContext((PointerBuffer)pointerBuffer2, (long)l7, (CLContextCallbackI)CLContextCallback.create((l2, l3, l4, l5) -> b.error("[LWJGL] cl_context_callback: {}", (Object)MemoryUtil.memUTF8((long)l2))), (long)0L, (IntBuffer)intBuffer2);
                        rs.k.k.a(intBuffer2);
                        this.l = l7;
                        this.a = l8;
                        return;
                    }
                    catch (Exception exception) {
                        b.error("error checking device", (Throwable)exception);
                    }
                }
                continue;
            }
            catch (Exception exception) {
                b.error("error checking platform", (Throwable)exception);
            }
        }
        throw new RuntimeException("Unable to find compute platform");
    }

    private void b(AWTContext aWTContext, MemoryStack memoryStack) {
        PointerBuffer pointerBuffer = memoryStack.mallocPointer(3);
        pointerBuffer.put(0x10000000L).put(aWTContext.getCGLShareGroup()).put(0L).flip();
        IntBuffer intBuffer = memoryStack.callocInt(1);
        PointerBuffer pointerBuffer2 = memoryStack.mallocPointer(0);
        long l6 = CL11.clCreateContext((PointerBuffer)pointerBuffer, (PointerBuffer)pointerBuffer2, (CLContextCallbackI)CLContextCallback.create((l2, l3, l4, l5) -> b.error("[LWJGL] cl_context_callback: {}", (Object)MemoryUtil.memUTF8((long)l2))), (long)0L, (IntBuffer)intBuffer);
        rs.k.k.a(intBuffer);
        PointerBuffer pointerBuffer3 = memoryStack.mallocPointer(1);
        rs.k.k.a(APPLEGLSharing.clGetGLContextInfoAPPLE((long)l6, (long)aWTContext.getGLContext(), (int)0x10000002, (PointerBuffer)pointerBuffer3, null));
        long l7 = pointerBuffer3.get(0);
        b.debug("Got macOS CLGL compute device {}", (Object)l7);
        this.a = l6;
        this.l = l7;
    }

    private void c() {
        long[] lArray = new long[1];
        CL12.clGetDeviceInfo((long)this.l, (int)4100, (long[])lArray, null);
        b.debug("Device CL_DEVICE_MAX_WORK_GROUP_SIZE: {}", (Object)lArray[0]);
        if (lArray[0] < 256L) {
            throw new RuntimeException("Compute device does not support min work group size 256");
        }
        int n2 = Integer.MIN_VALUE >>> Integer.numberOfLeadingZeros((int)lArray[0]);
        this.j = 6144 / Math.min(n2, 6144);
        this.k = 512 / Math.min(n2, 512);
        b.debug("Face counts: small: {}, large: {}", (Object)this.k, (Object)this.j);
    }

    private void d() {
        long[] lArray = new long[1];
        CL12.clGetDeviceInfo((long)this.l, (int)4138, (long[])lArray, null);
        this.m = CL12.clCreateCommandQueue((long)this.a, (long)this.l, (long)(lArray[0] & 1L), (int[])null);
        b.debug("Created command_queue {}, properties {}", (Object)this.m, (Object)(lArray[0] & 1L));
    }

    private long a(MemoryStack memoryStack, String string) {
        b.trace("Compiling program:\n {}", (Object)string);
        IntBuffer intBuffer = memoryStack.callocInt(1);
        long l2 = CL12.clCreateProgramWithSource((long)this.a, (CharSequence)string, (IntBuffer)intBuffer);
        rs.k.k.a(intBuffer);
        int n2 = CL12.clBuildProgram((long)l2, (long)this.l, (CharSequence)"", null, (long)0L);
        if (n2 != 0) {
            String string2 = rs.k.k.b(l2, this.l, 4483);
            throw new RuntimeException(string2);
        }
        b.debug("Build status: {}", (Object)rs.k.k.a(l2, this.l, 4481));
        b.debug("Binary type: {}", (Object)rs.k.k.a(l2, this.l, 4484));
        b.debug("Build options: {}", (Object)rs.k.k.b(l2, this.l, 4482));
        b.debug("Build log: {}", (Object)rs.k.k.b(l2, this.l, 4483));
        return l2;
    }

    private long a(MemoryStack memoryStack, long l2, String string) {
        IntBuffer intBuffer = memoryStack.callocInt(1);
        long l3 = CL12.clCreateKernel((long)l2, (CharSequence)string, (IntBuffer)intBuffer);
        rs.k.k.a(intBuffer);
        b.debug("Loaded kernel {} for program {}", (Object)string, (Object)l2);
        return l3;
    }

    private void a(MemoryStack memoryStack) {
        rs.k.d.a a2 = new rs.k.d.a().a(k.class).a((String string) -> string.equals("FACE_COUNT") ? "#define FACE_COUNT " + this.k : null);
        rs.k.d.a a3 = new rs.k.d.a().a(k.class).a((String string) -> string.equals("FACE_COUNT") ? "#define FACE_COUNT " + this.j : null);
        String string2 = new rs.k.d.a().a(k.class).b("comp_unordered.cl");
        String string3 = a2.b("comp.cl");
        String string4 = a3.b("comp.cl");
        this.n = this.a(memoryStack, string2);
        this.o = this.a(memoryStack, string3);
        this.p = this.a(memoryStack, string4);
        this.q = this.a(memoryStack, this.n, c);
        this.r = this.a(memoryStack, this.o, d);
        this.s = this.a(memoryStack, this.p, d);
    }

    void a(int n2, int n3, int n4, a a2, a a3, a a4, a a5, a a6, a a7, a a8, a a9, a a10, a a11) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(10);
            pointerBuffer.put(a2.d);
            pointerBuffer.put(a3.d);
            pointerBuffer.put(a6.d);
            pointerBuffer.put(a7.d);
            pointerBuffer.put(a8.d);
            pointerBuffer.put(a4.d);
            pointerBuffer.put(a5.d);
            pointerBuffer.put(a9.d);
            pointerBuffer.put(a10.d);
            pointerBuffer.put(a11.d);
            pointerBuffer.flip();
            PointerBuffer pointerBuffer2 = memoryStack.mallocPointer(1);
            CL10GL.clEnqueueAcquireGLObjects((long)this.m, (PointerBuffer)pointerBuffer, null, (PointerBuffer)pointerBuffer2);
            PointerBuffer pointerBuffer3 = memoryStack.mallocPointer(3);
            if (n2 > 0) {
                CL12.clSetKernelArg1p((long)this.q, (int)0, (long)a6.d);
                CL12.clSetKernelArg1p((long)this.q, (int)1, (long)a2.d);
                CL12.clSetKernelArg1p((long)this.q, (int)2, (long)a4.d);
                CL12.clSetKernelArg1p((long)this.q, (int)3, (long)a3.d);
                CL12.clSetKernelArg1p((long)this.q, (int)4, (long)a5.d);
                CL12.clSetKernelArg1p((long)this.q, (int)5, (long)a9.d);
                CL12.clSetKernelArg1p((long)this.q, (int)6, (long)a10.d);
                CL12.clEnqueueNDRangeKernel((long)this.m, (long)this.q, (int)1, null, (PointerBuffer)memoryStack.pointers((long)n2 * 6L), (PointerBuffer)memoryStack.pointers(6L), (PointerBuffer)pointerBuffer2, (PointerBuffer)pointerBuffer3);
                pointerBuffer3.position(pointerBuffer3.position() + 1);
            }
            if (n3 > 0) {
                CL12.clSetKernelArg((long)this.r, (int)0, (long)2220L);
                CL12.clSetKernelArg1p((long)this.r, (int)1, (long)a7.d);
                CL12.clSetKernelArg1p((long)this.r, (int)2, (long)a2.d);
                CL12.clSetKernelArg1p((long)this.r, (int)3, (long)a4.d);
                CL12.clSetKernelArg1p((long)this.r, (int)4, (long)a3.d);
                CL12.clSetKernelArg1p((long)this.r, (int)5, (long)a5.d);
                CL12.clSetKernelArg1p((long)this.r, (int)6, (long)a9.d);
                CL12.clSetKernelArg1p((long)this.r, (int)7, (long)a10.d);
                CL12.clSetKernelArg1p((long)this.r, (int)8, (long)a11.d);
                CL12.clEnqueueNDRangeKernel((long)this.m, (long)this.r, (int)1, null, (PointerBuffer)memoryStack.pointers((long)(n3 * (512 / this.k))), (PointerBuffer)memoryStack.pointers((long)(512 / this.k)), (PointerBuffer)pointerBuffer2, (PointerBuffer)pointerBuffer3);
                pointerBuffer3.position(pointerBuffer3.position() + 1);
            }
            if (n4 > 0) {
                CL12.clSetKernelArg((long)this.s, (int)0, (long)24748L);
                CL12.clSetKernelArg1p((long)this.s, (int)1, (long)a8.d);
                CL12.clSetKernelArg1p((long)this.s, (int)2, (long)a2.d);
                CL12.clSetKernelArg1p((long)this.s, (int)3, (long)a4.d);
                CL12.clSetKernelArg1p((long)this.s, (int)4, (long)a3.d);
                CL12.clSetKernelArg1p((long)this.s, (int)5, (long)a5.d);
                CL12.clSetKernelArg1p((long)this.s, (int)6, (long)a9.d);
                CL12.clSetKernelArg1p((long)this.s, (int)7, (long)a10.d);
                CL12.clSetKernelArg1p((long)this.s, (int)8, (long)a11.d);
                CL12.clEnqueueNDRangeKernel((long)this.m, (long)this.s, (int)1, null, (PointerBuffer)memoryStack.pointers((long)(n4 * (6144 / this.j))), (PointerBuffer)memoryStack.pointers((long)(6144 / this.j)), (PointerBuffer)pointerBuffer2, (PointerBuffer)pointerBuffer3);
                pointerBuffer3.position(pointerBuffer3.position() + 1);
            }
            if (pointerBuffer3.position() == 0) {
                CL10GL.clEnqueueReleaseGLObjects((long)this.m, (PointerBuffer)pointerBuffer, null, null);
            } else {
                pointerBuffer3.flip();
                CL10GL.clEnqueueReleaseGLObjects((long)this.m, (PointerBuffer)pointerBuffer, (PointerBuffer)pointerBuffer3, null);
            }
        }
    }

    void b() {
        CL12.clFinish((long)this.m);
    }

    private static String a(long l2, int n2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            rs.k.k.a(CL10.clGetPlatformInfo((long)l2, (int)n2, (ByteBuffer)null, (PointerBuffer)pointerBuffer));
            int n3 = (int)pointerBuffer.get(0);
            ByteBuffer byteBuffer = memoryStack.malloc(n3);
            rs.k.k.a(CL10.clGetPlatformInfo((long)l2, (int)n2, (ByteBuffer)byteBuffer, null));
            String string = MemoryUtil.memUTF8((ByteBuffer)byteBuffer, (int)(n3 - 1));
            return string;
        }
    }

    private static long b(long l2, int n2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            LongBuffer longBuffer = memoryStack.mallocLong(1);
            rs.k.k.a(CL11.clGetDeviceInfo((long)l2, (int)n2, (LongBuffer)longBuffer, null));
            long l3 = longBuffer.get(0);
            return l3;
        }
    }

    private static int c(long l2, int n2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            rs.k.k.a(CL11.clGetDeviceInfo((long)l2, (int)n2, (IntBuffer)intBuffer, null));
            int n3 = intBuffer.get(0);
            return n3;
        }
    }

    private static long d(long l2, int n2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            rs.k.k.a(CL11.clGetDeviceInfo((long)l2, (int)n2, (PointerBuffer)pointerBuffer, null));
            long l3 = pointerBuffer.get(0);
            return l3;
        }
    }

    private static String e(long l2, int n2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            rs.k.k.a(CL11.clGetDeviceInfo((long)l2, (int)n2, (ByteBuffer)null, (PointerBuffer)pointerBuffer));
            int n3 = (int)pointerBuffer.get(0);
            ByteBuffer byteBuffer = memoryStack.malloc(n3);
            rs.k.k.a(CL11.clGetDeviceInfo((long)l2, (int)n2, (ByteBuffer)byteBuffer, null));
            String string = MemoryUtil.memUTF8((ByteBuffer)byteBuffer, (int)(n3 - 1));
            return string;
        }
    }

    private static int a(long l2, long l3, int n2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            rs.k.k.a(CL10.clGetProgramBuildInfo((long)l2, (long)l3, (int)n2, (IntBuffer)intBuffer, null));
            int n3 = intBuffer.get(0);
            return n3;
        }
    }

    private static String b(long l2, long l3, int n2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            rs.k.k.a(CL10.clGetProgramBuildInfo((long)l2, (long)l3, (int)n2, (ByteBuffer)null, (PointerBuffer)pointerBuffer));
            int n3 = (int)pointerBuffer.get(0);
            ByteBuffer byteBuffer = memoryStack.malloc(n3);
            rs.k.k.a(CL10.clGetProgramBuildInfo((long)l2, (long)l3, (int)n2, (ByteBuffer)byteBuffer, null));
            String string = MemoryUtil.memASCII((ByteBuffer)byteBuffer, (int)(n3 - 1));
            return string;
        }
    }

    private static void a(IntBuffer intBuffer) {
        rs.k.k.a(intBuffer.get(intBuffer.position()));
    }

    private static void a(int n2) {
        if (n2 != 0) {
            throw new RuntimeException(String.format("OpenCL error [%d]", n2));
        }
    }

    static {
        Configuration.OPENCL_EXPLICIT_INIT.set((Object)true);
    }
}

