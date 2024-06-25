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

package com.vanniktech.emoji.twitter.category

import com.vanniktech.emoji.twitter.TwitterEmoji
import de.cketti.codepoints.CodePoints

internal object SymbolsCategoryChunk2 {
  internal val EMOJIS: List<TwitterEmoji> = listOf(
    TwitterEmoji(CodePoints.toString(0x1F7E8), listOf("large_yellow_square"), 39, 18),
    TwitterEmoji(CodePoints.toString(0x1F7E9), listOf("large_green_square"), 39, 19),
    TwitterEmoji(CodePoints.toString(0x1F7E6), listOf("large_blue_square"), 39, 16),
    TwitterEmoji(CodePoints.toString(0x1F7EA), listOf("large_purple_square"), 39, 20),
    TwitterEmoji(CodePoints.toString(0x1F7EB), listOf("large_brown_square"), 39, 21),
    TwitterEmoji(CodePoints.toString(0x2B1B), listOf("black_large_square"), 60, 50),
    TwitterEmoji(CodePoints.toString(0x2B1C), listOf("white_large_square"), 60, 51),
    TwitterEmoji(
      unicode = CodePoints.toString(0x25FC),
      shortcodes = listOf("black_medium_square"),
      x = 58,
      y = 5,
      variants = listOf(
        TwitterEmoji(CodePoints.toString(0x25FC, 0xFE0F), emptyList(), 58, 5),
      ),
    ),
    TwitterEmoji(
      unicode = CodePoints.toString(0x25FB),
      shortcodes = listOf("white_medium_square"),
      x = 58,
      y = 4,
      variants = listOf(
        TwitterEmoji(CodePoints.toString(0x25FB, 0xFE0F), emptyList(), 58, 4),
      ),
    ),
    TwitterEmoji(CodePoints.toString(0x25FE), listOf("black_medium_small_square"), 58, 7),
    TwitterEmoji(CodePoints.toString(0x25FD), listOf("white_medium_small_square"), 58, 6),
    TwitterEmoji(
      unicode = CodePoints.toString(0x25AA),
      shortcodes = listOf("black_small_square"),
      x = 58,
      y = 0,
      variants = listOf(
        TwitterEmoji(CodePoints.toString(0x25AA, 0xFE0F), emptyList(), 58, 0),
      ),
    ),
    TwitterEmoji(
      unicode = CodePoints.toString(0x25AB),
      shortcodes = listOf("white_small_square"),
      x = 58,
      y = 1,
      variants = listOf(
        TwitterEmoji(CodePoints.toString(0x25AB, 0xFE0F), emptyList(), 58, 1),
      ),
    ),
    TwitterEmoji(CodePoints.toString(0x1F536), listOf("large_orange_diamond"), 30, 46),
    TwitterEmoji(CodePoints.toString(0x1F537), listOf("large_blue_diamond"), 30, 47),
    TwitterEmoji(CodePoints.toString(0x1F538), listOf("small_orange_diamond"), 30, 48),
    TwitterEmoji(CodePoints.toString(0x1F539), listOf("small_blue_diamond"), 30, 49),
    TwitterEmoji(CodePoints.toString(0x1F53A), listOf("small_red_triangle"), 30, 50),
    TwitterEmoji(CodePoints.toString(0x1F53B), listOf("small_red_triangle_down"), 30, 51),
    TwitterEmoji(CodePoints.toString(0x1F4A0), listOf("diamond_shape_with_a_dot_inside"), 28, 16),
    TwitterEmoji(CodePoints.toString(0x1F518), listOf("radio_button"), 30, 16),
    TwitterEmoji(CodePoints.toString(0x1F533), listOf("white_square_button"), 30, 43),
    TwitterEmoji(CodePoints.toString(0x1F532), listOf("black_square_button"), 30, 42),
  )
}
