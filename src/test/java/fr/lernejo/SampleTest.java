package fr.lernejo;
import fr.lernejo.Sample;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class SampleTest {
    private Sample sample;
    @BeforeEach
    public void setUp() throws Exception{
        sample = new Sample();
    }
    @Test
    void operation_add_should_succeed() {
        int a = 7;
        int b = 3;
        int result;
        result = sample.op(Sample.Operation.ADD, a,b);
        Assertions.assertThat(result).as("check if 7+3 equal 10")
            .isEqualTo(10);
    }
}
