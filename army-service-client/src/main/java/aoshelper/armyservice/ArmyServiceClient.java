package aoshelper.armyservice;

import aoshelper.common.armyservice.model.Army;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "army-service")
public interface ArmyServiceClient extends ArmyServiceApi {

    @GetMapping("/api/army/names")
    List<String> getNames();

    @GetMapping("/api/army/details")
    Army getArmyDetails(String name);
}
