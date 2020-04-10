package com.gildedrose;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GildedRoseSafetyNet {

    @Test
    public void should_output_string_eqlas_baseline() throws IOException {
        String baseline = Files.toString(new File("src/test/baseline.txt"),Charsets.UTF_8);
        assertThat(TexttestFixture.getOutputString(),is(baseline));
    }
}
