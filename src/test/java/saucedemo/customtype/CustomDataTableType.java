package saucedemo.customtype;

import io.cucumber.java.DataTableType;
import saucedemo.domainobjects.BillingDetails;

import java.util.Map;

public class CustomDataTableType {
    @DataTableType
    public BillingDetails billingDetailsEntry(Map<String,String> entry)
    {
        return new BillingDetails(entry.get("firstname"),
                entry.get("lastname"),
                entry.get("zip"));
    }
}
