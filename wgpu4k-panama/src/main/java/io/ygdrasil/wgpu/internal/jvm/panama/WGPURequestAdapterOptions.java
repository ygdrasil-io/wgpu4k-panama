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
 * {@snippet lang = c:
 * struct WGPURequestAdapterOptions {
 *     const WGPUChainedStruct *nextInChain;
 *     WGPUSurface compatibleSurface;
 *     WGPUPowerPreference powerPreference;
 *     WGPUBackendType backendType;
 *     WGPUBool forceFallbackAdapter;
 * }
 *}
 */
public class WGPURequestAdapterOptions {

    WGPURequestAdapterOptions() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wgpu_h.C_POINTER.withName("nextInChain"),
            wgpu_h.C_POINTER.withName("compatibleSurface"),
            wgpu_h.C_INT.withName("powerPreference"),
            wgpu_h.C_INT.withName("backendType"),
            wgpu_h.C_INT.withName("forceFallbackAdapter"),
            MemoryLayout.paddingLayout(4)
    ).withName("WGPURequestAdapterOptions");

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

    private static final AddressLayout compatibleSurface$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("compatibleSurface"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUSurface compatibleSurface
     *}
     */
    public static final AddressLayout compatibleSurface$layout() {
        return compatibleSurface$LAYOUT;
    }

    private static final long compatibleSurface$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUSurface compatibleSurface
     *}
     */
    public static final long compatibleSurface$offset() {
        return compatibleSurface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUSurface compatibleSurface
     *}
     */
    public static MemorySegment compatibleSurface(MemorySegment struct) {
        return struct.get(compatibleSurface$LAYOUT, compatibleSurface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUSurface compatibleSurface
     *}
     */
    public static void compatibleSurface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(compatibleSurface$LAYOUT, compatibleSurface$OFFSET, fieldValue);
    }

    private static final OfInt powerPreference$LAYOUT = (OfInt) $LAYOUT.select(groupElement("powerPreference"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUPowerPreference powerPreference
     *}
     */
    public static final OfInt powerPreference$layout() {
        return powerPreference$LAYOUT;
    }

    private static final long powerPreference$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUPowerPreference powerPreference
     *}
     */
    public static final long powerPreference$offset() {
        return powerPreference$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUPowerPreference powerPreference
     *}
     */
    public static int powerPreference(MemorySegment struct) {
        return struct.get(powerPreference$LAYOUT, powerPreference$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUPowerPreference powerPreference
     *}
     */
    public static void powerPreference(MemorySegment struct, int fieldValue) {
        struct.set(powerPreference$LAYOUT, powerPreference$OFFSET, fieldValue);
    }

    private static final OfInt backendType$LAYOUT = (OfInt) $LAYOUT.select(groupElement("backendType"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUBackendType backendType
     *}
     */
    public static final OfInt backendType$layout() {
        return backendType$LAYOUT;
    }

    private static final long backendType$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUBackendType backendType
     *}
     */
    public static final long backendType$offset() {
        return backendType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUBackendType backendType
     *}
     */
    public static int backendType(MemorySegment struct) {
        return struct.get(backendType$LAYOUT, backendType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUBackendType backendType
     *}
     */
    public static void backendType(MemorySegment struct, int fieldValue) {
        struct.set(backendType$LAYOUT, backendType$OFFSET, fieldValue);
    }

    private static final OfInt forceFallbackAdapter$LAYOUT = (OfInt) $LAYOUT.select(groupElement("forceFallbackAdapter"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUBool forceFallbackAdapter
     *}
     */
    public static final OfInt forceFallbackAdapter$layout() {
        return forceFallbackAdapter$LAYOUT;
    }

    private static final long forceFallbackAdapter$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUBool forceFallbackAdapter
     *}
     */
    public static final long forceFallbackAdapter$offset() {
        return forceFallbackAdapter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUBool forceFallbackAdapter
     *}
     */
    public static int forceFallbackAdapter(MemorySegment struct) {
        return struct.get(forceFallbackAdapter$LAYOUT, forceFallbackAdapter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUBool forceFallbackAdapter
     *}
     */
    public static void forceFallbackAdapter(MemorySegment struct, int fieldValue) {
        struct.set(forceFallbackAdapter$LAYOUT, forceFallbackAdapter$OFFSET, fieldValue);
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

