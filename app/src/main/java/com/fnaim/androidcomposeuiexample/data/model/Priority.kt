package com.fnaim.androidcomposeuiexample.data.model

import androidx.compose.ui.graphics.Color
import com.fnaim.androidcomposeuiexample.ui.theme.HighPriorityColor
import com.fnaim.androidcomposeuiexample.ui.theme.LowPriorityColor
import com.fnaim.androidcomposeuiexample.ui.theme.MediumPriorityColor
import com.fnaim.androidcomposeuiexample.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}