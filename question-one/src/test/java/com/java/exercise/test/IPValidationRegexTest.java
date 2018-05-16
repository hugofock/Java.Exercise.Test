package com.java.exercise.test;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;

public class IPValidationRegexTest {
    @Test
    public void validateIpAddress() throws Exception {
        assertThat(IPValidationRegex.filterInvalidIpAddress("src/test/resources/IPAddress.txt"))
                .containsExactlyElementsOf(newArrayList("-1.2.3.4", "3...3", "2000.1.1.1"));
    }
}