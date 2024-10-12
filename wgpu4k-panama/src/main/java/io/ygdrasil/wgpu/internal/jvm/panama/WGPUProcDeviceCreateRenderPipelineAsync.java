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
 * typedef WGPUFuture (*WGPUProcDeviceCreateRenderPipelineAsync)(WGPUDevice, const WGPURenderPipelineDescriptor *, WGPUCreateRenderPipelineAsyncCallbackInfo)
 * }
 */
public class WGPUProcDeviceCreateRenderPipelineAsync {

    WGPUProcDeviceCreateRenderPipelineAsync() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        MemorySegment apply(MemorySegment device, MemorySegment descriptor, MemorySegment callbackInfo);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        WGPUFuture.layout(),
        wgpu_h.C_POINTER,
        wgpu_h.C_POINTER,
        WGPUCreateRenderPipelineAsyncCallbackInfo.layout()
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgpu_h.upcallHandle(WGPUProcDeviceCreateRenderPipelineAsync.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(WGPUProcDeviceCreateRenderPipelineAsync.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static MemorySegment invoke(MemorySegment funcPtr, SegmentAllocator alloc,MemorySegment device, MemorySegment descriptor, MemorySegment callbackInfo) {
        try {
            return (MemorySegment) DOWN$MH.invokeExact(funcPtr, alloc, device, descriptor, callbackInfo);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

