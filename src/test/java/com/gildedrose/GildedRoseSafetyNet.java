package com.gildedrose;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GildedRoseSafetyNet {

    @Test
    public void should_always_generate_outpu_identical_to_baseline() throws IOException {
        String baseline  = Files.toString(new File("src/test/baseline.txt"), Charsets.UTF_8);
        assertThat(TexttestFixture.generateBaseLine(), is(baseline));
    }
}
