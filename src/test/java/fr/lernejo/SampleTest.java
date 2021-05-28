package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    static final Sample s = new Sample();

    @org.junit.jupiter.api.Test
    void Add_simple() {
        assertEquals(2, s.op(Sample.Operation.ADD, 1,1));
    }

    @org.junit.jupiter.api.Test
    void Add_negative() {
        assertEquals(-10, s.op(Sample.Operation.ADD, 10,-20));
    }

    @org.junit.jupiter.api.Test
    void Mult_simple() {
        assertEquals(2, s.op(Sample.Operation.MULT, 1,2));
    }

    @org.junit.jupiter.api.Test
    void Mult_simple2() {
        assertEquals(100, s.op(Sample.Operation.MULT, 10,10));
    }

    @org.junit.jupiter.api.Test
    void Fact_zero() {
        assertEquals(1, new Sample().fact(0));
    }

    @org.junit.jupiter.api.Test
    void Fact_ten() {
        assertEquals(3628800, new Sample().fact(10));
    }

    @org.junit.jupiter.api.Test
    void Fact_negative() {
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-10));
    }
}
