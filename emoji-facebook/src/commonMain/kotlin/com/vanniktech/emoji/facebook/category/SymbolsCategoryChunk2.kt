/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vanniktech.emoji.facebook.category

import com.vanniktech.emoji.facebook.FacebookEmoji
import de.cketti.codepoints.CodePoints

internal object SymbolsCategoryChunk2 {
  internal val EMOJIS: List<FacebookEmoji> = listOf(
    FacebookEmoji(CodePoints.toString(0x1F537), listOf("large_blue_diamond"), 30, 47),
    FacebookEmoji(CodePoints.toString(0x1F538), listOf("small_orange_diamond"), 30, 48),
    FacebookEmoji(CodePoints.toString(0x1F539), listOf("small_blue_diamond"), 30, 49),
    FacebookEmoji(CodePoints.toString(0x1F53A), listOf("small_red_triangle"), 30, 50),
    FacebookEmoji(CodePoints.toString(0x1F53B), listOf("small_red_triangle_down"), 30, 51),
    FacebookEmoji(CodePoints.toString(0x1F4A0), listOf("diamond_shape_with_a_dot_inside"), 28, 16),
    FacebookEmoji(CodePoints.toString(0x1F518), listOf("radio_button"), 30, 16),
    FacebookEmoji(CodePoints.toString(0x1F533), listOf("white_square_button"), 30, 43),
    FacebookEmoji(CodePoints.toString(0x1F532), listOf("black_square_button"), 30, 42),
  )
}
