/*
 * MIT License
 *
 * Copyright (c) 2021 codepenguin.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.codepenguin.java.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferenceBetweenTwoDatesExampleTest {

    private DifferenceBetweenTwoDatesExample example;

    @BeforeEach
    void setUp() {
        example = new DifferenceBetweenTwoDatesExample();
    }

    @Test
    void calculateDifferenceInMinutes() throws ParseException {
        final var format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final var startDate = format.parse("2021-07-23 14:12:31");
        final var endDate = format.parse("2021-12-04 23:28:15");
        final var minutes = example.calculateDifferenceInMinutes(startDate, endDate);

        assertEquals(193515, minutes);
    }
}