// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef void (*WGPUProcRenderPassEncoderSetVertexBuffer)(WGPURenderPassEncoder, uint32_t, WGPUBuffer, uint64_t, uint64_t)
 * }
 */
public class WGPUProcRenderPassEncoderSetVertexBuffer {

    WGPUProcRenderPassEncoderSetVertexBuffer() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment renderPassEncoder, int slot, MemorySegment buffer, long offset, long size);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        wgpu_h.C_POINTER,
        wgpu_h.C_INT,
        wgpu_h.C_POINTER,
        wgpu_h.C_LONG_LONG,
        wgpu_h.C_LONG_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgpu_h.upcallHandle(WGPUProcRenderPassEncoderSetVertexBuffer.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(WGPUProcRenderPassEncoderSetVertexBuffer.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment renderPassEncoder, int slot, MemorySegment buffer, long offset, long size) {
        try {
             DOWN$MH.invokeExact(funcPtr, renderPassEncoder, slot, buffer, offset, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

