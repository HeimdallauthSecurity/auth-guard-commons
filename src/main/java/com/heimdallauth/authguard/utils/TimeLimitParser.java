package com.heimdallauth.authguard.utils;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeLimitParser {

    private static final Pattern TIME_LIMIT_PATTERN = Pattern.compile("(\\d+)([a-zA-Z]+)");

    public static Instant parseTimeLimit(String timeLimit) {
        ChronoUnit timeUnit;
        Matcher matcher = TIME_LIMIT_PATTERN.matcher(timeLimit);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid time limit format");
        }

        String unit = matcher.group(2).toLowerCase();
        timeUnit = switch (unit) {
            case "s" -> ChronoUnit.SECONDS;
            case "m" -> ChronoUnit.MINUTES;
            case "h" -> ChronoUnit.HOURS;
            case "d" -> ChronoUnit.DAYS;
            default -> throw new IllegalArgumentException("Unknown time unit: " + unit);
        };
        return Instant.now().plus(Long.parseLong(matcher.group(1)), timeUnit);
    }
}