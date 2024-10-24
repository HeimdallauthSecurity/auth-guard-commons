package com.heimdallauth.authguard.utils;

import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import static org.junit.jupiter.api.Assertions.*;

class TimeLimitParserTest {

    @Test
    void parseTimeLimit_validSeconds() {
        Instant now = Instant.now();
        Instant expected = now.plus(30, ChronoUnit.SECONDS);
        Instant result = TimeLimitParser.parseTimeLimit("30s");
        assertTrue(Math.abs(result.getEpochSecond() - expected.getEpochSecond()) < 1);
    }

    @Test
    void parseTimeLimit_validMinutes() {
        Instant now = Instant.now();
        Instant expected = now.plus(45, ChronoUnit.MINUTES);
        Instant result = TimeLimitParser.parseTimeLimit("45m");
        assertTrue(Math.abs(result.getEpochSecond() - expected.getEpochSecond()) < 1);
    }

    @Test
    void parseTimeLimit_validHours() {
        Instant now = Instant.now();
        Instant expected = now.plus(12, ChronoUnit.HOURS);
        Instant result = TimeLimitParser.parseTimeLimit("12h");
        assertTrue(Math.abs(result.getEpochSecond() - expected.getEpochSecond()) < 1);
    }

    @Test
    void parseTimeLimit_validDays() {
        Instant now = Instant.now();
        Instant expected = now.plus(7, ChronoUnit.DAYS);
        Instant result = TimeLimitParser.parseTimeLimit("7d");
        assertTrue(Math.abs(result.getEpochSecond() - expected.getEpochSecond()) < 1);
    }


    @Test
    void parseTimeLimit_invalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> TimeLimitParser.parseTimeLimit("48"));
    }

    @Test
    void parseTimeLimit_invalidUnit() {
        assertThrows(IllegalArgumentException.class, () -> TimeLimitParser.parseTimeLimit("10x"));
    }

    @Test
    void parseTimeLimit_emptyString() {
        assertThrows(IllegalArgumentException.class, () -> TimeLimitParser.parseTimeLimit(""));
    }

    @Test
    void parseTimeLimit_nullString() {
        assertThrows(NullPointerException.class, () -> TimeLimitParser.parseTimeLimit(null));
    }
}