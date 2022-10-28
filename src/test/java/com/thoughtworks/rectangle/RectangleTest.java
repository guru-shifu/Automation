
package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class RectangleTest {
    
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsPositive(){
        Rectangle rectangle = new Rectangle(2 , 5);
        int area = rectangle.area();
        assertThat(area, is(equalTo(10)));
    }

}
