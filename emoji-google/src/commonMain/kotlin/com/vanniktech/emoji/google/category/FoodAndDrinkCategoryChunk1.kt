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

package com.vanniktech.emoji.google.category

import com.vanniktech.emoji.google.GoogleEmoji
import de.cketti.codepoints.CodePoints

internal object FoodAndDrinkCategoryChunk1 {
  internal val EMOJIS: List<GoogleEmoji> = listOf(
    GoogleEmoji(CodePoints.toString(0x1F370), listOf("cake"), 6, 44),
    GoogleEmoji(CodePoints.toString(0x1F9C1), listOf("cupcake"), 46, 39),
    GoogleEmoji(CodePoints.toString(0x1F967), listOf("pie"), 44, 23),
    GoogleEmoji(CodePoints.toString(0x1F36B), listOf("chocolate_bar"), 6, 39),
    GoogleEmoji(CodePoints.toString(0x1F36C), listOf("candy"), 6, 40),
    GoogleEmoji(CodePoints.toString(0x1F36D), listOf("lollipop"), 6, 41),
    GoogleEmoji(CodePoints.toString(0x1F36E), listOf("custard"), 6, 42),
    GoogleEmoji(CodePoints.toString(0x1F36F), listOf("honey_pot"), 6, 43),
    GoogleEmoji(CodePoints.toString(0x1F37C), listOf("baby_bottle"), 6, 56),
    GoogleEmoji(CodePoints.toString(0x1F95B), listOf("glass_of_milk"), 44, 11),
    GoogleEmoji(CodePoints.toString(0x2615), listOf("coffee"), 58, 16),
    GoogleEmoji(CodePoints.toString(0x1FAD6), listOf("teapot"), 56, 24),
    GoogleEmoji(CodePoints.toString(0x1F375), listOf("tea"), 6, 49),
    GoogleEmoji(CodePoints.toString(0x1F376), listOf("sake"), 6, 50),
    GoogleEmoji(CodePoints.toString(0x1F37E), listOf("champagne"), 6, 58),
    GoogleEmoji(CodePoints.toString(0x1F377), listOf("wine_glass"), 6, 51),
    GoogleEmoji(CodePoints.toString(0x1F378), listOf("cocktail"), 6, 52),
    GoogleEmoji(CodePoints.toString(0x1F379), listOf("tropical_drink"), 6, 53),
    GoogleEmoji(CodePoints.toString(0x1F37A), listOf("beer"), 6, 54),
    GoogleEmoji(CodePoints.toString(0x1F37B), listOf("beers"), 6, 55),
    GoogleEmoji(CodePoints.toString(0x1F942), listOf("clinking_glasses"), 43, 49),
    GoogleEmoji(CodePoints.toString(0x1F943), listOf("tumbler_glass"), 43, 50),
    GoogleEmoji(CodePoints.toString(0x1FAD7), listOf("pouring_liquid"), 56, 25),
    GoogleEmoji(CodePoints.toString(0x1F964), listOf("cup_with_straw"), 44, 20),
    GoogleEmoji(CodePoints.toString(0x1F9CB), listOf("bubble_tea"), 46, 49),
    GoogleEmoji(CodePoints.toString(0x1F9C3), listOf("beverage_box"), 46, 41),
    GoogleEmoji(CodePoints.toString(0x1F9C9), listOf("mate_drink"), 46, 47),
    GoogleEmoji(CodePoints.toString(0x1F9CA), listOf("ice_cube"), 46, 48),
    GoogleEmoji(CodePoints.toString(0x1F962), listOf("chopsticks"), 44, 18),
    GoogleEmoji(
      unicode = CodePoints.toString(0x1F37D),
      shortcodes = listOf("knife_fork_plate"),
      x = 6,
      y = 57,
      variants = listOf(
        GoogleEmoji(CodePoints.toString(0x1F37D, 0xFE0F), emptyList(), 6, 57),
      ),
    ),
    GoogleEmoji(CodePoints.toString(0x1F374), listOf("fork_and_knife"), 6, 48),
    GoogleEmoji(CodePoints.toString(0x1F944), listOf("spoon"), 43, 51),
    GoogleEmoji(CodePoints.toString(0x1F52A), listOf("hocho", "knife"), 30, 34),
    GoogleEmoji(CodePoints.toString(0x1FAD9), listOf("jar"), 56, 27),
    GoogleEmoji(CodePoints.toString(0x1F3FA), listOf("amphora"), 10, 50),
  )
}
