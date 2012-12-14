/*
 * Copyright 1998-2007 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

/* @test
 * @summary Error: Parse Exception: No class provided for `main'
 * @run main
 */

/* @test
 * @summary Error: Parse Exception: Arguments to `manual' option not supported:  bad_arg
 * @run main/manual=bad_arg BadTag
 */

/* @test
 * @summary Error: Parse Exception: Bad integer specification: bruno
 * @run main/timeout=bruno BadTag
 */

/* @test
 * @summary Error: Parse Exception: Bad option for main: bad_opt
 * @run main/bad_opt BadTag
 */

/* @test
 * @summary Error: Parse Exception: -vmopt: vm option(s) found, need to specify /othervm
 * @run main -vmopt BadTag
 */

/* @test
 * @summary Error: Parse Exception: No class provided for `main'
 * @run main/othervm -vmopt
 */

// NOTE: The following two tests should fail for different reasons when the test
// version of JDK is changed to JDK1.2.

/* @test
 * @summary Error: Parse Exception: Option not allowed using provided test JDK: secure
 * @run main/secure=secure BadTag
 */

/* @test
 * @summary Error: Parse Exception: Option not allowed using provided test JDK: policy
 * @run main/policy=strict.policy BadTag
 */
