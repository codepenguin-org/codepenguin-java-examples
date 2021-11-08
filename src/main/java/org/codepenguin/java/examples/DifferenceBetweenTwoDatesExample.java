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

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.logging.Logger;

import static java.time.Month.DECEMBER;
import static java.time.Month.JUNE;
import static java.util.logging.Level.INFO;

/**
 * Example about how to get the difference between two dates.
 *
 * @author Jorge Garcia
 * @version 1.0
 * @since 11
 */
public final class DifferenceBetweenTwoDatesExample {

    public static final Logger LOGGER = Logger.getLogger(DifferenceBetweenTwoDatesExample.class.getName());

    /**
     * Main method.
     *
     * @param args Arguments.
     */
    public static void main(String[] args) {
        final var startDateTime = LocalDateTime.of(2021, JUNE, 16,
                23, 45, 32);
        final var endDateTime = LocalDateTime.of(2021, DECEMBER, 27,
                15, 31, 6);

        final var duration = Duration.between(startDateTime, endDateTime);
        LOGGER.log(INFO, "Minutes = {0}", duration.toMinutes());
    }
}
