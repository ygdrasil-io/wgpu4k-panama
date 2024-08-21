// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang = c:
 * struct WGPUVertexAttribute {
 *     WGPUVertexFormat format;
 *     uint64_t offset;
 *     uint32_t shaderLocation;
 * }
 *}
 */
public class WGPUVertexAttribute {

    WGPUVertexAttribute() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wgpu_h.C_INT.withName("format"),
            MemoryLayout.paddingLayout(4),
            wgpu_h.C_LONG_LONG.withName("offset"),
            wgpu_h.C_INT.withName("shaderLocation"),
            MemoryLayout.paddingLayout(4)
    ).withName("WGPUVertexAttribute");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt format$LAYOUT = (OfInt) $LAYOUT.select(groupElement("format"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUVertexFormat format
     *}
     */
    public static final OfInt format$layout() {
        return format$LAYOUT;
    }

    private static final long format$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUVertexFormat format
     *}
     */
    public static final long format$offset() {
        return format$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUVertexFormat format
     *}
     */
    public static int format(MemorySegment struct) {
        return struct.get(format$LAYOUT, format$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUVertexFormat format
     *}
     */
    public static void format(MemorySegment struct, int fieldValue) {
        struct.set(format$LAYOUT, format$OFFSET, fieldValue);
    }

    private static final OfLong offset$LAYOUT = (OfLong) $LAYOUT.select(groupElement("offset"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint64_t offset
     *}
     */
    public static final OfLong offset$layout() {
        return offset$LAYOUT;
    }

    private static final long offset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint64_t offset
     *}
     */
    public static final long offset$offset() {
        return offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint64_t offset
     *}
     */
    public static long offset(MemorySegment struct) {
        return struct.get(offset$LAYOUT, offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint64_t offset
     *}
     */
    public static void offset(MemorySegment struct, long fieldValue) {
        struct.set(offset$LAYOUT, offset$OFFSET, fieldValue);
    }

    private static final OfInt shaderLocation$LAYOUT = (OfInt) $LAYOUT.select(groupElement("shaderLocation"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t shaderLocation
     *}
     */
    public static final OfInt shaderLocation$layout() {
        return shaderLocation$LAYOUT;
    }

    private static final long shaderLocation$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t shaderLocation
     *}
     */
    public static final long shaderLocation$offset() {
        return shaderLocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t shaderLocation
     *}
     */
    public static int shaderLocation(MemorySegment struct) {
        return struct.get(shaderLocation$LAYOUT, shaderLocation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t shaderLocation
     *}
     */
    public static void shaderLocation(MemorySegment struct, int fieldValue) {
        struct.set(shaderLocation$LAYOUT, shaderLocation$OFFSET, fieldValue);
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

