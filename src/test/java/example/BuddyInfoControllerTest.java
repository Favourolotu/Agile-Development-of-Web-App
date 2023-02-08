package example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class BuddyInfoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
    @Test
    public void getBuddy() throws Exception {/*

        this.mockMvc.perform(put("/addressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("\"id\""));

        this.mockMvc.perform(post("/buddy?bookId=1").contentType(MediaType.APPLICATION_JSON).content("{\n" +
                "\t\"name\":\"Raymond\"" +
                "}")).andDo(print()).andExpect(status().isOk());

        this.mockMvc.perform(get("/buddy?bookId=1&buddyId=1")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("\"name\":\"Raymond\""));

    }

    @Test
    public void addBuddy() throws Exception {/*

        this.mockMvc.perform(put("/addressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("\"id\""));

        this.mockMvc.perform(post("/buddy?bookId=1").contentType(MediaType.APPLICATION_JSON).content("{\n" +
                "\t\"name\":\"Bailey\"" +
                "}")).andDo(print()).andExpect(status().isOk());

    }

    @Test
    public void removeBuddy() throws Exception {/*

        this.mockMvc.perform(post("/addressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("\"id\""));

        this.mockMvc.perform(post("/buddy?bookId=1").contentType(MediaType.APPLICATION_JSON).content("{\n" +
                "\t\"name\":\"Babak\"" + "}")).andDo(print()).andExpect(status().isOk());

        this.mockMvc.perform(delete("/buddy?bookId=1&buddyId=1")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("\"name\":\"Babak\""));


    }
*/


}
