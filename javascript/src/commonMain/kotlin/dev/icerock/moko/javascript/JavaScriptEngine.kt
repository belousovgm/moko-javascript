/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.javascript

expect class JavaScriptEngine() {
    /**
     * Evaluate some [script].
     *
     * @throws JavaScriptEvaluationException in case of an error in the engine evaluation or if the
     * engine has already been closed.
     */
    fun evaluate(context: Map<String, JsType>, script: String): JsType

    /**
     * Set some [context] with external [context].
     */
    fun setContextObjects(vararg context: Pair<String, Any>)

    /**
     * Closes the engine and releases the allocated memory.
     */
    fun close()

}
