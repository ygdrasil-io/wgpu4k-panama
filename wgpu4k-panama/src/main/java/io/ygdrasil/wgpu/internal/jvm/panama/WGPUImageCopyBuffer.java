// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang = c:
 * struct WGPUImageCopyBuffer {
 *     const WGPUChainedStruct *nextInChain;
 *     WGPUTextureDataLayout layout;
 *     WGPUBuffer buffer;
 * }
 *}
 */
public class WGPUImageCopyBuffer {

    WGPUImageCopyBuffer() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wgpu_h.C_POINTER.withName("nextInChain"),
            WGPUTextureDataLayout.layout().withName("layout"),
            wgpu_h.C_POINTER.withName("buffer")
    ).withName("WGPUImageCopyBuffer");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout nextInChain$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("nextInChain"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static final AddressLayout nextInChain$layout() {
        return nextInChain$LAYOUT;
    }

    private static final long nextInChain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static final long nextInChain$offset() {
        return nextInChain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static MemorySegment nextInChain(MemorySegment struct) {
        return struct.get(nextInChain$LAYOUT, nextInChain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static void nextInChain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(nextInChain$LAYOUT, nextInChain$OFFSET, fieldValue);
    }

    private static final GroupLayout layout$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("layout"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUTextureDataLayout layout
     *}
     */
    public static final GroupLayout layout$layout() {
        return layout$LAYOUT;
    }

    private static final long layout$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUTextureDataLayout layout
     *}
     */
    public static final long layout$offset() {
        return layout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUTextureDataLayout layout
     *}
     */
    public static MemorySegment layout(MemorySegment struct) {
        return struct.asSlice(layout$OFFSET, layout$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUTextureDataLayout layout
     *}
     */
    public static void layout(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, layout$OFFSET, layout$LAYOUT.byteSize());
    }

    private static final AddressLayout buffer$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("buffer"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUBuffer buffer
     *}
     */
    public static final AddressLayout buffer$layout() {
        return buffer$LAYOUT;
    }

    private static final long buffer$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUBuffer buffer
     *}
     */
    public static final long buffer$offset() {
        return buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUBuffer buffer
     *}
     */
    public static MemorySegment buffer(MemorySegment struct) {
        return struct.get(buffer$LAYOUT, buffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUBuffer buffer
     *}
     */
    public static void buffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffer$LAYOUT, buffer$OFFSET, fieldValue);
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
    public static long sizeof() {
        return layout().byteSize();
    }

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

