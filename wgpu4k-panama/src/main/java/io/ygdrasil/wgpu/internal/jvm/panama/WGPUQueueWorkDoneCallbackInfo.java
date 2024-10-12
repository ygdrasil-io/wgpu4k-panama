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
 * struct WGPUQueueWorkDoneCallbackInfo {
 *     const WGPUChainedStruct *nextInChain;
 *     WGPUQueueWorkDoneCallback callback;
 *     void *userdata1;
 *     void *userdata2;
 * }
 * }
 */
public class WGPUQueueWorkDoneCallbackInfo {

    WGPUQueueWorkDoneCallbackInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgpu_h.C_POINTER.withName("nextInChain"),
        wgpu_h.C_POINTER.withName("callback"),
        wgpu_h.C_POINTER.withName("userdata1"),
        wgpu_h.C_POINTER.withName("userdata2")
    ).withName("WGPUQueueWorkDoneCallbackInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout nextInChain$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("nextInChain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static final AddressLayout nextInChain$layout() {
        return nextInChain$LAYOUT;
    }

    private static final long nextInChain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static final long nextInChain$offset() {
        return nextInChain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static MemorySegment nextInChain(MemorySegment struct) {
        return struct.get(nextInChain$LAYOUT, nextInChain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static void nextInChain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(nextInChain$LAYOUT, nextInChain$OFFSET, fieldValue);
    }

    private static final AddressLayout callback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("callback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUQueueWorkDoneCallback callback
     * }
     */
    public static final AddressLayout callback$layout() {
        return callback$LAYOUT;
    }

    private static final long callback$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUQueueWorkDoneCallback callback
     * }
     */
    public static final long callback$offset() {
        return callback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUQueueWorkDoneCallback callback
     * }
     */
    public static MemorySegment callback(MemorySegment struct) {
        return struct.get(callback$LAYOUT, callback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUQueueWorkDoneCallback callback
     * }
     */
    public static void callback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(callback$LAYOUT, callback$OFFSET, fieldValue);
    }

    private static final AddressLayout userdata1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("userdata1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *userdata1
     * }
     */
    public static final AddressLayout userdata1$layout() {
        return userdata1$LAYOUT;
    }

    private static final long userdata1$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *userdata1
     * }
     */
    public static final long userdata1$offset() {
        return userdata1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *userdata1
     * }
     */
    public static MemorySegment userdata1(MemorySegment struct) {
        return struct.get(userdata1$LAYOUT, userdata1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *userdata1
     * }
     */
    public static void userdata1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(userdata1$LAYOUT, userdata1$OFFSET, fieldValue);
    }

    private static final AddressLayout userdata2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("userdata2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *userdata2
     * }
     */
    public static final AddressLayout userdata2$layout() {
        return userdata2$LAYOUT;
    }

    private static final long userdata2$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *userdata2
     * }
     */
    public static final long userdata2$offset() {
        return userdata2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *userdata2
     * }
     */
    public static MemorySegment userdata2(MemorySegment struct) {
        return struct.get(userdata2$LAYOUT, userdata2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *userdata2
     * }
     */
    public static void userdata2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(userdata2$LAYOUT, userdata2$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

