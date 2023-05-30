/*
 *  Copyright (c) 2022, Oracle and/or its affiliates. All rights reserved.
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *  This code is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License version 2 only, as
 *  published by the Free Software Foundation.  Oracle designates this
 *  particular file as subject to the "Classpath" exception as provided
 *  by Oracle in the LICENSE file that accompanied this code.
 *
 *  This code is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  version 2 for more details (a copy is included in the LICENSE file that
 *  accompanied this code).
 *
 *  You should have received a copy of the GNU General Public License version
 *  2 along with this work; if not, write to the Free Software Foundation,
 *  Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *   Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 *  or visit www.oracle.com if you need additional information or have any
 *  questions.
 */

// Generated by jextract

package org.openjdk.jextract.clang.libclang;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$14 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$14() {}
    static final FunctionDescriptor clang_getCursorSpelling$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("private_flags"),
        MemoryLayout.paddingLayout(4)
    ),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        )
    );
    static final MethodHandle clang_getCursorSpelling$MH = RuntimeHelper.downcallHandle(
        "clang_getCursorSpelling",
        constants$14.clang_getCursorSpelling$FUNC
    );
    static final FunctionDescriptor clang_PrintingPolicy_getProperty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle clang_PrintingPolicy_getProperty$MH = RuntimeHelper.downcallHandle(
        "clang_PrintingPolicy_getProperty",
        constants$14.clang_PrintingPolicy_getProperty$FUNC
    );
    static final FunctionDescriptor clang_PrintingPolicy_setProperty$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle clang_PrintingPolicy_setProperty$MH = RuntimeHelper.downcallHandle(
        "clang_PrintingPolicy_setProperty",
        constants$14.clang_PrintingPolicy_setProperty$FUNC
    );
    static final FunctionDescriptor clang_getCursorPrintingPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        )
    );
    static final MethodHandle clang_getCursorPrintingPolicy$MH = RuntimeHelper.downcallHandle(
        "clang_getCursorPrintingPolicy",
        constants$14.clang_getCursorPrintingPolicy$FUNC
    );
    static final FunctionDescriptor clang_PrintingPolicy_dispose$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_PrintingPolicy_dispose$MH = RuntimeHelper.downcallHandle(
        "clang_PrintingPolicy_dispose",
        constants$14.clang_PrintingPolicy_dispose$FUNC
    );
    static final FunctionDescriptor clang_getCursorPrettyPrinted$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("private_flags"),
        MemoryLayout.paddingLayout(4)
    ),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        ),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_getCursorPrettyPrinted$MH = RuntimeHelper.downcallHandle(
        "clang_getCursorPrettyPrinted",
        constants$14.clang_getCursorPrettyPrinted$FUNC
    );
}


