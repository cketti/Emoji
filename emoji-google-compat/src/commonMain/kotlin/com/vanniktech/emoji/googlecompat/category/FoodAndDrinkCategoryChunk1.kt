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

package com.vanniktech.emoji.googlecompat.category

import com.vanniktech.emoji.googlecompat.GoogleCompatEmoji
import de.cketti.codepoints.CodePoints

internal object FoodAndDrinkCategoryChunk1 {
  internal val EMOJIS: List<GoogleCompatEmoji> = listOf(
    GoogleCompatEmoji(CodePoints.toString(0x1F370), listOf("cake")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9C1), listOf("cupcake")),
    GoogleCompatEmoji(CodePoints.toString(0x1F967), listOf("pie")),
    GoogleCompatEmoji(CodePoints.toString(0x1F36B), listOf("chocolate_bar")),
    GoogleCompatEmoji(CodePoints.toString(0x1F36C), listOf("candy")),
    GoogleCompatEmoji(CodePoints.toString(0x1F36D), listOf("lollipop")),
    GoogleCompatEmoji(CodePoints.toString(0x1F36E), listOf("custard")),
    GoogleCompatEmoji(CodePoints.toString(0x1F36F), listOf("honey_pot")),
    GoogleCompatEmoji(CodePoints.toString(0x1F37C), listOf("baby_bottle")),
    GoogleCompatEmoji(CodePoints.toString(0x1F95B), listOf("glass_of_milk")),
    GoogleCompatEmoji(CodePoints.toString(0x2615), listOf("coffee")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAD6), listOf("teapot")),
    GoogleCompatEmoji(CodePoints.toString(0x1F375), listOf("tea")),
    GoogleCompatEmoji(CodePoints.toString(0x1F376), listOf("sake")),
    GoogleCompatEmoji(CodePoints.toString(0x1F37E), listOf("champagne")),
    GoogleCompatEmoji(CodePoints.toString(0x1F377), listOf("wine_glass")),
    GoogleCompatEmoji(CodePoints.toString(0x1F378), listOf("cocktail")),
    GoogleCompatEmoji(CodePoints.toString(0x1F379), listOf("tropical_drink")),
    GoogleCompatEmoji(CodePoints.toString(0x1F37A), listOf("beer")),
    GoogleCompatEmoji(CodePoints.toString(0x1F37B), listOf("beers")),
    GoogleCompatEmoji(CodePoints.toString(0x1F942), listOf("clinking_glasses")),
    GoogleCompatEmoji(CodePoints.toString(0x1F943), listOf("tumbler_glass")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAD7), listOf("pouring_liquid")),
    GoogleCompatEmoji(CodePoints.toString(0x1F964), listOf("cup_with_straw")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9CB), listOf("bubble_tea")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9C3), listOf("beverage_box")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9C9), listOf("mate_drink")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9CA), listOf("ice_cube")),
    GoogleCompatEmoji(CodePoints.toString(0x1F962), listOf("chopsticks")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F37D),
      shortcodes = listOf("knife_fork_plate"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F37D, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1F374), listOf("fork_and_knife")),
    GoogleCompatEmoji(CodePoints.toString(0x1F944), listOf("spoon")),
    GoogleCompatEmoji(CodePoints.toString(0x1F52A), listOf("hocho", "knife")),
    GoogleCompatEmoji(CodePoints.toString(0x1FAD9), listOf("jar")),
    GoogleCompatEmoji(CodePoints.toString(0x1F3FA), listOf("amphora")),
  )
}
