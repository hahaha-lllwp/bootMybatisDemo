package com.example.demomybatis;
import com.example.controller.WebController;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
public class HelloTest {

    private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();

//    @Before
//    public void setUp() throws Exception {
//        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
//    }

    @Test
    public void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/user")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print());
    }

    @Test
    public void saveUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                .param("id",String.valueOf(-1))
                .param("name","")
                .param("age","666")
                .param("password","test")
        ).andDo(print());
    }
}
