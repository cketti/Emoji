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

package com.vanniktech.emoji.androidxemoji2.category

import com.vanniktech.emoji.androidxemoji2.AndroidxEmoji2
import de.cketti.codepoints.CodePoints

internal object SymbolsCategoryChunk2 {
  internal val EMOJIS: List<AndroidxEmoji2> = listOf(
    AndroidxEmoji2(CodePoints.toString(0x1F7E8), listOf("large_yellow_square")),
    AndroidxEmoji2(CodePoints.toString(0x1F7E9), listOf("large_green_square")),
    AndroidxEmoji2(CodePoints.toString(0x1F7E6), listOf("large_blue_square")),
    AndroidxEmoji2(CodePoints.toString(0x1F7EA), listOf("large_purple_square")),
    AndroidxEmoji2(CodePoints.toString(0x1F7EB), listOf("large_brown_square")),
    AndroidxEmoji2(CodePoints.toString(0x2B1B), listOf("black_large_square")),
    AndroidxEmoji2(CodePoints.toString(0x2B1C), listOf("white_large_square")),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x25FC),
      shortcodes = listOf("black_medium_square"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x25FC, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x25FB),
      shortcodes = listOf("white_medium_square"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x25FB, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(CodePoints.toString(0x25FE), listOf("black_medium_small_square")),
    AndroidxEmoji2(CodePoints.toString(0x25FD), listOf("white_medium_small_square")),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x25AA),
      shortcodes = listOf("black_small_square"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x25AA, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(
      unicode = CodePoints.toString(0x25AB),
      shortcodes = listOf("white_small_square"),
      variants = listOf(
        AndroidxEmoji2(CodePoints.toString(0x25AB, 0xFE0F), emptyList()),
      ),
    ),
    AndroidxEmoji2(CodePoints.toString(0x1F536), listOf("large_orange_diamond")),
    AndroidxEmoji2(CodePoints.toString(0x1F537), listOf("large_blue_diamond")),
    AndroidxEmoji2(CodePoints.toString(0x1F538), listOf("small_orange_diamond")),
    AndroidxEmoji2(CodePoints.toString(0x1F539), listOf("small_blue_diamond")),
    AndroidxEmoji2(CodePoints.toString(0x1F53A), listOf("small_red_triangle")),
    AndroidxEmoji2(CodePoints.toString(0x1F53B), listOf("small_red_triangle_down")),
    AndroidxEmoji2(CodePoints.toString(0x1F4A0), listOf("diamond_shape_with_a_dot_inside")),
    AndroidxEmoji2(CodePoints.toString(0x1F518), listOf("radio_button")),
    AndroidxEmoji2(CodePoints.toString(0x1F533), listOf("white_square_button")),
    AndroidxEmoji2(CodePoints.toString(0x1F532), listOf("black_square_button")),
  )
}
