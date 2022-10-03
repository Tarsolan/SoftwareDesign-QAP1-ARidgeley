package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QAPExampleTest {
    @Test
    public void qapExampleTest1(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.findSequenceInWord("find", "is_find_in_this_char_sequence"));
    }

    @Test
    public void qapExampleTest2(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertFalse(qapExample.findSequenceInWord("find_me", "is_find_in_this_char_sequence"));
    }

    @Test
    public void qapExampleTest3(){
        QAPExample qapExample = new QAPExample();

        Assertions.assertTrue(qapExample.findSequenceInWord("find", "is_jude_in_this_char_sequence"));
    }
}
