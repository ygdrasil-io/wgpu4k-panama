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
 * struct WGPUImageCopyTexture {
 *     const WGPUChainedStruct *nextInChain;
 *     WGPUTexture texture;
 *     uint32_t mipLevel;
 *     WGPUOrigin3D origin;
 *     WGPUTextureAspect aspect;
 * }
 * }
 */
public class WGPUImageCopyTexture {

    WGPUImageCopyTexture() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgpu_h.C_POINTER.withName("nextInChain"),
        wgpu_h.C_POINTER.withName("texture"),
        wgpu_h.C_INT.withName("mipLevel"),
        WGPUOrigin3D.layout().withName("origin"),
        wgpu_h.C_INT.withName("aspect"),
        MemoryLayout.paddingLayout(4)
    ).withName("WGPUImageCopyTexture");

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

    private static final AddressLayout texture$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("texture"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUTexture texture
     * }
     */
    public static final AddressLayout texture$layout() {
        return texture$LAYOUT;
    }

    private static final long texture$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUTexture texture
     * }
     */
    public static final long texture$offset() {
        return texture$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUTexture texture
     * }
     */
    public static MemorySegment texture(MemorySegment struct) {
        return struct.get(texture$LAYOUT, texture$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUTexture texture
     * }
     */
    public static void texture(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(texture$LAYOUT, texture$OFFSET, fieldValue);
    }

    private static final OfInt mipLevel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mipLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t mipLevel
     * }
     */
    public static final OfInt mipLevel$layout() {
        return mipLevel$LAYOUT;
    }

    private static final long mipLevel$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t mipLevel
     * }
     */
    public static final long mipLevel$offset() {
        return mipLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t mipLevel
     * }
     */
    public static int mipLevel(MemorySegment struct) {
        return struct.get(mipLevel$LAYOUT, mipLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t mipLevel
     * }
     */
    public static void mipLevel(MemorySegment struct, int fieldValue) {
        struct.set(mipLevel$LAYOUT, mipLevel$OFFSET, fieldValue);
    }

    private static final GroupLayout origin$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("origin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUOrigin3D origin
     * }
     */
    public static final GroupLayout origin$layout() {
        return origin$LAYOUT;
    }

    private static final long origin$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUOrigin3D origin
     * }
     */
    public static final long origin$offset() {
        return origin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUOrigin3D origin
     * }
     */
    public static MemorySegment origin(MemorySegment struct) {
        return struct.asSlice(origin$OFFSET, origin$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUOrigin3D origin
     * }
     */
    public static void origin(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, origin$OFFSET, origin$LAYOUT.byteSize());
    }

    private static final OfInt aspect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("aspect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUTextureAspect aspect
     * }
     */
    public static final OfInt aspect$layout() {
        return aspect$LAYOUT;
    }

    private static final long aspect$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUTextureAspect aspect
     * }
     */
    public static final long aspect$offset() {
        return aspect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUTextureAspect aspect
     * }
     */
    public static int aspect(MemorySegment struct) {
        return struct.get(aspect$LAYOUT, aspect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUTextureAspect aspect
     * }
     */
    public static void aspect(MemorySegment struct, int fieldValue) {
        struct.set(aspect$LAYOUT, aspect$OFFSET, fieldValue);
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

