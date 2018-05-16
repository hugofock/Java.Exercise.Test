package com.java.exercise.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public final class IPValidationRegex {

    public static List<String> filterInvalidIpAddress(final String filePath) {
        final Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        final List<String> invalidIPAddress = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(filePath), Charset.defaultCharset())) {

            lines.forEachOrdered(line ->
                    {
                        if (!pattern.matcher(line).matches()) {
                            invalidIPAddress.add(line);
                        }
                    }

            );
        } catch (IOException e) {
            throw new RuntimeException("Read File Error.", e);
        }

        return invalidIPAddress;
    }
}
