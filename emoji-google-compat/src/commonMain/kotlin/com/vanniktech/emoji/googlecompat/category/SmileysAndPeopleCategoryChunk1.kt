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

internal object SmileysAndPeopleCategoryChunk1 {
  internal val EMOJIS: List<GoogleCompatEmoji> = listOf(
    GoogleCompatEmoji(CodePoints.toString(0x1F971), listOf("yawning_face")),
    GoogleCompatEmoji(CodePoints.toString(0x1F624), listOf("triumph")),
    GoogleCompatEmoji(CodePoints.toString(0x1F621), listOf("rage")),
    GoogleCompatEmoji(CodePoints.toString(0x1F620), listOf("angry")),
    GoogleCompatEmoji(CodePoints.toString(0x1F92C), listOf("face_with_symbols_on_mouth", "serious_face_with_symbols_covering_mouth")),
    GoogleCompatEmoji(CodePoints.toString(0x1F608), listOf("smiling_imp")),
    GoogleCompatEmoji(CodePoints.toString(0x1F47F), listOf("imp")),
    GoogleCompatEmoji(CodePoints.toString(0x1F480), listOf("skull")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x2620),
      shortcodes = listOf("skull_and_crossbones"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x2620, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1F4A9), listOf("hankey", "poop", "shit")),
    GoogleCompatEmoji(CodePoints.toString(0x1F921), listOf("clown_face")),
    GoogleCompatEmoji(CodePoints.toString(0x1F479), listOf("japanese_ogre")),
    GoogleCompatEmoji(CodePoints.toString(0x1F47A), listOf("japanese_goblin")),
    GoogleCompatEmoji(CodePoints.toString(0x1F47B), listOf("ghost")),
    GoogleCompatEmoji(CodePoints.toString(0x1F47D), listOf("alien")),
    GoogleCompatEmoji(CodePoints.toString(0x1F47E), listOf("space_invader")),
    GoogleCompatEmoji(CodePoints.toString(0x1F916), listOf("robot_face")),
    GoogleCompatEmoji(CodePoints.toString(0x1F63A), listOf("smiley_cat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F638), listOf("smile_cat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F639), listOf("joy_cat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F63B), listOf("heart_eyes_cat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F63C), listOf("smirk_cat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F63D), listOf("kissing_cat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F640), listOf("scream_cat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F63F), listOf("crying_cat_face")),
    GoogleCompatEmoji(CodePoints.toString(0x1F63E), listOf("pouting_cat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F648), listOf("see_no_evil")),
    GoogleCompatEmoji(CodePoints.toString(0x1F649), listOf("hear_no_evil")),
    GoogleCompatEmoji(CodePoints.toString(0x1F64A), listOf("speak_no_evil")),
    GoogleCompatEmoji(CodePoints.toString(0x1F48C), listOf("love_letter")),
    GoogleCompatEmoji(CodePoints.toString(0x1F498), listOf("cupid")),
    GoogleCompatEmoji(CodePoints.toString(0x1F49D), listOf("gift_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F496), listOf("sparkling_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F497), listOf("heartpulse")),
    GoogleCompatEmoji(CodePoints.toString(0x1F493), listOf("heartbeat")),
    GoogleCompatEmoji(CodePoints.toString(0x1F49E), listOf("revolving_hearts")),
    GoogleCompatEmoji(CodePoints.toString(0x1F495), listOf("two_hearts")),
    GoogleCompatEmoji(CodePoints.toString(0x1F49F), listOf("heart_decoration")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x2763),
      shortcodes = listOf("heavy_heart_exclamation_mark_ornament"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x2763, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1F494), listOf("broken_heart")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x2764, 0x200D, 0x1F525),
      shortcodes = listOf("heart_on_fire"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x2764, 0xFE0F, 0x200D, 0x1F525), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x2764, 0x200D, 0x1FA79),
      shortcodes = listOf("mending_heart"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x2764, 0xFE0F, 0x200D, 0x1FA79), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x2764),
      shortcodes = listOf("heart"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x2764, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1FA77), listOf("pink_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F9E1), listOf("orange_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F49B), listOf("yellow_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F49A), listOf("green_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F499), listOf("blue_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA75), listOf("light_blue_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F49C), listOf("purple_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F90E), listOf("brown_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F5A4), listOf("black_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1FA76), listOf("grey_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F90D), listOf("white_heart")),
    GoogleCompatEmoji(CodePoints.toString(0x1F48B), listOf("kiss")),
    GoogleCompatEmoji(CodePoints.toString(0x1F4AF), listOf("100")),
    GoogleCompatEmoji(CodePoints.toString(0x1F4A2), listOf("anger")),
    GoogleCompatEmoji(CodePoints.toString(0x1F4A5), listOf("boom", "collision")),
    GoogleCompatEmoji(CodePoints.toString(0x1F4AB), listOf("dizzy")),
    GoogleCompatEmoji(CodePoints.toString(0x1F4A6), listOf("sweat_drops")),
    GoogleCompatEmoji(CodePoints.toString(0x1F4A8), listOf("dash")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F573),
      shortcodes = listOf("hole"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F573, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1F4AC), listOf("speech_balloon")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F441, 0x200D, 0x1F5E8),
      shortcodes = listOf("eye-in-speech-bubble"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F441, 0xFE0F, 0x200D, 0x1F5E8, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F5E8),
      shortcodes = listOf("left_speech_bubble"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F5E8, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F5EF),
      shortcodes = listOf("right_anger_bubble"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F5EF, 0xFE0F), emptyList()),
      ),
    ),
    GoogleCompatEmoji(CodePoints.toString(0x1F4AD), listOf("thought_balloon")),
    GoogleCompatEmoji(CodePoints.toString(0x1F4A4), listOf("zzz")),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F44B),
      shortcodes = listOf("wave"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F44B, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44B, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44B, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44B, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44B, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F91A),
      shortcodes = listOf("raised_back_of_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F91A, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91A, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91A, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91A, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91A, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F590, 0xFE0F),
      shortcodes = listOf("raised_hand_with_fingers_splayed"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F590, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F590, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F590, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F590, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F590, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x270B),
      shortcodes = listOf("hand", "raised_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x270B, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270B, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270B, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270B, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270B, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F596),
      shortcodes = listOf("spock-hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F596, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F596, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F596, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F596, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F596, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1FAF1),
      shortcodes = listOf("rightwards_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1FAF1, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF1, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF1, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF1, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF1, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1FAF2),
      shortcodes = listOf("leftwards_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1FAF2, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF2, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF2, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF2, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF2, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1FAF3),
      shortcodes = listOf("palm_down_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1FAF3, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF3, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF3, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF3, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF3, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1FAF4),
      shortcodes = listOf("palm_up_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1FAF4, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF4, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF4, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF4, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF4, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1FAF7),
      shortcodes = listOf("leftwards_pushing_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1FAF7, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF7, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF7, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF7, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF7, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1FAF8),
      shortcodes = listOf("rightwards_pushing_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1FAF8, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF8, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF8, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF8, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF8, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F44C),
      shortcodes = listOf("ok_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F44C, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44C, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44C, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44C, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44C, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F90C),
      shortcodes = listOf("pinched_fingers"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F90C, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F90C, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F90C, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F90C, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F90C, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F90F),
      shortcodes = listOf("pinching_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F90F, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F90F, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F90F, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F90F, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F90F, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x270C, 0xFE0F),
      shortcodes = listOf("v"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x270C, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270C, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270C, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270C, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270C, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F91E),
      shortcodes = listOf("crossed_fingers", "hand_with_index_and_middle_fingers_crossed"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F91E, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91E, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91E, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91E, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91E, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1FAF0),
      shortcodes = listOf("hand_with_index_finger_and_thumb_crossed"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1FAF0, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF0, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF0, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF0, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF0, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F91F),
      shortcodes = listOf("i_love_you_hand_sign"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F91F, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91F, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91F, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91F, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91F, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F918),
      shortcodes = listOf("the_horns", "sign_of_the_horns"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F918, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F918, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F918, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F918, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F918, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F919),
      shortcodes = listOf("call_me_hand"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F919, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F919, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F919, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F919, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F919, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F448),
      shortcodes = listOf("point_left"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F448, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F448, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F448, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F448, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F448, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F449),
      shortcodes = listOf("point_right"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F449, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F449, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F449, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F449, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F449, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F446),
      shortcodes = listOf("point_up_2"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F446, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F446, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F446, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F446, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F446, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F595),
      shortcodes = listOf("middle_finger", "reversed_hand_with_middle_finger_extended"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F595, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F595, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F595, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F595, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F595, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F447),
      shortcodes = listOf("point_down"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F447, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F447, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F447, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F447, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F447, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x261D, 0xFE0F),
      shortcodes = listOf("point_up"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x261D, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x261D, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x261D, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x261D, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x261D, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1FAF5),
      shortcodes = listOf("index_pointing_at_the_viewer"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1FAF5, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF5, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF5, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF5, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1FAF5, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F44D),
      shortcodes = listOf("+1", "thumbsup"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F44D, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44D, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44D, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44D, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44D, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F44E),
      shortcodes = listOf("-1", "thumbsdown"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F44E, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44E, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44E, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44E, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44E, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x270A),
      shortcodes = listOf("fist"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x270A, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270A, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270A, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270A, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x270A, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F44A),
      shortcodes = listOf("facepunch", "punch"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F44A, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44A, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44A, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44A, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F44A, 0x1F3FF), emptyList()),
      ),
    ),
    GoogleCompatEmoji(
      unicode = CodePoints.toString(0x1F91B),
      shortcodes = listOf("left-facing_fist"),
      variants = listOf(
        GoogleCompatEmoji(CodePoints.toString(0x1F91B, 0x1F3FB), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91B, 0x1F3FC), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91B, 0x1F3FD), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91B, 0x1F3FE), emptyList()),
        GoogleCompatEmoji(CodePoints.toString(0x1F91B, 0x1F3FF), emptyList()),
      ),
    ),
  )
}
