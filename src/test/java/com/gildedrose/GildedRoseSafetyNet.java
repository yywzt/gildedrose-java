package com.gildedrose;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.sun.tracing.dtrace.ArgsAttributes;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GildedRoseSafetyNet {

    @Test
    public void should_always_output_string_to_equals_baseline() throws IOException {
        String baseline = Files.toString(new File("src/test/baseline.txt"), Charsets.UTF_8);
        assertThat(TexttestFixture.getOutputBaseline(),is(baseline));
    }
}
