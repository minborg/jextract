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
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$18 {

    static final FunctionDescriptor clang_EvalResult_getAsUnsigned$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_EvalResult_getAsUnsigned$MH = RuntimeHelper.downcallHandle(
        "clang_EvalResult_getAsUnsigned",
        constants$18.clang_EvalResult_getAsUnsigned$FUNC
    );
    static final FunctionDescriptor clang_EvalResult_getAsDouble$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_EvalResult_getAsDouble$MH = RuntimeHelper.downcallHandle(
        "clang_EvalResult_getAsDouble",
        constants$18.clang_EvalResult_getAsDouble$FUNC
    );
    static final FunctionDescriptor clang_EvalResult_getAsStr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_EvalResult_getAsStr$MH = RuntimeHelper.downcallHandle(
        "clang_EvalResult_getAsStr",
        constants$18.clang_EvalResult_getAsStr$FUNC
    );
    static final FunctionDescriptor clang_EvalResult_dispose$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_EvalResult_dispose$MH = RuntimeHelper.downcallHandle(
        "clang_EvalResult_dispose",
        constants$18.clang_EvalResult_dispose$FUNC
    );
}


