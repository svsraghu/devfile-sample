package com.example.raghu;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @PostMapping("/check")
    public Boolean checkInventory(@RequestBody Inventory inventory) {
    if(inventory.getProductName().equalsIgnoreCase("soap")) {
        return true;
    } else if(inventory.getProductName().equalsIgnoreCase("fruits")) {
        return false;
    }
    return false;
    }
 }
