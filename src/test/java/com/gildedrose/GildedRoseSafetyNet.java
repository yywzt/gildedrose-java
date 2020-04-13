package com.gildedrose;

import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @Author yanzhitao@xiaomalixing.com
 * @Date 2020/4/13 11:36
 * @Description
 */
public class GildedRoseSafetyNet {

    @Test
    public void should_output_string_equals_baseline_string() throws IOException {
        String result = Files.toString(new File("src/test/java/result.txt"), UTF_8);
        assertThat(TexttestFixture.test_update_quality(), is(result));
    }
}
