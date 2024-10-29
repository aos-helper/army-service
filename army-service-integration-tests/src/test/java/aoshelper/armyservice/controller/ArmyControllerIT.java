package aoshelper.armyservice.controller;


import aoshelper.armyservice.service.ArmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ArmyControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ArmyService armyService;
}
