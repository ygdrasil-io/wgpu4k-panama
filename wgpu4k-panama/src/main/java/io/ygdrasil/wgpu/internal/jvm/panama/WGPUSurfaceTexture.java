// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

/**
 * {@snippet lang = c:
 * struct WGPUSurfaceTexture {
 *     WGPUTexture texture;
 *     WGPUBool suboptimal;
 *     WGPUSurfaceGetCurrentTextureStatus status;
 * }
 *}
 */
public class WGPUSurfaceTexture {

    WGPUSurfaceTexture() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wgpu_h.C_POINTER.withName("texture"),
            wgpu_h.C_INT.withName("suboptimal"),
            wgpu_h.C_INT.withName("status")
    ).withName("WGPUSurfaceTexture");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout texture$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("texture"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUTexture texture
     *}
     */
    public static final AddressLayout texture$layout() {
        return texture$LAYOUT;
    }

    private static final long texture$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUTexture texture
     *}
     */
    public static final long texture$offset() {
        return texture$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUTexture texture
     *}
     */
    public static MemorySegment texture(MemorySegment struct) {
        return struct.get(texture$LAYOUT, texture$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUTexture texture
     *}
     */
    public static void texture(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(texture$LAYOUT, texture$OFFSET, fieldValue);
    }

    private static final OfInt suboptimal$LAYOUT = (OfInt) $LAYOUT.select(groupElement("suboptimal"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUBool suboptimal
     *}
     */
    public static final OfInt suboptimal$layout() {
        return suboptimal$LAYOUT;
    }

    private static final long suboptimal$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUBool suboptimal
     *}
     */
    public static final long suboptimal$offset() {
        return suboptimal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUBool suboptimal
     *}
     */
    public static int suboptimal(MemorySegment struct) {
        return struct.get(suboptimal$LAYOUT, suboptimal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUBool suboptimal
     *}
     */
    public static void suboptimal(MemorySegment struct, int fieldValue) {
        struct.set(suboptimal$LAYOUT, suboptimal$OFFSET, fieldValue);
    }

    private static final OfInt status$LAYOUT = (OfInt) $LAYOUT.select(groupElement("status"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUSurfaceGetCurrentTextureStatus status
     *}
     */
    public static final OfInt status$layout() {
        return status$LAYOUT;
    }

    private static final long status$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUSurfaceGetCurrentTextureStatus status
     *}
     */
    public static final long status$offset() {
        return status$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUSurfaceGetCurrentTextureStatus status
     *}
     */
    public static int status(MemorySegment struct) {
        return struct.get(status$LAYOUT, status$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUSurfaceGetCurrentTextureStatus status
     *}
     */
    public static void status(MemorySegment struct, int fieldValue) {
        struct.set(status$LAYOUT, status$OFFSET, fieldValue);
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

