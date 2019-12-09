package com.cursor.hw4.task1.spaceshape;

import com.cursor.hw4.task1.interfaces.AreaMeasurable;
import com.cursor.hw4.task1.interfaces.Shape;
import com.cursor.hw4.task1.interfaces.VolumeMeasurable;

abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    Double depth;
}
