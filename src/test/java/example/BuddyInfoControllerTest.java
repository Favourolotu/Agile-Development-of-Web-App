package example;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class BuddyInfoControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    /**
     * Serves as an integration test as it touches all aspects of the required functionality
     */
    public void testAddGetBuddyInfo() throws Exception {
        this.mockMvc.perform(post("/addBuddyInfo?name=Ray")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Ray")));

        this.mockMvc.perform(get("/getBuddyInfo?id=1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Ray")));
    }



}
